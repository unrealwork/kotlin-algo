package com.leetcode

import java.util.*

class GenerateParentheses {
    fun generateParenthesis(n: Int): List<String> {
        val res = mutableListOf<String>()
        val stack = ArrayDeque(mutableListOf(Iteration(ParenthesesSet(n, n))))
        while (stack.isNotEmpty()) {
            val it = stack.pop()
            if (it.isValid()) {
                res.add(it.expression)
            } else {
                val nextIts = it.next()
                stack.addAll(nextIts)
            }
        }
        return res.toList()
    }

    private class Iteration(val rest: ParenthesesSet) {
        var expression: String = ""
        private var stack = ArrayDeque<Char>()

        fun isValid(): Boolean {
            return rest.isEmpty() && stack.isEmpty()
        }

        fun next(): Collection<Iteration> {
            val res = mutableListOf<Iteration>()
            for (p in rest.nextParenthesis()) {
                if (stack.isEmpty() && p == '(' || stack.isNotEmpty()) {
                    val nextExpression = expression + p
                    val nextStack = ArrayDeque<Char>(stack)
                    if (nextStack.isEmpty()) {
                        nextStack.push(p)
                    } else {
                        val lastP = nextStack.peek()
                        if (lastP == '(' && p == ')') {
                            nextStack.pop()
                        } else {
                            nextStack.push(p)
                        }
                    }

                    val nextRest = rest.next(p)
                    val nextIt = Iteration(nextRest)
                    nextIt.expression = nextExpression;
                    nextIt.stack = nextStack
                    res.add(nextIt)
                }
            }
            return res;
        }

    }

    private class ParenthesesSet(val open: Int, val close: Int) {

        fun nextParenthesis(): List<Char> {
            val result = mutableListOf<Char>()
            if (open > 0) {
                result.add('(')
            }
            if (close > 0) {
                result.add(')')
            }
            return result;
        }

        fun next(p: Char): ParenthesesSet {
            return when (p) {
                '(' -> {
                    ParenthesesSet(open - 1, close)
                }
                else -> {
                    ParenthesesSet(open, close - 1)
                }
            }
        }

        fun isEmpty(): Boolean {
            return open == 0 && close == 0;
        }
    }
}

fun main(args: Array<String>) {
    val s = GenerateParentheses()
    print(s.generateParenthesis(6))
}