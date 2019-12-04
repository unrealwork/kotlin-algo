package com.leetcode

class RemoveNthElement {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var tail = head;
        var size = 0;
        while (tail !== null) {
            tail = tail.next
            size++
        }
        var i = 0;
        var node = head;
        var prevNode: ListNode? = null;
        while (i < size - n) {
            prevNode = node;
            node = node?.next;
            i++;
        }
        if (node?.next !== null) {
            deleteNode(node);
        } else {
            if (prevNode === null) {
                return null
            } else {
                prevNode.next = null;
            }
        }
        return head;
    }

    private fun deleteNode(node: ListNode?) {
        val nextNode = node?.next
        node?.`val` = nextNode?.`val`;
        node?.next = nextNode?.next;
    }
}
