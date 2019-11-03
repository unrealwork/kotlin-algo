package com.leetcode

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var i = findNext(nums, -1) { n -> n != 0 }
        var j = findNext(nums, -1) { n -> n == 0 }
        while (i != -1 && j != -1) {
            if (i >= 0 && j >= 0 && j < i) {
                swap(nums, i, j)
                j = findNext(nums, j) { n -> n == 0 }
            }
            i = findNext(nums, i) { n -> n != 0 }
        }
    }

    private fun findNext(nums: IntArray, index: Int, predicate: (Int) -> Boolean): Int {
        var i = index + 1;
        while (i < nums.size) {
            if (predicate.invoke(nums[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private fun swap(s: IntArray, i: Int, j: Int): Unit {
        val tmp = s[i]
        s[i] = s[j]
        s[j] = tmp
    }
}

fun main(args: Array<String>) {
    val solution = MoveZeroes()
    val nums = intArrayOf(0, 1, 0, 3, 12)
    solution.moveZeroes(nums)
    println(nums.contentToString());

}