package com.leetcode

class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        for ((i, n) in nums.withIndex()) {
            for (j in 0 until i) {
                if (nums[j] == n) {
                    return true
                }
            }
        }
        return false
    }
}

fun main(args: Array<String>) {
    val solution = ContainsDuplicate()
    println(solution.containsDuplicate(intArrayOf(1, 2, 3, 1)))
}