class Cuenta(private val clave: String, private val titular: String, private var saldo: Double) {

    fun depositar(monto: Double): Boolean {
        if (monto <= 0) return false
        val saldoAnterior = saldo
        saldo += monto
        imprimirRecibo("Depósito", saldoAnterior, monto)
        return true
    }

    fun retirar(monto: Double): Boolean {
        if (monto <= 0 || monto > saldo) {
            println(
                    "El monto a retirar ($$monto) no puede ser mayor que el saldo ($${String.format("%.2f", saldo)})"
            )
            println("No se pudo realizar la acción solicitada.")
            return false
        }
        val saldoAnterior = saldo
        saldo -= monto
        imprimirRecibo("Retiro", saldoAnterior, monto)
        return true
    }

    private fun imprimirRecibo(tipo: String, saldoAnterior: Double, monto: Double) {
        println("\n--- RECIBO DE TRANSACCIÓN ---")
        println("Clave: $clave")
        println("Titular: $titular")
        println("Tipo de operación: $tipo")
        println("Saldo anterior: $${String.format("%.2f", saldoAnterior)}")
        println("Monto: $${String.format("%.2f", monto)}")
        println("Nuevo saldo: $${String.format("%.2f", saldo)}")
        println("-----------------------------\n")
    }
}
