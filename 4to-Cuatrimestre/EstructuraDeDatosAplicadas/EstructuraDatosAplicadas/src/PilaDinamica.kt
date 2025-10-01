class PilaDinamica {
    private val elementos = ArrayList<Int>()

    fun meter(num: Int) {
        elementos.add(num)
        println("Elemento $num agregado a la pila.")
    }

    fun sacar(): Int {
        if (estaVacia()) {
            throw Exception("La pila está vacía.")
        }
        return elementos.removeAt(elementos.size - 1)
    }

    fun estaVacia(): Boolean = elementos.isEmpty()

    fun mostrar() {
        if (estaVacia()) {
            println("La pila está vacía.")
        } else {
            println("Contenido actual de la pila (de arriba hacia abajo):")
            for (i in elementos.size - 1 downTo 0) {
                println("-> ${elementos[i]}")
            }
        }
    }
}
