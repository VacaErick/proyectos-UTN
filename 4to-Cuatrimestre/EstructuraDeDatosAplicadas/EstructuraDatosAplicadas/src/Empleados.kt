data class Empleados(val noEmp: Int, var nombre: String, var puesto: String, var sueldo: Double) {
    fun muestra() {
        println("Numero: $noEmp, Nombre: $nombre, Puesto: $puesto, Sueldo: $sueldo")
    }
}

val lista = arrayListOf<Empleados>()

fun main() {
    var opcion: Int
    do {
        println("/// MENU DE EMPLEADOS ///")
        println("1) agregar empleado")
        println("2) buscar empleado")
        println("3) modificar empleado")
        println("4) eliminar empleado")
        println("5) consultar todos los empleados")
        println("6) salir")
        print("elige una opcion: ")
        opcion = readln().toIntOrNull() ?: -1
        when (opcion) {
            1 -> {
                try {
                    print("ingresa el numero de empleado: ")
                    val noEmp = readln().toInt()
                    print("dame el nombre: ")
                    val nombre = readln()
                    print("dame el puesto: ")
                    val puesto = readln()
                    print("dame el sueldo: ")
                    val sueldo = readln().toDouble()
                    agregarEmpleado(noEmp, nombre, puesto, sueldo)
                } catch (e: Exception) {
                    println("datos no validos intenta de nuevo")
                }
            }
            2 -> {
                try {
                    print("ingresa el numero de empleado: ")
                    val noEmp = readln().toInt()
                    buscarEmpleado(noEmp)
                } catch (e: Exception) {
                    println("datos invalidos.")
                }
            }
            3 -> {
                try {
                    print("ingresa el numero de empleado a modificar: ")
                    val noEmp = readln().toInt()
                    modificarEmpleado(noEmp)
                } catch (e: Exception) {
                    println("entrada invalida")
                }
            }
            4 -> {
                try {
                    print("ingresa el numero de empleado a eliminar: ")
                    val noEmp = readln().toInt()
                    eliminarEmpleado(noEmp)
                } catch (e: Exception) {
                    println("entrada invalida")
                }
            }
            5 -> consultarEmpleados()
            6 -> println("adios")
            else -> println("opcion invalida")
        }
    } while (opcion != 6)
}

fun agregarEmpleado(noEmp: Int, nombre: String, puesto: String, sueldo: Double) {
    val existe = lista.any { it.noEmp == noEmp }
    if (!existe) {
        lista.add(Empleados(noEmp, nombre, puesto, sueldo))
        println("empleado agregado")
    } else {
        println("el empleado ya existe")
    }
}

fun buscarEmpleado(noEmp: Int) {
    val empleado = lista.find { it.noEmp == noEmp }
    if (empleado != null) {
        empleado.muestra()
    } else {
        println("el empleado con ese numero no existe")
    }
}

fun modificarEmpleado(noEmp: Int) {
    val empleado = lista.find { it.noEmp == noEmp }
    if (empleado != null) {
        println("empleado encontrado ingresa los nuevos datos: ")
        print("ruevo nombre: ")
        empleado.nombre = readln()
        print("ruevo puesto: ")
        empleado.puesto = readln()
        print("ruevo sueldo: ")
        empleado.sueldo = readln().toDoubleOrNull() ?: empleado.sueldo
        println("empleado modificado")
    } else {
        println("el empleado con ese numero no existe")
    }
}

fun eliminarEmpleado(noEmp: Int) {
    val eliminado = lista.removeIf { it.noEmp == noEmp }
    if (eliminado) {
        println("empleado eliminado")
    } else {
        println("no se encontro el empleado")
    }
}

fun consultarEmpleados() {
    if (lista.isEmpty()) {
        println("lista vacia")
    } else {
        lista.forEach { it.muestra() }
    }
}