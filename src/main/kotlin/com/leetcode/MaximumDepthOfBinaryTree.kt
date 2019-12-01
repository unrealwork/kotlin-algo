package com.leetcode

import kotlin.math.max

class MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0;
        } else {
            return 1 + max(maxDepth(root.left), maxDepth(root.right))
        }
    }
}

