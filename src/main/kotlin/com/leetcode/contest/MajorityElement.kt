package com.leetcode.contest

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var majEl = nums[0];
        var sum = 1;
        for (i in 1 until nums.size) {
            val e = nums[i]
            if (sum == 0) {
                majEl = e;
            }
            if (e == majEl) {
                sum++
            } else {
                sum--;
            }
        }
        return majEl;
    }
}