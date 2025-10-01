fun agregarVacante() {
    try {
        print("ID: ")
        val id = readLine()?.toIntOrNull() ?: return println("ID inválido")

        print("Título: ")
        val titulo = readLine() ?: return

        print("Empresa: ")
        val empresa = readLine() ?: return

        print("Fecha de publicación (dd/MM/yyyy): ")
        val fechaStr = readLine()
        val fecha = formatoFecha.parse(fechaStr)

        val vacante = Vacante(id, titulo, empresa, fecha)
        listaVacantes.add(vacante)
        println("Vacante agregada con éxito.")
    } catch (e: Exception) {
        println("Error al agregar vacante: ${e.message}")
    }
}

fun buscarVacante() {
    print("Ingresa el ID a buscar: ")
    val id = readLine()?.toIntOrNull() ?: return println("ID inválido")

    val vacante = listaVacantes.find { it.id == id }
    if (vacante != null) {
        println("Vacante encontrada: $vacante")
    } else {
        println("No se encontró la vacante.")
    }
}

fun modificarVacante() {
    print("Ingresa el ID de la vacante a modificar: ")
    val id = readLine()?.toIntOrNull() ?: return println("ID inválido")

    val vacante = listaVacantes.find { it.id == id }
    if (vacante != null) {
        print("Nuevo título: ")
        vacante.titulo = readLine() ?: vacante.titulo

        print("Nueva empresa: ")
        vacante.empresa = readLine() ?: vacante.empresa

        print("Nueva fecha (dd/MM/yyyy): ")
        val fechaStr = readLine()
        if (!fechaStr.isNullOrBlank()) {
            vacante.fechaPublicacion = formatoFecha.parse(fechaStr)
        }

        println("Vacante modificada correctamente.")
    } else {
        println("Vacante no encontrada.")
    }
}

fun eliminarVacante() {
    print("Ingresa el ID de la vacante a eliminar: ")
    val id = readLine()?.toIntOrNull() ?: return println("ID inválido")

    val eliminada = listaVacantes.removeIf { it.id == id }
    if (eliminada) {
        println("Vacante eliminada.")
    } else {
        println("No se encontró la vacante.")
    }
}

fun consultarVacantes() {
    if (listaVacantes.isEmpty()) {
        println("No hay vacantes registradas.")
    } else {
        println("--- Lista de Vacantes ---")
        for (v in listaVacantes) {
            println(
                    "ID: ${v.id}, Título: ${v.titulo}, Empresa: ${v.empresa}, Fecha: ${formatoFecha.format(v.fechaPublicacion)}"
            )
        }
    }
}
