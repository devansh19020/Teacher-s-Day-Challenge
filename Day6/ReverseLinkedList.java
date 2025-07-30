/* Given the head of a singly linked list, reverse the list, and return the reversed list. */

class ReverseLinkedList {
    int val;
    ReverseLinkedList next;
    ReverseLinkedList() {}
    ReverseLinkedList(int val) { this.val = val; }
    ReverseLinkedList(int val, ReverseLinkedList next) { this.val = val; this.next = next; }
}

class Solution {
    public ReverseLinkedList reverseList(ReverseLinkedList head) {
        return reverseListInt(head, null);
    }
    private ReverseLinkedList reverseListInt(ReverseLinkedList head, ReverseLinkedList newHead) {
        if (head == null)
            return newHead;
        ReverseLinkedList next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}