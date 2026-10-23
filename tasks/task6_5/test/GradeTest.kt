// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    "Mark between 0 and 39 should be a Fail" {
        withClue("Mark=25") { grade(25) shouldBe "Fail"}
        }
    

    "Mark between 40 and 69 shoud be a Pass" {
        withClue("Mark=55") {grade(55) shouldBe "Pass"}
        }
    
    "Mark between 70 and 100 should be a Distinction" {
        withClue("Mark=85") {grade(85) shouldBe "Distinction"}
        }
    
    "Mark out of bound e.g. -1 to -10 should be ?" {
        withClue("Mark=-1") {grade(-1) shouldBe "?"}
        }

    "Mark out of bound e.g 101 to 105 should be ?" {
        withClue("Mark=101") {grade(101) shouldBe "?"}
    }
    
})
