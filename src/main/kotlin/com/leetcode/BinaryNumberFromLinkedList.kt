package com.leetcode

class BinaryNumberFromLinkedList {
    fun getDecimalValue(head: ListNode?): Int {
        var res = 0;
        var i = head
        while (i != null) {
            i.`val`.let {
                res = res * 2 + it
            }
            i = i.next
        }
        return res;
    }
}