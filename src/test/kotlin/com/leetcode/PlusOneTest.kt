package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PlusOneTest {

    private val solution = PlusOne()

    @Test
    fun testPlusOne() {
        val actual = solution.plusOne(intArrayOf(1,2,3))
        assertArrayEquals(intArrayOf(1,2,4), actual)
    }

    @Test
    fun testPlusOneLastShift() {
        val actual = solution.plusOne(intArrayOf(1,2,9))
        assertArrayEquals(intArrayOf(1,3,0), actual)
    }

    @Test
    fun testPlusShiftAll() {
        val actual = solution.plusOne(intArrayOf(1,9,9))
        assertArrayEquals(intArrayOf(2,0,0), actual)
    }

    @Test
    fun testPlusShiftWithAdditionalArray() {
        val actual = solution.plusOne(intArrayOf(9,9,9))
        assertArrayEquals(intArrayOf(1,0,0,0), actual)
    }
}