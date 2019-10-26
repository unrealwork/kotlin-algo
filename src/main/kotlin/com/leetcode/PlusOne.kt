package com.leetcode

class PlusOne {
    fun plusOne(dig: IntArray): IntArray {
        val len = dig.size
        val digits = dig.copyOf()
        digits[len - 1] += 1
        var i = len - 1;
        while (i > 0 && digits[i] == 10) {
            digits[i] = 0;
            digits[i - 1] += 1;
            i--;
        }
        if (digits[0] == 10) {
            digits[0] = 0
            return intArrayOf(1) + digits
        }
        return digits
    }
}