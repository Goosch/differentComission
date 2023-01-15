import org.junit.Test

import org.junit.Assert.*
import ru.netology.comission

class MainKtTest {

    @Test
    fun comission() {
        val type = "Visa"
        val previous = 0
        val amount = 10000
        val result = comission(type, previous, amount)

        assertEquals(75, result)
    }
    @Test
    fun comission2() {
        val type = "VK Pay"
        val previous = 0
        val amount = 10000
        val result = comission(type, previous, amount)

        assertEquals(0, result)
    }
    @Test
    fun comission3() {
        val type = "MasterCard"
        val previous = 0
        val amount = 10000
        val result = comission(type, previous, amount)

        assertEquals(0, result)
    }
    @Test
    fun comission4() {
        val type = "MasterCard"
        val previous = 600000
        val amount = 10000
        val result = comission(type, previous, amount)

        assertEquals(3230, result)
    }
    @Test
    fun comission5() {
        val type = "Visa"
        val previous = 600000
        val amount = 10000
        val result = comission(type, previous, amount)

        assertEquals(75, result)
    }
    @Test
    fun comission6() {
        val type = "VK Pay"
        val previous = 600000
        val amount = 10000
        val result = comission(type, previous, amount)

        assertEquals(0, result)
    }
    @Test
    fun comission7() {
        val type = "Maestro"
        val previous = 0
        val amount = 100000
        val result = comission(type, previous, amount)

        assertEquals(170, result)
    }
    @Test
    fun comission8() {
        val type = "Visa"
        val previous = 0
        val amount = 100
        val result = comission(type, previous, amount)

        assertEquals(35, result)
    }

}