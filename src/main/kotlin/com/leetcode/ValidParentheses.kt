package com.leetcode

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>();
        for (c in s) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (isParenthesesPair(stack.peek(), c)) {
                    stack.pop()
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }


    private fun isParenthesesPair(left: Char, right: Char): Boolean {
        return left == '(' && right == ')' || left == '[' && right == ']' || left == '{' && right == '}'
    }
}