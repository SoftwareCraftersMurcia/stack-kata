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


}
