package com.leetcode

import java.util.*

class Subsets {
    fun subsets(nums: IntArray): List<List<Int>> {
        val stack = Stack<PowerSet>()
        stack.push(PowerSet(setOf(), nums.toSet()))
        val res = mutableListOf<Set<Int>>()
        while (!stack.isEmpty()) {
            val ps = stack.pop();
            if (!res.contains(ps.members)) {
                ps.next().forEach { nps -> stack.push(nps) }
                res.add(ps.members)
            }
        }
        return res.map { s -> s.toList() }
    }

    class PowerSet(val members: Set<Int>, val remaining: Set<Int>) {
        fun next(i: Int): PowerSet {
            return PowerSet(members + i, remaining - i)
        }

        fun next(): List<PowerSet> {
            val rem = remaining.toMutableList()
            val res = mutableListOf<PowerSet>()
            while (!rem.isEmpty()) {
                val e = rem.removeAt(0)
                res.add(PowerSet(members + e, rem.toSet()))
            }
            return remaining.map { i -> next(i) }
        }
    }
}

fun main(args: Array<String>) {
    val solution = Subsets()
    val res = solution.subsets(intArrayOf(1,2,3))
    println(res)
}