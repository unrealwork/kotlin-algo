package com.leetcode

class ProductOfArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val left = IntArray(nums.size)
        left[0] = 1
        for (i in 1 until nums.size) {
            left[i] = left[i - 1] * nums[i - 1]
        }

        var m = 1
        for (i in (nums.size - 2) downTo 0) {
            m *= nums[i + 1]
            left[i] = m * left[i]
        }

        return left
    }
}

fun main(args: Array<String>) {
    val s = ProductOfArrayExceptSelf()
    print(s.productExceptSelf(intArrayOf(1, 2, 3, 4)).contentToString())
}