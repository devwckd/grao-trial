package me.devwckd.grao_trial

import java.time.temporal.ChronoUnit
import kotlin.math.pow


fun main() {
    val initialAmount = System.getenv("INITIAL_AMOUNT")?.toDoubleOrNull() ?: 100.0
    val weeklyAmount = System.getenv("WEEKLY_AMOUNT")?.toDoubleOrNull() ?: 100.0
    val annualInterest = (System.getenv("ANNUAL_INTEREST")?.toDoubleOrNull() ?: 4.25) / 100
    val time = System.getenv("WEEKS")?.toIntOrNull() ?: 36

    val result = calculateCompoundInterestWithAdditionalDeposits(initialAmount, weeklyAmount, annualInterest, time)
    println(result)
}



