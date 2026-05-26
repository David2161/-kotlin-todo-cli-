package trivia_preguntas

class Trivia {

    private val banco = BancoPreguntas()

    fun iniciar() {
        banco.inicializarTrivia()
        val preguntas = banco.obtenerPreguntasDelJuego()
        var puntaje = 0

        println("===================================")
        println("          TRIVIA DE KOTLIN")
        println("===================================")
        println("Responde escribiendo el número de la opción correcta.")
        println("Total de preguntas: ${banco.contarPreguntas()}")
        println()

        preguntas.forEach { pregunta ->
            mostrarPregunta(pregunta)

            print("Tu respuesta: ")

            // Null safety: evita error si el usuario no escribe nada
            val entrada = readLine()?.trim() ?: ""
            val respuestaUsuario = entrada.toIntOrNull()

            if (respuestaUsuario == pregunta.respuestaCorrecta) {
                println("Correcto")
                puntaje++
            } else {
                println("Incorrecto. La respuesta correcta era: ${pregunta.respuestaCorrecta}")
            }

            println()
        }

        mostrarResultado(puntaje, preguntas.size)
    }

    private fun mostrarPregunta(pregunta: Pregunta) {
        println("${pregunta.id}. ${pregunta.enunciado}")

        pregunta.opciones.forEachIndexed { index, opcion ->
            println("${index + 1}. $opcion")
        }
    }

    private fun mostrarResultado(puntaje: Int, total: Int) {
        println("===================================")
        println("              RESULTADO")
        println("===================================")
        println("Puntaje final: $puntaje de $total")

        when {
            puntaje == total -> println("Excelente. Contestaste todo correctamente.")
            puntaje >= total / 2 -> println("Buen resultado. Vas entendiendo Kotlin.")
            else -> println("Necesitas repasar más los conceptos básicos.")
        }
    }
}