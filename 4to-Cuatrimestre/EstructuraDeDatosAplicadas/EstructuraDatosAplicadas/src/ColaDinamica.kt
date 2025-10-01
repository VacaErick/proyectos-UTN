class ColaDinamica {
    private val elementos = ArrayList<Int>()

    fun meter(num: Int) {
        elementos.add(num)
        println("Elemento $num agregado a la cola.")
    }

    fun sacar(): Int {
        if (estaVacia()) {
            throw Exception("La cola está vacía.")
        }
        return elementos.removeAt(0)
    }

    fun estaVacia(): Boolean = elementos.isEmpty()
}

class ColaDinamicaVaciaException : Exception() {
    override fun toString(): String {
        return "La cola esta vacia"
    }
}
