package com.hackerrannk.problems.strings

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue


internal class TwoStringsKtTest {
    @Test
    fun testTwoStringsPositive() {
        assertTrue(twoStrings("hello", "world"))
    }

    @Test
    fun testTwoStringsNegative() {
        assertFalse(twoStrings("hi", "world"))
    }
}
