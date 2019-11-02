package com.leetcode

class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        val normK = k % nums.size;
        if (normK > 0) {
            val gcd = gcd(nums.size, normK)
            if (gcd > 0) {
                for (current in 0 until gcd) {
                    var next = (current + normK) % nums.size;
                    while (next != current) {
                        swap(nums, current, next)
                        next = (next + normK) % nums.size;
                    }
                }
            }
        }
    }

    fun gcd(a: Int, b: Int): Int {
        if (a == b) {
            return a;
        }
        return if (a > b) gcd(a - b, b) else gcd(a, b - a)
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp
    }
}

fun main(args: Array<String>) {
    val solution = RotateArray()
    val nums = intArrayOf(1, 2, 3, 4, 5, 6)
    solution.rotate(nums, 3)
    println()
    println(nums.contentToString())
}