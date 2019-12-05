package com.leetcode

class ReverseList {
    fun reverseList(head: ListNode?): ListNode? {
        var res: ListNode? = null;
        var it = head;
        while (it !== null) {
            val nextNode = ListNode(it.`val`)
            nextNode.next = res;
            res = nextNode
            it = it.next
        }
        return res
    }
}
