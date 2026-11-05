// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus
import io.kotest.assertions.withClue

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here

    "median when size = 1" {
        median(listOf(5.0)) shouldBe 5.0
    }
    "median when size = 2" {
        median(listOf(2.0, 6.0)) shouldBe 4.0
    }

    "median when size = 3" {
        median(listOf(2.0, 3.0, 7.0)) shouldBe 3.0
    }

    "median when size = 4" {
        median(listOf(2.0, 3.0, 5.0, 7.0)) shouldBe 4.0
    }
})
