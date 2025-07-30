package Day5;
/* Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/


class MaxDepthTree {
    int val;
    MaxDepthTree left;
    MaxDepthTree right;
    MaxDepthTree() {}
    MaxDepthTree(int val) { this.val = val; }
    MaxDepthTree(int val, MaxDepthTree left, MaxDepthTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public int maxDepth(MaxDepthTree root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
}