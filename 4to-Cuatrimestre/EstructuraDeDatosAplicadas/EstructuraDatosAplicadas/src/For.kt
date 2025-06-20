fun main() {
    triangulos()
    println()
    rombo()
    println()
    arbol()
}

fun triangulos() {
    val filas = 10

    println("====Triangulo 1====")
    for (i in 1..filas) {
        for (espacio in 1..filas - i) {
            print(" ")
        }
        for (asterisco in 1..i) {
            print("*")
        }
        println()
    }

    println("\n====Triangulo 2====")
    for (i in 1..filas) {
        for (asterisco in 1..i) {
            print("*")
        }
        println()
    }

    println("\n====Triangulo 3====")
    for (i in 1..filas) {
        for (espacio in 1..i) {
            print(" ")
        }
        for (asterisco in 1..filas - i) {
            print("*")
        }
        println()
    }

    println("====Triangulo 4====")
    for (i in 0 until filas) {
        for (asterisco in 1..filas - i) {
            print("*")
        }
        println()
    }
}

fun rombo() {
    val lineas = 13
    val mitad = (lineas + 1) / 2

    println("====Rombo====")
    for (i in 1..mitad) {
        for (esracio in 1..mitad - i) {
            print(" ")
        }
        
        for (asterisco in 1..2 * i - 1) {
            print("*")
        }
        println()
    }

    for (i in mitad - 1 downTo 1) {
        for (espacio in 1..mitad - i) {
            print(" ")
        }
        
        for (asterisco in 1..2 * i - 1) {
            print("*")
        }
        println()
    }
}

fun arbol() {
    val alturaArbol = 7
    val alturaTronco = 3

    println("====Arbol====")

    for (i in 1..alturaArbol) {
        for (j in 1..(alturaArbol - i)) {
            print(" ")
        }
        for (j in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }

    for (i in 1..alturaTronco) {
        for (j in 1..(alturaArbol - 2)) {
            print(" ")
        }
        print("||")
        println()
    }
}