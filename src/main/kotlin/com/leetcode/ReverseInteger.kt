package com.leetcode

class ReverseInteger {
    fun reverse(x: Int): Int {
        var rest = x;
        var res = 0;
        val lowLimit = Int.MIN_VALUE / 10
        val upLimit = Int.MAX_VALUE / 10
        while (rest != 0) {
            if (res < lowLimit || res > upLimit) {
                return 0;
            }
            res *= 10
            res += rest % 10;
            rest /= 10;
        }
        return res;
    }
}

fun main(args: Array<String>) {
    val s = ReverseInteger()
    print(s.reverse(123))
}