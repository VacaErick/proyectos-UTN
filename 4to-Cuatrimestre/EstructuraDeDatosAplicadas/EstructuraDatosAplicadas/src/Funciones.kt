import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    println("escribe tu nombre: ")
    val name = readln()
    println("escribe tu edad: ")
    val edad = readln().toInt()

    print("dame el valor de a: ")
    var a = readln().toDouble()
    print("dame el valor de b: ")
    var b = readln().toDouble()
    val c = suma(a, b)
    val c1 = suma1(a, b)

    println(
        """
                        Asi como lo ven en el editor asi aparece
        Nombre: $name
    """.trimIndent()
    )

    mostrarMensaje()

    funcionConParametros(name, edad)

    println("el valor de c es: $c")
    println("el valor de c1 es: $c1")

    println(
        """
        Un empleado con salario base obtiene un salario neto de ${calcularSalario()}

        Un empleado con salario de $40000.00 que paga de impuesto 30%
        obtiene un salario neto de ${calcularSalario(40000.0, 0.3)}

        Un empleado con salario de $30000.00 con impuesto base ${calcularSalario(30000.0)}
        
        Un empleado con salario de $15000.00 con 5% impuesto ${calcularSalario(pctImp=0.5, salario=15000.0)}
    """.trimIndent()
    )

    lambda()

    val fx = { println("Hola") }

    fx()

    val fy = { f: String -> println(f) }

    fy("Esto es un paso de parametro cadena")

    val fw = { g: Int -> g + 1 }
    println("fw = ${fw(4)}")

    val x = { a: Int, b: Int, c: Int ->
        println(a + b)
        c * 6
    }
    println("x = ${x(8, 4, 2)}")

    val fa = { i: Int, j: Int, k: Int -> println(i / j * k) }
}

fun mostrarMensaje() {
    val fmt = SimpleDateFormat("dd/MM/yyyy")
    val fecha = fmt.format(Date())
    println("""
        mensaje: Hola desde kotlin
        fecha: $fecha
        """)
}

fun funcionConParametros(nombre: String, age: Int) {
    println("""
        Nombre: $nombre
        Edad: $age
    """.trimIndent())
}

fun suma(a: Double, b: Double): Double {
    return a + b
}

fun suma1(a: Double, b: Double): Double = a + b

fun calcularSalario(salario: Double = 10000.0, pctImp: Double = 0.10): Double {
    val imp = salario * pctImp
    return salario - imp
}

fun lambda() {
    println(multi(2, 3))

    multiLambda(2, 3, { result -> println(result) })

    multiLambda(2, 3) { result -> println(result) }
}

fun multi(x: Int, y: Int): Int {
    return x * y
}

fun multiLambda(x: Int, y: Int, callback: (result: Int) -> Unit) {
    callback(x * y)
}
