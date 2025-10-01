import java.text.SimpleDateFormat
import java.util.*

class Auto(
    var noserie: Int?,
    var marca: String?,
    var modelo: String?,
    var precio: Double?,
    var fecha: Date
) {
    override fun toString(): String {
        val sdf = SimpleDateFormat("dd/MM/yyyy")
        return "NoSerie: $noserie, Marca: $marca, Modelo: $modelo, Precio: $precio, Fecha: ${sdf.format(fecha)}"
    }
}
class Nodo(val auto: Auto) {
    var siguiente: Nodo? = null
}
class ListaAutos {
    private var cabeza: Nodo? = null
    fun agregar(auto: Auto) {
        val nuevoNodo = Nodo(auto)
        if (cabeza == null) {
            cabeza = nuevoNodo
        } else {
            var actual = cabeza
            while (actual?.siguiente != null) {
                actual = actual.siguiente
            }
            actual?.siguiente = nuevoNodo
        }
    }
    fun modificar(noserie: Int?, nuevoAuto: Auto) {
        var actual = cabeza
        while (actual != null) {
            if (actual.auto.noserie == noserie) {
                actual.auto.marca = nuevoAuto.marca
                actual.auto.modelo = nuevoAuto.modelo
                actual.auto.precio = nuevoAuto.precio
                actual.auto.fecha = nuevoAuto.fecha
                return
            }
            actual = actual.siguiente
        }
        println("auto con numero de serie $noserie no encontrado")
    }
    fun eliminar(noserie: Int?) {
        if (cabeza == null) return

        if (cabeza?.auto?.noserie == noserie) {
            cabeza = cabeza?.siguiente
            return
        }
        var anterior = cabeza
        var actual = cabeza?.siguiente
        while (actual != null) {
            if (actual.auto.noserie == noserie) {
                anterior?.siguiente = actual.siguiente
                return
            }
            anterior = actual
            actual = actual.siguiente
        }
        println("auto con numero de serie $noserie no encontrado")
    }
    fun consultar(noserie: Int?): Auto? {
        var actual = cabeza
        while (actual != null) {
            if (actual.auto.noserie == noserie) {
                return actual.auto
            }
            actual = actual.siguiente
        }
        println("Auto con número de serie $noserie no encontrado.")
        return null
    }
}
