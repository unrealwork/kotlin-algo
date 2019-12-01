package com.leetcode

class ValidBST {
    fun isValidBST(root: TreeNode?): Boolean {
        return root == null ||
                (isValidChild(root.left) { it < root.`val` } && isValidChild(root.right) { it > root.`val` })
                && isValidBST(root.left) && isValidBST(root.right)
    }

    private fun isValidChild(node: TreeNode?, predicate: (Int) -> Boolean): Boolean {
        return node == null || (predicate(node.`val`)
                && isValidChild(node.right, predicate)
                && isValidChild(node.left, predicate));

    }
}