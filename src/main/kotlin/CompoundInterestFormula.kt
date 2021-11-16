package me.devwckd.grao_trial

import kotlin.math.pow

/**
 * Even though this function is not used in the actual program, I haven't deleted it because it was critical
 * to my understanding of the problem.
 */
fun calculateCompoundInterest(initialAmount: Double, annualInterest: Double, timeInDays: Int): Double {
    return initialAmount * (1 + annualInterest).pow(timeInDays / 252.0)
}

fun calculateCompoundInterestWithAdditionalDeposits(
    initialAmount: Double,
    depositAmount: Double,
    interest: Double,
    time: Int
): Double {
    val d = (interest / 1 + interest)
    val x = (initialAmount + (depositAmount / d))
    val y = (1 + interest).pow(time)
    val z = depositAmount / d
    return  x * y - z
}