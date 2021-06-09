package com.hackerrannk.problems.strings


/*
 * Complete the 'twoStrings' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s1
 *  2. STRING s2
 */

fun twoStrings(s1: String, s2: String): Boolean {
    val s1Dict = fillDict(s1)
    val startIndex = 'a'.toInt()
    for (c in s2.chars()) {
        val symbolIndex = c - startIndex
        if (s1Dict[symbolIndex]) {
            return true
        }
    }
    return false
}

private fun fillDict(word: String): Array<Boolean> {
    val dictSize = 'z' - 'a' + 1
    val dict = Array(dictSize) { false }
    word.forEach { dict[it - 'a'] = true }
    return dict
}

fun main() {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s1 = readLine()!!
        val s2 = readLine()!!
        val result = twoStrings(s1, s2)
        println(if (result) "YES" else "NO")
    }
}
