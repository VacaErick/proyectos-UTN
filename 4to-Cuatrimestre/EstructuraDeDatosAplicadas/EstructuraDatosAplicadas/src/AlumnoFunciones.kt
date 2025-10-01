fun agregarAlumno() {
    try {
        print("ID: ")
        val id = readLine()?.toIntOrNull() ?: return println("ID inválido")

        print("Nombre: ")
        val nombre = readLine() ?: return

        print("Grado: ")
        val grado = readLine() ?: return

        print("Fecha de nacimiento (dd/MM/yyyy): ")
        val fechaStr = readLine()
        val fecha = formatoFecha.parse(fechaStr)

        val alumno = Alumno(id, nombre, grado, fecha)
        listaAlumnos.add(alumno)
        println("Alumno agregado con éxito.")
    } catch (e: Exception) {
        println("Error al agregar alumno: ${e.message}")
    }
}

fun buscarAlumno() {
    print("Ingresa el ID del alumno a buscar: ")
    val id = readLine()?.toIntOrNull() ?: return println("ID inválido")

    val alumno = listaAlumnos.find { it.id == id }
    if (alumno != null) {
        println("Alumno encontrado:")
        mostrarAlumno(alumno)
    } else {
        println("Alumno no encontrado.")
    }
}

fun modificarAlumno() {
    print("Ingresa el ID del alumno a modificar: ")
    val id = readLine()?.toIntOrNull() ?: return println("ID inválido")

    val alumno = listaAlumnos.find { it.id == id }
    if (alumno != null) {
        print("Nuevo nombre (${alumno.nombre}): ")
        val nombreNuevo = readLine()
        if (!nombreNuevo.isNullOrBlank()) alumno.nombre = nombreNuevo

        print("Nuevo grado (${alumno.grado}): ")
        val gradoNuevo = readLine()
        if (!gradoNuevo.isNullOrBlank()) alumno.grado = gradoNuevo

        print("Nueva fecha de nacimiento (dd/MM/yyyy): ")
        val fechaNuevaStr = readLine()
        if (!fechaNuevaStr.isNullOrBlank()) {
            alumno.fechaNacimiento = formatoFecha.parse(fechaNuevaStr)
        }

        println("Alumno modificado correctamente.")
    } else {
        println("Alumno no encontrado.")
    }
}

fun eliminarAlumno() {
    print("Ingresa el ID del alumno a eliminar: ")
    val id = readLine()?.toIntOrNull() ?: return println("ID inválido")

    val eliminado = listaAlumnos.removeIf { it.id == id }
    if (eliminado) {
        println("Alumno eliminado.")
    } else {
        println("Alumno no encontrado.")
    }
}

fun consultarTodos() {
    if (listaAlumnos.isEmpty()) {
        println("No hay alumnos registrados.")
    } else {
        println("--- Lista de Alumnos ---")
        for (a in listaAlumnos) {
            mostrarAlumno(a)
        }
    }
}

fun mostrarAlumno(a: Alumno) {
    println(
            "ID: ${a.id}, Nombre: ${a.nombre}, Grado: ${a.grado}, Fecha de nacimiento: ${formatoFecha.format(a.fechaNacimiento)}"
    )
}
