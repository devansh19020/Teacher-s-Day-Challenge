/*Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value. */

class SameTree {
    int val;
    SameTree left;
    SameTree right;
    SameTree() {}
    SameTree(int val) { this.val = val; }
    SameTree(int val, SameTree left, SameTree right) {
        this.val = val;
        this.left = left;
       this.right = right;
    }
}

class Solution {
    public boolean isSameTree(SameTree p, SameTree q) {
        if((p != null && q == null) || (p == null && q != null)){
            return false;
        }
        if(p == null && q == null) return true;
        if(p.val != q.val) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
