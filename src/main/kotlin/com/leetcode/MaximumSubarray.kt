package com.leetcode

import kotlin.math.max

class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        val map = Array<IndexedValue<Int>?>(nums.size) {null}
        for ((i, n) in nums.withIndex()) {
            for (j in i downTo 0) {
                if (j == 0) {
                    if (map[j] == null) {
                        map[j] = IndexedValue(n,n)
                    } else {
                        map[j] = IndexedValue(max(map[j]!!.index, n), n)
                    }
                } else {
                    val newVal = (map[j - 1]!!.value + n)
                    if (map[j] == null) {
                        map[j] = IndexedValue(newVal, newVal)
                    } else {
                        map[j] = IndexedValue(max(newVal, map[j]!!.index), newVal)
                    }
                }
            }
        }
        return map.map { e -> e!!.index }.max()!!
    }
}

fun main(args: Array<String>) {
    val solution = MaximumSubarray()
    print(solution.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
}