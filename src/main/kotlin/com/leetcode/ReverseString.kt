package com.leetcode

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        val halfSize = if (s.size % 2 == 0) (s.size / 2 - 1) else s.size / 2;
        for (i in 0..halfSize) {
            swap(s, i, s.size - 1 - i)
        }
    }

    private fun swap(s: CharArray, i: Int, j: Int): Unit {
        val tmp = s[i]
        s[i] = s[j]
        s[j] = tmp
    }
}
