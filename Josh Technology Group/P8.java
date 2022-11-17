// Rearrange a linked list in to alternate first and last element
// Input : 1->2->3->4->5->6->7->8
// Output :1->8->2->7->3->6->4->5

import java.util.*;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class P8 {

    static ListNode arrange(ListNode head)
    {
        Deque<Integer> dequeue = new ArrayDeque<Integer>();
        ListNode temp = head;

        while(temp != null)
        {
            dequeue.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        int i = 0;

        while(!dequeue.isEmpty())
        {
            if (i % 2 == 0) {
                temp.data = dequeue.removeFirst();
            } else {
                temp.data = dequeue.removeLast();
            }
            i++;
            temp = temp.next;
        }
        return head;
    }

    static void printList(ListNode head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        printList(arrange(head));
    }


}