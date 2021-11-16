package me.devwckd.grao_trial.test

import me.devwckd.grao_trial.calculateCompoundInterest
import kotlin.test.Test
import kotlin.test.assertEquals

class CompoundInterestFormulaTests {

    @Test
    fun `should correctly calculate compound interest`() {
        assertEquals(
            103.01761094104765,
            calculateCompoundInterest(100.0, 4.25 / 100, 36 * 5)
        )
    }

}