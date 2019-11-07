package com.leetcode

import java.util.*

class ShuffleArray(private val nums: IntArray) {
    private val random = Random()

    /** Resets the array to its original configuration and return it. */
    fun reset(): IntArray {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    fun shuffle(): IntArray {
        val res = IntArray(nums.size)
        val rest = (nums.indices).toMutableList()
        var i = 0;
        while (rest.isNotEmpty()) {
            val next = random.nextInt(rest.size)
            val nextIndex = rest[next]
            res[i] = nums[nextIndex]
            rest.removeAt(next)
            i++
        }
        return res
    }
}

fun main(args: Array<String>) {
    val nums = intArrayOf(1, 2, 3)
    val shuffleArray = ShuffleArray(nums)
    println(shuffleArray.shuffle().contentToString())
}