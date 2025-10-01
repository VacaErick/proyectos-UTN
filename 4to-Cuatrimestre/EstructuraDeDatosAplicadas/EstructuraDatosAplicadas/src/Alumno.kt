import java.text.SimpleDateFormat
import java.util.*

data class Alumno(var id: Int, var nombre: String, var grado: String, var fechaNacimiento: Date)

val listaAlumnos = arrayListOf<Alumno>()
val formatoFechaNacimiento = SimpleDateFormat("dd/MM/yyyy")
