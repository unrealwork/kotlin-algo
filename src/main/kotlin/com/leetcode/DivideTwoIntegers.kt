package com.leetcode

import kotlin.math.abs

class DivideTwoIntegers {
    fun divide(dividend: Int, divisor: Int): Int {
        if (divisor == Int.MIN_VALUE) {
            return if (dividend == Int.MIN_VALUE) 1 else 0
        }
        if (dividend == Int.MIN_VALUE && divisor == -1) {
            return Int.MAX_VALUE
        }

        if (dividend == Int.MIN_VALUE && divisor == 1) {
            return Int.MIN_VALUE
        }
        var count = 0
        var remaining = if (dividend == Int.MIN_VALUE) Int.MAX_VALUE else abs(dividend)
        val absDivisor = abs(divisor)
        while (remaining >= absDivisor) {
            remaining -= absDivisor
            count++
        }
        if (dividend == Int.MIN_VALUE && remaining + 1 == absDivisor) {
            count++
        }
        return if (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) count else -count;
    }
}

fun main(args: Array<String>) {
    val solution = DivideTwoIntegers()
    println(solution.divide(-1010369383, -2147483648))
}