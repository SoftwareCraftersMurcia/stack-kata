import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class ExampleTest {

    @Test
    fun change_me_first() {
        val miPila = Pila()
        Assertions.assertEquals(0, miPila.size())
    }

}
