package com.leetcode.tree

import java.util.*

class BinaryTreeInorderTraversal {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val stack = ArrayDeque<TreeNode>()
        val result = mutableListOf<Int>()
        root?.let {
            stack.push(it)
        }
        while (!stack.isEmpty()) {
            val node = stack.pop()

            if (isLeaf(node)) {
                result.add(node.`val`)
            } else {
                node.right?.let {
                    stack.push(it)
                }

                node.`val`.let {
                    stack.push(TreeNode(it))
                }
                node.left?.let {
                    stack.push(it)
                }
            }
        }
        return result
    }

    private fun isLeaf(treeNode: TreeNode): Boolean {
        return treeNode.left == null && treeNode.right == null;
    }
}
