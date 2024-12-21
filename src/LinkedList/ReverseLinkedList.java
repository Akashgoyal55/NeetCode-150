package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    //to reverse a linked list, we need three pointers
    static listNode(ListNode head){
        listNode before = null; //take pointers before, curr, after, then do operations to reverse the linked list
        listNode curr = head;
        listNode after;
        while(curr!=null){
            after = curr.next;
            curr.next = before;
            before = curr;
            curr = after;
        }
        return before;
    }
}
