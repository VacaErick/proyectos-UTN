fun main() {
    val pila = PilaDinamica()
    var opcion: String?

    do {
        println("\nOPERACIONES EN LA PILA")
        println("1) METER")
        println("2) SACAR")
        println("3) MOSTRAR")
        println("4) SALIR")
        print("ELIGE UNA OPCIÓN: ")
        opcion = readLine()

        when (opcion) {
            "1" -> {
                print("Ingresa el número a meter: ")
                val entrada = readLine()
                val numero = entrada?.toIntOrNull()
                if (numero != null) {
                    pila.meter(numero)
                } else {
                    println("Entrada no válida.")
                }
            }
            "2" -> {
                try {
                    val elemento = pila.sacar()
                    println("Elemento sacado: $elemento")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            "3" -> pila.mostrar()
            "4" -> println("Saliendo del programa...")
            else -> println("Opción inválida. Intenta de nuevo.")
        }
    } while (opcion != "4")
}
