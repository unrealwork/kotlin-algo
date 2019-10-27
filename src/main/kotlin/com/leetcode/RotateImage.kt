package com.leetcode

class RotateImage {
    fun rotate(matrix: Array<IntArray>): Unit {
        for ((start, side) in (matrix.size downTo 2 step 2).withIndex()) {
            val arr = IntArray(side + 2 * (side - 1) + side - 2)
            var j = 0;
            for (i in start until side + start) {
                arr[(j + side - 1) % arr.size] = matrix[start][i]
                j++
            }

            for (i in start + 1 until side + start) {
                arr[(j + side - 1) % arr.size] = matrix[i][start + side - 1]
                j++
            }

            for (i in side + start - 2 downTo start) {
                arr[(j + side - 1) % arr.size] = matrix[start + side - 1][i]
                j++
            }

            for (i in side + start - 2 downTo start + 1) {
                arr[(j + side - 1) % arr.size] = matrix[i][start]
                j++
            }

            println(arr.contentToString())

            j = 0;
            for (i in start until side + start) {
                matrix[start][i] = arr[j]
                j++
            }

            for (i in start + 1 until side + start) {
                matrix[i][start + side - 1] = arr[j]
                j++
            }

            for (i in side + start - 2 downTo start) {
                matrix[start + side - 1][i] = arr[j]
                j++
            }

            for (i in side + start - 2 downTo start + 1) {
                matrix[i][start] = arr[j]
                j++
            }
        }
    }
}