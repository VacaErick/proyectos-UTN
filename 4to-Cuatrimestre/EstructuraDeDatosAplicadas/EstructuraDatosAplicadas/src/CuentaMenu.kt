fun main() {
    val cuenta = Cuenta("01-8547-9", "Alberto Palma", 5000.0)
    var opcion: String?

    do {
        println("MENÚ DE OPERACIONES")
        println("1) Depositar")
        println("2) Retirar")
        println("Cualquier otra tecla para salir")
        print("Elige una opción: ")
        opcion = readLine()

        when (opcion) {
            "1" -> {
                print("Ingresa el monto a depositar: ")
                val entrada = readLine()
                val monto = entrada?.toDoubleOrNull()
                if (monto != null && monto > 0) {
                    cuenta.depositar(monto)
                } else {
                    println("Monto incorrecto.\n")
                }
            }
            "2" -> {
                print("Ingresa el monto a retirar: ")
                val entrada = readLine()
                val monto = entrada?.toDoubleOrNull()
                if (monto != null && monto > 0) {
                    cuenta.retirar(monto)
                } else {
                    println("Monto incorrecto.\n")
                }
            }
            else -> println("Saliendo del programa. Gracias por usar el sistema.")
        }
    } while (opcion == "1" || opcion == "2")
}
