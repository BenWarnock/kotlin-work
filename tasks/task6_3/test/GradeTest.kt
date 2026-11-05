// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    
    @Test 
    fun `Mark of -10 ?`() {
    assertEquals("?", grade(-10))
    }
    @Test
    fun `Mark of -1 ?`() {
    assertEquals("?", grade(-1))
    }

    @Test
    fun `Mark of 0 gives a Fail`() {
    assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 25 gives a Fail`() {
    assertEquals("Fail", grade(25))
    }

    @Test
    fun `Mark of 39 gives Fail`() {
    assertEquals("Fail", grade(39))
    }

    @Test
    fun `Mark of 40 gives a pass`() {
    assertEquals("Pass", grade(40))
    }

    @Test
    fun `Mark of 47 gives a Pass`() {
    assertEquals("Pass", grade(47))
    }

    @Test
    fun`Mark of 69 gives a Pass`() {
    assertEquals("Pass", grade(69))
    }

    @Test
    fun `Mark of 70 gives distinction`() {
    assertEquals("Distinction", grade(70))
    }

    @Test
    fun `Mark of 85 gives distinction`() {
    assertEquals("Distinction", grade(85))
    }

    @Test 
    fun `Mark of 100 gives distinction`() {
    assertEquals("Distinction", grade(100))
    }

    @Test
    fun `Mark of 101 ?`() {
        assertEquals("?", grade(101))
    }

    @Test
    fun `Mark of 105 is ?`() {
        assertEquals("?", grade(105))
    }
}

