fun main() {
    val temperaturas = ArrayList<Double>()
    var opcion: Int

    do {
        println("\n==== menu de temperaturas ====")
        println("1. agregar temperatura")
        println("2. temperatura promedio")
        println("3. temperaturas extremas (minima y maxima)")
        println("4. salir")
        print("elige una opcion: ")

        try {
            opcion = readLine()?.toIntOrNull() ?: 0
            when (opcion) {
                1 -> agregarTemperatura(temperaturas)
                2 -> mostrarPromedio(temperaturas)
                3 -> mostrarExtremos(temperaturas)
                4 -> println("saliendo del programa")
                else -> println("opcion invalida intenta nuevamente")
            }
        } catch (e: Exception) {
            println("ocurrio un problema inesperado")
            opcion = 0
        }
    } while (opcion != 4)
}

fun agregarTemperatura(lista: ArrayList<Double>) {
    print("ingresa una temperatura: ")
    try {
        val entrada = readLine()
        val temp = entrada?.toDoubleOrNull()
        if (temp != null) {
            lista.add(temp)
            println("temperatura agregada correctamente")
        } else {
            println("ingresa un valor numerico valido")
        }
    } catch (e: Exception) {
        println("error al leer la temperatura")
    }
}

fun mostrarPromedio(lista: ArrayList<Double>) {
    if (lista.isEmpty()) {
        println("no hay temperaturas registradas")
        return
    }

    var suma = 0.0
    for (temp in lista) {
        suma += temp
    }
    val promedio = suma / lista.size

    println("temperaturas ingresadas: ${lista.joinToString(", ")}")
    println("temperatura promedio: %.2f".format(promedio))
}

fun mostrarExtremos(lista: ArrayList<Double>) {
    if (lista.isEmpty()) {
        println("no hay temperaturas registradas")
        return
    }

    var minima = lista[0]
    var maxima = lista[0]

    for (temp in lista) {
        if (temp < minima) minima = temp
        if (temp > maxima) maxima = temp
    }

    println("temperaturas ingresadas: ${lista.joinToString(", ")}")
    println("temperatura minima: $minima")
    println("temperatura maxima: $maxima")
}