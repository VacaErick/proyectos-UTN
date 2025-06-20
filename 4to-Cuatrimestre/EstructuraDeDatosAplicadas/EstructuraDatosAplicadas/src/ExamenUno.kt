import kotlin.math.round

fun main() {
    PrimerEjercicio()
    println()
    SegundoEjercicio()
    println()
    TercerEjercicio()
}

fun PrimerEjercicio(){
    print("ingrese los kilometros del trayecto: ")
    val kilometrosRecorridos = readLine()

    if (kilometrosRecorridos.isNullOrBlank()) {
        println("ingresar los kilometros del trayecto.")
        return
    }

    val kilometros = kilometrosRecorridos.toDoubleOrNull()
    if (kilometros == null || kilometros < 0) {
        println("Entrada inválida debe ingresar un numero valido y positivo.")
        return
    }

    print("¿Aplica el descuento? (si / 1 para si, enter para no): ")
    val aplicaDescuento = readLine()?.lowercase()

    val tarifaPorKm = 2.25
    val descuento = 0.45

    var total = kilometros * tarifaPorKm

    if (aplicaDescuento == "si" || aplicaDescuento == "1") {
        total *= (1 - descuento)
    }

    val totalRedondeado = round(total).toInt()
    println("Total a cobrar: $$totalRedondeado")
}

fun SegundoEjercicio() {
    val nombres = arrayOf("Jose", "Alberto", "Laura", "Noel", "Erika", "Daniel")
    val calificaciones = arrayOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

    println("Promedio de calificaciones: ${calcularPromedio(calificaciones)}")
    println("Calificacion mas alta: ${calificacionMasAlta(calificaciones)}")
    println("Calificacion mas baja: ${calificacionMasBaja(calificaciones)}")
    println("Reprobados:")
    mostrarReprobados(nombres, calificaciones)
}

fun calcularPromedio(calificaciones: Array<Double>): Double {
    var suma = 0.0
    for (calificacion in calificaciones) {
        suma += calificacion
    }
    return suma / calificaciones.size
}

fun calificacionMasAlta(calificaciones: Array<Double>): Double {
    var max = calificaciones[0]
    for (calificacion in calificaciones) {
        if (calificacion > max) {
            max = calificacion
        }
    }
    return max
}

fun calificacionMasBaja(calificaciones: Array<Double>): Double {
    var min = calificaciones[0]
    for (calificacion in calificaciones) {
        if (calificacion < min) {
            min = calificacion
        }
    }
    return min
}

fun mostrarReprobados(nombres: Array<String>, calificaciones: Array<Double>) {
    for (i in calificaciones.indices) {
        if (calificaciones[i] < 60.0) {
            println("${nombres[i]}, ${calificaciones[i]}")
        }
    }
}

fun TercerEjercicio() {
    var suma = 0.0
    var contador = 0

    println("0 para terminar")
    while (true) {
        print("ingrese un numero: ")
        val entrada = readLine()?.toDoubleOrNull()

        if (entrada == null) {
            println("Entrada no valida intente de nuevo")
            continue
        }

        if (entrada == 0.0) {
            break
        }

        suma += entrada
        contador++
    }

    if (contador == 0) {
        println("No se ingresaron numeros")
    } else {
        val promedio = suma / contador
        println("Sumatoria: $suma")
        println("Promedio: $promedio")
    }
}
