package com.leetcode

class LengthLastWord {
    fun lengthOfLastWord(s: String): Int {
        return s.split(" ").findLast { it.isNotEmpty() }?.length ?: 0
    }
}


fun main(args: Array<String>) {
    val sol = LengthLastWord()
    print(sol.lengthOfLastWord(""))
}