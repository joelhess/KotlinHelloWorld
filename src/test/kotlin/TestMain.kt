import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.booleans.shouldBeTrue

class TestMain: FreeSpec() {
    init {
        "Test a Thing" {
            true.shouldBeTrue()
        }
    }
}