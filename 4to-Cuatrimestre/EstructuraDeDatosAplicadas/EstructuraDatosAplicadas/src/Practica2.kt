fun main () {
    Direccion()

    Salario()

    area()
}

fun Direccion (){
    println("ingresa tu calle: ")
    var calle = readln()
    println("ingresa tu ciudad: ")
    var ciudad = readln()
    println("ingresa tu estado: ")
    var estado = readln()
    println("ingresa tu pais: ")
    var pais = readln()
    println("ingresa tu codigo postal: ")
    var cp = readln()

    println("""
               $calle, $ciudad, 
               $estado, $pais, $cp
    """.trimIndent())
}

fun Salario(){
    println("ingresa tu salario bruto: ")
    var salBru = readln().toDouble()
    println("ingresa el impuesto: ")
    var impPor = readln().toDouble()

    var imp = salBru * impPor
    var salNet = salBru - imp
    var anuImp = imp * 12
    var anuSal = salNet * 12

    println("""
               salario mensual neto: $salNet
               impuestos a pagar por mes: $imp
               salario anual neto: $anuSal
               impuestos a pagar por año: $anuImp
        """.trimIndent())
}

fun area(){
    print("ingresa el radio en centimetros: ")
    var radio = readln().toDouble()

    var area = 3.14 * radio * radio
    var peri = 2 * 3.14 * radio

    println("""
    *** Centimetros ***
    Area :             | ${"%.2f".format(area)} 
    Circunferencia     | ${"%.2f".format(peri)}
    
    *** Pulgadas ***
    Area :             | ${"%.2f".format(area * 0.3937)}
    Circunferencia     | ${"%.2f".format(peri * 0.3937)}
    """.trimIndent())
}