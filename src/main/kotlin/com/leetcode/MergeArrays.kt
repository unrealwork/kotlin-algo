package com.leetcode

class MergeArrays {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val resSize = nums1.size
        val num1Size = resSize - nums2.size
        val res = IntArray(resSize)
        var i = 0
        var j = 0;
        while (i < num1Size && j < nums2.size && i + j < resSize) {
            if (nums1[i] < nums2[j]) {
                res[i + j] = nums1[i]
                i++
            } else {
                res[i + j] = nums2[j]
                j++
            }
        }
        if (i < num1Size) {
            for (k in i until num1Size) {
                res[k + j] = nums1[k]
            }
        }
        if (j < nums2.size) {
            for (k in j until nums2.size) {
                res[k + i] = nums2[k]
            }
        }
        for ((k, e) in res.withIndex()) {
            nums1[k] = e
        }
    }
}


fun main(args: Array<String>) {
    val solution = MergeArrays()
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    solution.merge(nums1, 6, intArrayOf(4, 5, 6), 3)
    println(nums1.contentToString())
}
