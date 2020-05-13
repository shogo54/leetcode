public class Solution {
    
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode temp1 = head.next;
        ListNode temp2 = head.next.next;
        head.next.next = head;
        head.next = swapPairs(temp2);
        return temp1;
    }
    
}
