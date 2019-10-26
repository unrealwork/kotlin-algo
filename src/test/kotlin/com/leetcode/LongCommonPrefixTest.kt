package com.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class LongCommonPrefixTest {

    private val solution = LongCommonPrefix()

    @Test
    fun longestCommonPrefix() {
        val actual = solution.longestCommonPrefix(arrayOf("flower","flow","flight"))
        assertEquals("fl",actual)
    }

    @Test
    fun emptyCase() {
        val actual = solution.longestCommonPrefix(arrayOf(""))
        assertEquals("",actual)
    }
}