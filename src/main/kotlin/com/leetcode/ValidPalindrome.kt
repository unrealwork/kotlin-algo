package com.leetcode

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var i = 0;
        var j = s.length - 1
        while (i < j) {
            if (!s[i].isLetterOrDigit()) {
                i++;
            } else {
                if (!s[j].isLetterOrDigit()) {
                    j--;
                } else {
                    val c = s[i].toLowerCase()
                    val t = s[j].toLowerCase()
                    if (c != t) {
                        return false
                    } else {
                        i++;
                        j--;
                    }
                }
            }

        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = ValidPalindrome()
    println(solution.isPalindrome("race a car"))
}