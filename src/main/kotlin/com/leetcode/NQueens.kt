package com.leetcode

import java.util.*

class NQueens {
    fun solveNQueens(n: Int): List<List<String>> {
        val board = Board(n, emptySet())
        val boards = Stack<Board>()
        boards.addAll(board.next())
        val covered = mutableSetOf<Board>()
        while (!boards.empty()) {
            val bo = boards.pop()
            if (!covered.contains(bo)) {
                val next = bo.next()
                next.forEach { b -> boards.push(b) }
                covered.add(bo)
            }
        }
        return covered.filter { b -> b.queens.size == n }
                .map { b -> b.toAnswer() }
    }
}

class Board(val size: Int, val queens: Set<QueenPosition>) {
    private var nextBoards: List<Board>? = null;
    fun toAnswer(): List<String> {
        return queens
                .sortedBy { queenPosition -> queenPosition.i }
                .map { queenPosition ->
                    val chars = CharArray(size) { '.' }
                    chars[queenPosition.j] = 'Q'
                    String(chars)
                }.toList()
    }

    fun next(np: QueenPosition): Board {
        return Board(size, queens + np)
    }

    fun next(): List<Board> {
        if (nextBoards == null) {
            nextBoards = (0 until size)
                .map{ j -> QueenPosition(queens.size, j) }
                .filter { np -> queens.none{qp -> qp.intercepts(np)} }
                .map { np -> next(np) }
        }
        return nextBoards!!
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Board

        if (size != other.size) return false
        if (queens != other.queens) return false

        return true
    }

    override fun hashCode(): Int {
        var result = size
        result = 31 * result + queens.hashCode()
        return result
    }

}

data class QueenPosition(val i: Int, val j: Int) {
    fun intercepts(other: QueenPosition): Boolean {
        return (other.j == j)
                || (i - j == other.i - other.j) || (i + j == other.i + other.j)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as QueenPosition

        if (i != other.i) return false
        if (j != other.j) return false

        return true
    }

    override fun hashCode(): Int {
        var result = i
        result = 31 * result + j
        return result
    }

}


fun main(args: Array<String>) {
    val solution = NQueens()
    val res = solution.solveNQueens(8)
    println(res)
}
