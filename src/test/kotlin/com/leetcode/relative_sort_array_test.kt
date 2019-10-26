package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RelativeSortArrayTest {
    private val solution = RelativeSortArray()

    @Test
    fun testSortRelative() {
        val arr1 = intArrayOf(2,3,1,3,2,4,6,7,9,2,19)
        val arr2 = intArrayOf(2,1,4,3,9,6)
        assertArrayEquals(intArrayOf(2,2,2,1,4,3,3,9,6,7,19),
            solution.relativeSortArray(arr1, arr2))
    }

    @Test
    fun testSortRelativeTailOrder() {
        val arr1 = intArrayOf(28,6,22,8,44,17)
        val arr2 = intArrayOf(22,28,8,6)
        assertArrayEquals(intArrayOf(22,28,8,6,17,44),
            solution.relativeSortArray(arr1, arr2))
    }
}