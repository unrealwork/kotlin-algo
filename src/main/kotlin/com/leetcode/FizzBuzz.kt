package com.leetcode

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        return (1..n)
                .map { i -> fb(i) }
                .toList()
    }

    private fun fb(i: Int): String {
        val isMultipleThree = i % 3 == 0
        val isMultipleFive = i % 5 == 0
        return if (isMultipleThree && isMultipleFive) {
            "FizzBuzz"
        } else {
            if (isMultipleThree) {
                "Fizz"
            } else {
                if (isMultipleFive) {
                    "Buzz"
                } else {
                    i.toString()
                }
            }
        }
    }
}
