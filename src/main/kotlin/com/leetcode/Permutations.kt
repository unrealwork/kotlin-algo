package com.leetcode

import java.util.*


class Permutations {
    fun permute(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val stack = ArrayDeque(mutableListOf(Iteration(listOf(), nums.toSet())))
        while (stack.isNotEmpty()) {
            val iteration = stack.pop()
            if (iteration.rest.isNotEmpty()) {
                val next = iteration.next()
                stack.addAll(next)
            } else {
                res.add(iteration.list)
            }
        }
        return res
    }

    private class Iteration(val list: List<Int>, val rest: Set<Int>) {


        fun next(): List<Iteration> {
            val res = mutableListOf<Iteration>()
            for (e in rest) {
                val nextList = mutableListOf<Int>()
                nextList.addAll(this.list)
                nextList.add(e)
                val nextRest = mutableSetOf<Int>()
                for (r in rest) {
                    if (r != e) {
                        nextRest.add(r)
                    }
                }
                res.add(Iteration(nextList, nextRest))

            }
            return res
        }
    }
}

fun main(args: Array<String>) {
    val s = Permutations()
    print(s.permute(intArrayOf(1, 2, 3)))
}