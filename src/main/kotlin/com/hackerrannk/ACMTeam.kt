package com.hackerrannk

import java.util.*
import kotlin.collections.*

// Complete the acmTeam function below.
fun acmTeam(topic: Array<String>): Array<Int> {
    var max = 0;
    var maxCount = 0;
    for (i in topic.indices) {
        for (j in i + 1 until topic.size) {
            val cur = commonTopicsCount(topic[i], topic[j], topic[i].length)
            if (cur > max) {
                max = cur
                maxCount = 1
            } else if (cur == max) {
                maxCount++;
            }
        }
    }
    return arrayOf(max, maxCount)
}

private fun commonTopicsCount(a: String, b: String, m: Int): Int {
    var res = 0;
    for (i in 0 until  m) {
        if (b[i] == '1' || a[i] == '1') {
            res++
        }
    }
    return res
}

fun main(args: Array<String>) {
    Scanner(System.`in`)

    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    val topics = (1..n).map { readLine()!! }.toTypedArray()

    val result = acmTeam(topics)

    println(result.joinToString("\n"))
}
