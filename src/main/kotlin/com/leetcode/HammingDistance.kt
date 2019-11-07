package com.leetcode

class HammingDistance {
    fun hammingDistance(x: Int, y: Int): Int {
        return Integer.bitCount(x.xor(y))
    }
}
