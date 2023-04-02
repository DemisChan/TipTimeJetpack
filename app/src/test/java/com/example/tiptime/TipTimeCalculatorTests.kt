package com.example.tiptime

import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TipTimeCalculatorTests {
    @Test
    fun calculate_20_percent_tip_no_roundUp() {
        val amount = 10.0
        val tipPercent = 20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        assertEquals(expectedTip, calculateTip(amount, tipPercent, roundUp = false)
        )
    }
}