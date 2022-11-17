// Swap Nodes in Pairs

class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode second =  head.next;
        ListNode third = second.next;       // Placeholder so list is not lost
        
        second.next = head;
        head.next = swapPairs(third);
        
        return second;
    }
}