import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class ExampleTest {

    @Test
    fun sizeTest() {
        val miPila = Pila()
        Assertions.assertEquals(0, miPila.size())
    }

    @Test
    fun emptyCheckTest(){
        val miPila = Pila()
        Assertions.assertEquals(true,miPila.emptyCheck())
    }

    @Test
    fun pushTest(){
        val miPila = Pila()
        miPila.push(1)
        Assertions.assertEquals(1,miPila.size())
    }

    @Test
    fun peekTest(){
        val miPila = Pila()
        Assertions.assertNull(miPila.peek())
    }


}
