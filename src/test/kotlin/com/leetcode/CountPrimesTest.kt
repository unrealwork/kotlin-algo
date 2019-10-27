package com.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CountPrimesTest {
    val solution = CountPrimes()
    @Test
    fun countPrimes() {
        assertEquals(4, solution.countPrimes(10))
        assertEquals(5, solution.countPrimes(12))
    }
}