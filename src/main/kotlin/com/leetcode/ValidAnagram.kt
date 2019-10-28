package com.leetcode

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length == t.length) {
            return s.groupingBy { c -> c }.eachCount() == t.groupingBy { c -> c }.eachCount()
        }
        return false
    }
}


fun main(args: Array<String>) {
    val solution = ValidAnagram()
    print(solution.isAnagram("rat", "car"))
}
