/* Given the root of a binary tree, invert the tree, and return its root. */


class InvertTree {
    int val;
    InvertTree left;
    InvertTree right;
    InvertTree() {}
    InvertTree(int val) { this.val = val; }
    InvertTree(int val, InvertTree left, InvertTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Solution {
    public InvertTree invertTree(InvertTree root) {
        if(root==null) return root;
        InvertTree t = root.right;
        root.right = root.left;
        root.left = t;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
