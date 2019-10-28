package com.leetcode

class FirstUnique {
    fun firstUniqChar(s: String): Int {
        val table = HashMap<Char, IndexedValue<Int>>()
        for ((i, c) in s.withIndex()) {
            if (!table.containsKey(c)) {
                table[c] = IndexedValue(i, 1)
            } else {
                table[c] = IndexedValue(table[c]!!.index, table[c]!!.value + 1)
            }
        }
        return table.entries.filter { (_, iv) -> iv.value == 1 }
                .map { (_, iv) -> iv.index }
                .min() ?: -1
    }
}
