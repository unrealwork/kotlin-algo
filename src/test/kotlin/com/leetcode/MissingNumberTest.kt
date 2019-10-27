package com.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class MissingNumberTest {
    private val solution = MissingNumber()

    @Test
    fun missingNumber() {
        val res = solution.missingNumber(intArrayOf(0, 1, 3))
        assertEquals(2, res)
    }
}