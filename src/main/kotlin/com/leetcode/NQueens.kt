package com.leetcode

import java.util.*

class NQueens {
    fun solveNQueens(n: Int): List<List<String>> {
        val board = Board(n, 0)
        val boards = Stack<Board>()
        boards.addAll(board.next())
        val covered = mutableSetOf<Board>()
        while (!boards.empty()) {
            val bo = boards.pop()
            if (!covered.contains(bo)) {
                val next = board.next()
                next.forEach { b -> boards.push(b) }
                covered.add(bo)
            }
        }
        return covered.filter { b -> b.next()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              .isEmpty() && b.queens == n }.map { b -> b.toAnswer() }
    }
}

class Board(val size: Int, val queens:Int) {
    // TODO: Store only queens positions
    private var grid = Array(size) { IntArray(size) { -1 } }
    private var nextBoards: Set<Board>? = null

    constructor(other: Board) : this(other.size, other.queens) {
        this.grid = other.grid
    }

    fun toAnswer(): List<String> {
        return grid.map { ba -> ba.map { b -> if (b == 1) 'Q' else if (b == 0) '+' else '.' }.toCharArray() }
            .map { ca -> String(ca) }
            .toList()
    }

    fun next(qi: Int, qj: Int): Board {
        val res = Board(size, queens + 1)
        res.grid = this.grid.map { b -> b.clone() }.toTypedArray()
        res.grid[qi][qj] = 1
        val diff = qi - qj
        val sum = qi + qj
        for (i in 0 until size) {
            for (j in 0 until size) {
                if (i != qi || j != qj || res.grid[i][j] == -1) {
                    if (qi == i) {
                        res.grid[i][j] = 0
                    }
                    if (qj == j) {
                        res.grid[i][j] = 0
                    }
                    if (i - j == diff) {
                        res.grid[i][j] = 0
                    }
                    if (i + j == sum) {
                        res.grid[i][j] = 0
                    }
                }
            }
        }
        return res
    }

    fun next(): Set<Board> {
        if (nextBoards == null) {
           val res = mutableSetOf<Board>()
            for (i in 0 until size) {
                for (j in 0 until size) {
                    if (this.grid[i][j] == -1) {
                        res.add(next(i, j))
                    }
                }
            }
            nextBoards = res
        }
        return nextBoards!!
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Board

        if (size != other.size) return false
        if (!grid.contentDeepEquals(other.grid)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = size
        result = 31 * result + grid.contentDeepHashCode()
        return result
    }

}


fun main(args: Array<String>) {
    val solution = NQueens()
    val res = solution.solveNQueens(4)
    println(res)
}