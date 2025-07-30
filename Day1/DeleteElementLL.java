/*Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.*/

class DeleteElementLL {
    int val;
    DeleteElementLL next;
    DeleteElementLL() {}
    DeleteElementLL(int val) { this.val = val; }
    DeleteElementLL(int val, DeleteElementLL next) { this.val = val; this.next = next; }
}

class Solution {
    public DeleteElementLL removeElements(DeleteElementLL head, int val) {
        while(head != null && head.val == val) head = head.next;
        if(head == null) return head;
        DeleteElementLL temp = head;
        while(temp.next != null){
            if(temp.next.val == val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head;
    }
}