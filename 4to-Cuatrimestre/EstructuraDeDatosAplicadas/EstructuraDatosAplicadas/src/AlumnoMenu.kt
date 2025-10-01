fun main() {
    var opcion: String?

    do {
        println("\nMenu De Alumnos")
        println("1. Agregar Alumno")
        println("2. Buscar Alumno")
        println("3. Modificar Alumno")
        println("4. Eliminar Alumno")
        println("5. Consultar Todos Los Alumnos")
        println("6. Salir")
        print("Elige una opción: ")
        opcion = readLine()

        when (opcion) {
            "1" -> agregarAlumno()
            "2" -> buscarAlumno()
            "3" -> modificarAlumno()
            "4" -> eliminarAlumno()
            "5" -> consultarTodos()
            "6" -> println("Saliendo del sistema...")
            else -> println("Opción no válida.")
        }
    } while (opcion != "6")
}
