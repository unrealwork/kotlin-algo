package com.hackerrannk.problems.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ModifiedKaprekarNumbersKtTest {

    @Test
    fun testKaprekarNumbers() {
        assertEquals(
            kaprekarNumbers(1, 100).toList(), listOf(1, 9, 45, 55, 99)
        );
    }
}
