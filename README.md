# Aplicaciones en Kotlin por Consola

## 1. Descripción

Este repositorio contiene dos aplicaciones desarrolladas en Kotlin que funcionan desde consola:

* **Gestor de Tareas (To-Do CLI):** Permite administrar tareas mediante operaciones CRUD.
* **Trivia de Kotlin:** Juego interactivo de preguntas donde el usuario pone a prueba sus conocimientos y obtiene un puntaje final.

---

## 2. Requisitos

* Kotlin 1.9 o superior
* Java JDK 8 o superior
* Terminal o consola

---

## 3. Instalación y Ejecución

### Clonar repositorio

git clone https://github.com/TU_USUARIO/kotlin-todo-cli.git

cd kotlin-todo-cli

---

### ▶ Ejecutar Gestor de Tareas

Compilar:
kotlinc Main.kt Tarea.kt GestorTareas.kt -include-runtime -d GestorTareas.jar

Ejecutar:
java -jar GestorTareas.jar

---

### ▶ Ejecutar Trivia de Kotlin

Compilar:
kotlinc Trivia.kt BancoPreguntas.kt Pregunta.kt -include-runtime -d Trivia.jar

Ejecutar:
java -jar Trivia.jar

---

## 4. Funcionalidades Principales

### 📝 Gestor de Tareas

* Agregar tareas
* Listar tareas
* Marcar tareas como completadas
* Eliminar tareas
* Estadísticas de uso

### 🧩 Trivia de Kotlin

* Preguntas aleatorias usando `.shuffled()`
* Validación de respuestas del usuario
* Sistema de puntaje
* Retroalimentación inmediata (Correcto / Incorrecto)
* Evaluación final según desempeño

---

## 5. Ejemplo de Uso

### Trivia

===================================
TRIVIA DE KOTLIN
================

Responde escribiendo el número de la opción correcta.

1. ¿Qué palabra clave define una constante en Kotlin?
2. var
3. const val
4. val
5. let

Tu respuesta: 2
Correcto

---

## 6. Conceptos de Kotlin Aplicados

| Requisito                         | Implementación                                              |
| --------------------------------- | ----------------------------------------------------------- |
| Funciones, condicionales y ciclos | Uso de `when`, `if`, `forEach` en `Trivia.kt` y `Main.kt`   |
| Colecciones                       | `MutableList` y `.shuffled()` en `BancoPreguntas.kt`        |
| Null Safety                       | `readLine()?.trim() ?: ""` y `toIntOrNull()` en `Trivia.kt` |
| Data Class                        | `Pregunta.kt` y `Tarea.kt`                                  |
| Operaciones funcionales           | `.forEach`, `.forEachIndexed`, `.shuffled()`                |

---

## 7. Estructura del Proyecto

/kotlin-todo-cli
│
├── Main.kt
├── Tarea.kt
├── GestorTareas.kt
│
├── trivia_preguntas/
│   ├── Trivia.kt
│   ├── BancoPreguntas.kt
│   ├── Pregunta.kt
│
└── README.md

---

## 8. Reflexión de Proceso

### a) ¿Qué fue lo más difícil y cómo lo resolviste?

Uno de los mayores retos fue manejar correctamente la entrada del usuario en consola, especialmente cuando el usuario introduce datos inválidos o vacíos. Esto se resolvió utilizando `toIntOrNull()` junto con el operador Elvis `?:`, evitando errores de ejecución.

### b) ¿Qué concepto aprendiste mejor?

El uso de funciones lambda y operaciones funcionales como `.shuffled()` y `.forEachIndexed`. Inicialmente resultaban confusas, pero al compararlas con ciclos tradicionales se volvió más claro su beneficio en la reducción de código.

### c) ¿Qué mejorarías?

Se podría agregar persistencia de datos mediante archivos JSON o una base de datos como SQLite. También mejorar la trivia con temporizador, más preguntas o niveles de dificultad.

### d) ¿Qué aprendiste haciendo el proyecto?

Aprendí que desarrollar directamente en consola presenta errores reales que no se ven en tutoriales. Esto ayuda a entender mejor la importancia del manejo de errores y la validación de datos.

---

## 9. Mejoras Futuras

* Persistencia de datos
* Interfaz gráfica (GUI)
* Más preguntas en la trivia
* Sistema de niveles o dificultad
* Temporizador para responder preguntas

---

## 10. Autor

Desarrollado como proyecto académico en el Instituto Tecnológico de Cancún.
