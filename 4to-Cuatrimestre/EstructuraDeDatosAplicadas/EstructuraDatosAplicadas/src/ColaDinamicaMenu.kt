import kotlin.text.toIntOrNull

fun main() {
    val cola = ColaDinamica()
    var opcion: String?

    do {
        println("OPERACIONES EN LA COLA")
        println("1. METER")
        println("2. SACAR")
        println("3. SALIR")
        println("ELIGE UNA OPCIÓN: ")
        opcion = readLine()

        when (opcion) {
            "1" -> {
                print("Introduce un valor: ")
                val entrada = readLine()
                val numero = entrada?.toIntOrNull()
                if (numero != null) {
                    cola.meter(numero)
                } else {
                    println("Entrada no valida")
                }
            }
            "2" -> {
                try {
                    val elemento = cola.sacar()
                    println("Elemento que sale: $elemento")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            "3" -> println("Saliendo del programa...")
            else -> println("Opcion invalida intenta de nuevo")
        }
    } while (opcion != "3")
}
