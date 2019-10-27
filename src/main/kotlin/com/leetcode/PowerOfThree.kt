package com.leetcode

class PowerOfThree {
    private val MAX_VALID = 1162261467;
    fun isPowerOfThree(n: Int): Boolean {
        if (n <= 0) {
            return false
        }

        return MAX_VALID % n == 0
    }
}