package com.hackerrannk.stats

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val (perc, n) = readLine()!!.split(' ').map { it.toInt() }
    val p: Double = perc / 100.0
    // at least 2 rejects
    val res1 = (2..n).map { b(n, it, p) }.sum()
    // no more 2 rejects
    val res2 = (0..2).map { b(n, it, p) }.sum()
    println(BigDecimal(res2).setScale(3, RoundingMode.HALF_EVEN))
    println(BigDecimal(res1).setScale(3, RoundingMode.HALF_EVEN))
}


/**
 * n  - total number of trials
 * x - total number of success trials
 * p - probability of success for single trial
 */
private fun b(n: Int, x: Int, p: Double): Double {
    val q = 1 - p;
    return comb(n, x) * p.pow(x) * q.pow(n - x)
}

private fun comb(n: Int, x: Int): Int {
    if (x > n) {
        return 0;
    }
    var res = (n - x + 1..n).fold(1) { a, b -> a * b }
    (1..x).forEach { res /= it }
    return res
}
