class Pila {
    private var _peek: Int? = null
    var tamanio = 0
    fun size() : Int {
        return tamanio
    }

    fun emptyCheck(): Boolean {
        return true
    }

    fun push(numero : Int) {
        tamanio++
        this._peek = numero
    }

    fun peek(): Int? {
        return _peek
    }
}
