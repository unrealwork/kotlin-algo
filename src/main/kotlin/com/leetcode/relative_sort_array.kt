package com.leetcode

class RelativeSortArray {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val res = mutableListOf<Int>()
        for(e in arr2) {
            for (se in arr1) {
                if (e == se) {
                    res.add(e)
                }
            }
        }

        val tail = mutableListOf<Int>()

        for (se in arr1) {
            var contains = false
            for (e in arr2) {
                    if (e == se) {
                        contains = true
                        break;
                    }
            }
            if (!contains) {
                tail.add(se)
            }

        }

        tail.sort()
        res.addAll(tail)

        return res.toIntArray()
    }
}