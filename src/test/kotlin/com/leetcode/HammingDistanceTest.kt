package com.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class HammingDistanceTest {
    val solution = HammingDistance()
    @Test
    fun hammingDistance() {
        assertEquals(2,solution.hammingDistance(1,4))
    }
}
