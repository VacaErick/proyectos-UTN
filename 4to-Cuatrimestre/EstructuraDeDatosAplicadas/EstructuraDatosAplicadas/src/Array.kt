fun main() {
    // For con step
    println("for con step")
    for (par in 2..20 step 2) {
        print("$par, ")
    }
    // For con downTo
    println("\n\nfor con downTo")
    for (valor in 20 downTo 2 step 2) {
        print("$valor, ")
    }
    // For con variable it
    println("\n\nfor con variable it")
    (2..25).forEach { it: Int ->
        print("$it ")
    }
    // For con rango renombrado
    println("\n\nfor con rango renombrado")
    (2..25).forEach { numero ->
        print("$numero ")
    }
    // Recorriendo una cadena letra por letra
    println("\n\nRecorriendo cadena:")
    val oracion = "Hola amigos como la ven"
    oracion.forEach { letra ->
        print("$letra ")
    }
    // Lista simple
    println("\n\nLista simple")
    val lista = listOf("Azul", "Rojo", "Verde", "Amarillo")
    println(lista)
    println("Elementos:")
    for (n in lista) {
        println(n)
    }
    // Arreglos mutables (tipo primitivos)
    println("\n====== Arreglos Mutables (Tipo Primitivos) ======")
    val arrInt = intArrayOf(54, -12, 89, 90, 3)
    for (n in arrInt) {
        println(n)
    }
    arrInt[1] = 1000
    println("Una forma de recorrer el arreglo:")
    for (i in 0..arrInt.size - 1) {
        println("$i = ${arrInt[i]}")
    }
    println("Otra forma de recorrer el arreglo:")
    (0..arrInt.size - 1).forEach { i ->
        println("$i = ${arrInt[i]}")
    }
    // Lista mutable de Strings
    println("\n====== Listas Mutables ======")
    val mutable = mutableListOf("Hugo", "Paco", "Luis")
    for (nombre in mutable) {
        println(nombre)
    }
    mutable.add("José")
    println("Después de add: $mutable")
    mutable.removeAt(1)
    println("Después de removeAt(1): $mutable")
    mutable.remove("Luis")
    println("Después de remove(\"Luis\"): $mutable")
    mutable[0] = "Christian"
    println("Después de set(0, \"Christian\"): $mutable")
    // Mapas o diccionario
    println("\n====== Mapas o Diccionario de Datos ======")
    val mapa = mutableMapOf<String, String>()
    mapa["gato"] = "Persona que hace mandados"
    mapa["perro"] = "Persona que anda aperrada"
    mapa["delfin"] = "Persona con inteligencia casi humana"
    println("Contenido del mapa:")
    println(mapa)
    println("\nLlaves:")
    for (clave in mapa.keys) {
        println(clave)
    }
    println("\nValores:")
    for (valor in mapa.values) {
        println(valor)
    }
    println("\nLlaves y valores (forma 1):")
    for (clave in mapa.keys) {
        println("$clave = ${mapa.get(clave)}")
    }
    println("\nLlaves y valores (forma 2):")
    for (clave in mapa.keys) {
        println("$clave = ${mapa[clave]}")
    }
}