package com.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RotateImageTest {
    val solution = RotateImage()

    @Test
    fun rotate() {
        val matrix = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9)
        )
        solution.rotate(matrix)
        matrix.forEach { arr -> println(arr.contentToString()) }
    }
}