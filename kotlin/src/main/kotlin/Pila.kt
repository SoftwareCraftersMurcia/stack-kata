class Pila {
    var tamanio = 0
    fun size() : Int {
        return tamanio
    }

    fun emptyCheck(): Boolean {
        return true
    }

    fun push(numero : Int) {
        tamanio++
    }
}
