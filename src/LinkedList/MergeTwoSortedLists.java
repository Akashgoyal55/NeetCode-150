package LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    //to merge two sorted lists, we need two pointers pointing to heads of both the list then compare and move the pointers
    public ListNode mergeTwoLists(listNode list1, listNode list2){
        ListNode dummy = new ListNode(-1); //created a dummy node with a value -1
        ListNode temp = dummy;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        //check if any item is left at the end after the traverse
        while(list1!=null){
            temp.next = list1;
        }else if(list2!=null){
            temp.next = list2;
        }
        return temp.next; //head of the merged list
    }
}
