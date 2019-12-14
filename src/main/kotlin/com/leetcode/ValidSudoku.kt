package com.leetcode

class ValidSudoku {
    val sudokuSize = 9
    val rowArray = Array<MutableList<Char>>(sudokuSize) { mutableListOf() }
    val columnArray = Array<MutableList<Char>>(sudokuSize) { mutableListOf() }
    val cellArray = Array<MutableList<Char>>(sudokuSize) { mutableListOf() }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for ((i, row) in board.withIndex()) {
            for ((j, c) in row.withIndex()) {
                if (c != '.') {
                    if (rowArray[i].contains(c)) {
                        return false
                    } else {
                        rowArray[i].add(c)
                    }

                    if (columnArray[j].contains(c)) {
                        return false
                    } else {
                        columnArray[j].add(c)
                    }
                    val cellIndex = (i / 3) * 3 + j / 3
                    if (cellArray[cellIndex].contains(c)) {
                        return false;
                    } else {
                        cellArray[cellIndex].add(c)
                    }
                }
            }
        }
        return true;
    }

}