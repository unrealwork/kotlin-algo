package com.hackerrannk.problems.implementation

// Complete the kaprekarNumbers function below.
fun kaprekarNumbers(p: Int, q: Int): Sequence<Int> {
    return (p..q).asSequence().filter { isKaprekar(it) }
}

private fun isKaprekar(num: Int): Boolean {
    val d = num.toString().length
    val numString = (num.toLong() * num.toLong()).toString()
    return if ((numString.length == 2 * d) || (2 * d - 1 == numString.length)) {
        val middle = if (numString.length == 2 * d) d else d - 1
        val l = numString.substring(0, middle).let {
            if (it.isEmpty()) 0 else it.toInt()
        }

        val r = numString.substring(middle).toInt()
        num == l + r
    } else {
        false
    }
}

fun main(args: Array<String>) {
    val p = readLine()!!.toInt()
    val q = readLine()!!.toInt()

    val kaprekarNumbers = kaprekarNumbers(p, q).toList()
    print(if (kaprekarNumbers.isEmpty()) "INVALID RANGE" else kaprekarNumbers.joinToString(" "))
}
