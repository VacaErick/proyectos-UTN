import java.text.SimpleDateFormat
import java.util.*

data class Vacante(
        var id: Int,
        var titulo: String,
        var empresa: String,
        var fechaPublicacion: Date
)

val listaVacantes = arrayListOf<Vacante>()
val formatoFecha = SimpleDateFormat("dd/MM/yyyy")

fun main() {
    var opcion: String?

    do {
        println("\nMenu de Vacantes")
        println("1. Agregar Vacante")
        println("2. Buscar Vacante")
        println("3. Modificar Vacante")
        println("4. Eliminar Vacante")
        println("5. Consultar Todas las Vacantes")
        println("6. Salir")
        print("Elige una opción: ")
        opcion = readLine()

        when (opcion) {
            "1" -> agregarVacante()
            "2" -> buscarVacante()
            "3" -> modificarVacante()
            "4" -> eliminarVacante()
            "5" -> consultarVacantes()
            "6" -> println("Saliendo del sistema...")
            else -> println("Opción no válida.")
        }
    } while (opcion != "6")
}
