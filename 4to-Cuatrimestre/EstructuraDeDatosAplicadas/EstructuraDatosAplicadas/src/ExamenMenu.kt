import java.text.SimpleDateFormat

fun main() {
    val listaAutos = ListaAutos()
    val sdf = SimpleDateFormat("dd/MM/yyyy")
    var opcion: String?

    while (true) {
        println("\nMENU DE OPCIONES:")
        println("1) agregar auto")
        println("2) modificar auto")
        println("3) eliminar auto")
        println("4) consultar auto")
        println("5) salir")
        print("seleccione una opcion: ")
        opcion = readLine()
        when (opcion) {
            "1" -> {
                println("\nAGREGAR AUTO")
                try {
                    print("numero de serie: ")
                    val noserie = readLine()?.toInt()
                    print("marca: ")
                    val marca = readLine()
                    print("modelo: ")
                    val modelo = readLine()
                    print("precio: ")
                    val precio = readLine()?.toDouble()
                    print("fecha (dd/MM/yyyy): ")
                    val fecha = sdf.parse(readLine())

                    listaAutos.agregar(Auto(noserie, marca, modelo, precio, fecha))
                    println("auto agregado exitosamente")
                } catch (e: Exception) {
                    println("datos invalidos verifique el formato")
                }
            }

            "2" -> {
                println("\nMODIFICAR AUTO")
                try {
                    print("numero de serie del auto a modificar: ")
                    val noserie = readLine()?.toInt()

                    print("nueva marca: ")
                    val marca = readLine()
                    print("nuevo modelo: ")
                    val modelo = readLine()
                    print("nuevo precio: ")
                    val precio = readLine()?.toDouble()
                    print("nueva fecha (dd/MM/yyyy): ")
                    val fecha = sdf.parse(readLine())

                    listaAutos.modificar(noserie, Auto(noserie, marca, modelo, precio, fecha))
                    println("auto modificado exitosamente")
                } catch (e: Exception) {
                    println("datos invalidos verifique el formato")
                }
            }

            "3" -> {
                println("\nELIMINAR AUTO")
                try {
                    print("numero de serie del auto a eliminar: ")
                    val noserie = readLine()?.toInt()
                    listaAutos.eliminar(noserie)
                    println("auto eliminado exitosamente")
                } catch (e: Exception) {
                    println("numero de serie invalido")
                }
            }

            "4" -> {
                println("\nCONSULTAR AUTO")
                try {
                    print("numero de serie del auto a consultar: ")
                    val noserie = readLine()?.toInt()
                    listaAutos.consultar(noserie)?.let { println(it) }
                } catch (e: Exception) {
                    println("numero de serie invalido")
                }

            }

            "5" -> {
                println("saliendo del programa...")
                return
            }

            else -> println("opcion invalida intente nuevamente")
        }
    }
}