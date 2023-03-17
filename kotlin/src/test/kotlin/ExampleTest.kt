import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ExampleTest {

    @Test
    fun `size of an empty pile is zero`() {
        val miPila = Pila()
        Assertions.assertEquals(0, miPila.size())
    }

    @Test
    fun `empty pile returns empty check`() {
        val miPila = Pila()
        Assertions.assertTrue(miPila.emptyCheck())
    }

    @Test
    fun `size of a pile with one element is one`() {
        val miPila = Pila()
        miPila.push(1)
        Assertions.assertEquals(1, miPila.size())
    }

    @Test
    fun `peek of an empty pile is null`() {
        val miPila = Pila()
        Assertions.assertNull(miPila.peek())
    }

    @Test
    fun `peek of a pile with one element returns the pushed element`() {
        val miPila = Pila()
        miPila.push(1)
        Assertions.assertEquals(1, miPila.peek())
    }

    @Test
    fun `pop of an empty pìle returns null`() {
        val miPila = Pila()
        Assertions.assertNull(miPila.pop())
    }

    @Test
    fun `pop of a pìle with an element returns the element and left the pile empty`() {
        val miPila = Pila()
        miPila.push(8)
        Assertions.assertEquals(8,miPila.pop())
    }

}
