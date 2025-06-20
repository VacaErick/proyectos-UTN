fun main (){
    println("If else anidado")
    print("Escribe un nombre: ")
    val nombre = readln()
    if (nombre == "karina"){
        println("Hola Kary")
    }else if (nombre == "Pablo"){
        println("Hola Pablo")
    }else if (nombre == "Alain" || nombre == "Kotlin"){
        println("Hola Al")
    }else if (nombre == "Pamela"){
        println("Hola Pam")
    }else{
        println("Hola desconocido :) ")
    }

    println("=== when ===")
    when (nombre){
        "Karina"-> println("Hola Kary")
        "Pablo"-> println("Hola Pablin")
        "Alain", "Kotlin"-> println("Hola Al")
        "Pamela"-> println("Hola desconocido :)")
    }

    print("escribe tu edad: ")
    val edad = readln().toInt()
    when (edad){
        in 0..5 -> println("Es un bebe")
        in 6..12 -> println("Es menor de edad")
        in 13..17 -> println("Es un adolecente")
        in 18..29 -> println("Es un joven")
        in 30..49 -> println("Es un adulto")
        in 50..129 -> println("Es una persona de la tercera edad")
        else-> println("no es humano")
    }

    when{
        edad <= 5 -> println("Es un bebe")
        edad <= 12 -> println("Es menor de edad")
        edad <= 17 -> println("Es un adolecente")
        edad <= 29 -> println("Es un joven")
        edad <= 49 -> println("Es un adulto")
        edad <= 129 -> println("Es una persona de la tercera edad")
        else-> println("no es humano")
    }

    println("while")
    var i = 1
    while (i<=10){
        println("$i")
        i++
    }
    println("do while")
    i=1
    do {
        print("$i")
        i++
    }while (i<=10)
    println("\nfor")
    for(i in 1..10)
        print("$i")
        i++
    println("\nfor con incremento variable")
    for (i in 1..10 step 2) {
        print("$i")
    }
    println("\nfor descendente")
    for (i in 10 downTo 1){
        print("$i")
    }
    println("\nfor descendente con decrementos")
    for (i in 10 downTo 1 step 3){
        print("$i")
    }
    println("\nforEach con rango it")
    (1..5).forEach {
        print("$it")
    }
    println("\nforEach con rango renombrado")
    (1..5).forEach { numero ->
        print("$numero")
    }
    println()
    val cadena = "Jose De Jesus"
    cadena.forEach { letra ->
        print("$letra")
    }
    println()

    val arreglo = arrayListOf("Hugo", "Paco", "Luis")
    for (nombre in arreglo){
        println(nombre)
    }

    arreglo.forEachIndexed { indice, valor ->
        println("$indice = $valor")
    }
}