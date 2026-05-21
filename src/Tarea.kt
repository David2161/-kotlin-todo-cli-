/**
 * Representa una tarea dentro del sistema.
 * @property id Identificador único autoincremental.
 * @property descripcion Detalle de lo que se debe hacer.
 * @property completada Estado actual de la tarea.
 */
data class Tarea(
    val id: Int,
    val descripcion: String,
    var completada: Boolean = false
)