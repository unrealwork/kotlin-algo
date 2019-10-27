package com.leetcode

class MissingNumber {

    fun missingNumber(nums: IntArray): Int {
        var sum = nums.size
        for ((i,e) in nums.withIndex()) {
            sum = sum + i - e
        }
        return sum
    }
}

fun main(args: Array<String>) {

}