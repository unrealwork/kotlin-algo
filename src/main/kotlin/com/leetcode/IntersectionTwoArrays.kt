package com.leetcode

class IntersectionTwoArrays {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val covered = BooleanArray(nums2.size)
        val res = mutableListOf<Int>()
        for (i in 0..nums1.size) {
            for (j in 0 .. nums2.size) {
                if (!covered[j] && nums1[i] == nums2[j]) {
                    res.add(nums1[i])
                }
            }
        }
        return res.toIntArray()
    }
}

fun main(args: Array<String>) {
    
}
