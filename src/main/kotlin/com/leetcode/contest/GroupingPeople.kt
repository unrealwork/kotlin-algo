package com.leetcode.contest

class GroupingPeople {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val dict: MutableMap<Int, MutableList<MutableList<Int>>> = HashMap()
        for ((i, e) in groupSizes.withIndex()) {
            val g = findGroup(dict, e)
            g.add(i)
        }
        return dict.values.flatten();
    }

    fun findGroup(dict: MutableMap<Int, MutableList<MutableList<Int>>>, size: Int): MutableList<Int> {
        if (dict.containsKey(size)) {
            val groups: MutableList<MutableList<Int>> = dict[size] ?: error("")
            for (g in groups) {
                if (size > g.size) {
                    return g;
                }
            }
            val res: MutableList<Int> = mutableListOf()
            groups.add(res);
            return res;
        } else {
            val res: MutableList<Int> = mutableListOf()
            dict[size] = mutableListOf(res)
            return res;
        }
    }
}

fun main(args: Array<String>) {
    val s = GroupingPeople()
    s.groupThePeople(intArrayOf(3, 3, 3, 3, 3, 1, 3))
}