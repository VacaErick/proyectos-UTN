fun main(){
    println("dame el valor de a: ")
    var a = readln().toInt()
    println("dame el valor de b: ")
    var b = readln().toInt()
    println("la suma de $a + $b = ${a+b}")
    println("la multiplicacion de $a * $b = ${a*b}")

    println("dame el lado de un cuadrado")
    var lado = readln().toDouble()
    println("el perimetro del cuadrado es igual a: ${lado*4}")

    println("dame el precio del articulo: ")
    var articulo = readln().toDouble()
    println("dame la cantidad de productos ")
    var cantidad = readln().toDouble()
    println("tu total a pagar es = ${articulo*cantidad}")

    println("dame cuatro numero enteros")
    var num1 =readln().toInt()
    var num2 =readln().toInt()
    var num3 =readln().toInt()
    var num4 =readln().toInt()
    println("la suma de $num1 + $num2 = ${num1+num2}")
    println("la multiplicacion de $num3 * $num4 = ${num3*num4}")

    println("dame cuatro numero enteros")
    var val1 =readln().toDouble()
    var val2 =readln().toDouble()
    var val3 =readln().toDouble()
    var val4 =readln().toDouble()
    println("la suma de $val1 + $val2 + $val3 + $val4 = ${val1+val2+val3+val4}" )
    println("el promedio de ${val1+val2+val3+val4} = ${(val1+val2+val3+val4)/4}" )
}