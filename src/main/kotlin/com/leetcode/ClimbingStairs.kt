package com.leetcode

class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        val dp = IntArray(n + 1)
        for (i in 0..n) {
            if (i < 3) {
                dp[i] = i;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2]
            }
        }
        return dp.last();
    }
}

fun main(args: Array<String>) {
    val s = ClimbingStairs()
    print(s.climbStairs(3))
}