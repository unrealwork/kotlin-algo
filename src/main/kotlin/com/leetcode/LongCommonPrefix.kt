package com.leetcode

import java.lang.StringBuilder

class LongCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val minLength = strs.map { s -> s.length }.min()?:0
        val sb = StringBuilder()
        for (i in 0 until minLength) {
            val allEquals = strs.map { s -> s[i] }.distinct().count() == 1
            if (!allEquals) {
                break;
            } else {
                strs.map { s -> s[i] }.first()?.let { v -> sb.append(v) }
            }
        }
        return sb.toString()
    }
}