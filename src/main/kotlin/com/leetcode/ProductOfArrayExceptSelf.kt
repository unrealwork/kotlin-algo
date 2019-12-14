package com.leetcode

class ProductOfArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        res[0] = 1
        for (i in 1 until nums.size) {
            res[i] = res[i - 1] * nums[i - 1]
        }

        var m = 1
        for (i in (nums.size - 2) downTo 0) {
            m *= nums[i + 1]
            res[i] = m * res[i]
        }

        return res
    }
}

fun main(args: Array<String>) {
    val s = ProductOfArrayExceptSelf()
    print(s.productExceptSelf(intArrayOf(1, 2, 3, 4)).contentToString())
}