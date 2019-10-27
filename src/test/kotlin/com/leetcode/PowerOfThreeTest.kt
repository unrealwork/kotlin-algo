package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PowerOfThreeTest {
    val solution = PowerOfThree()

    @Test
    fun testPowerOfThree() {
        assertEquals(true, solution.isPowerOfThree(59049))
        assertEquals(false, solution.isPowerOfThree(45))
    }
}