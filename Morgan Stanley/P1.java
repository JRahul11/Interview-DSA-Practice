// Swap Kth nodes from ends

class GFG
{
    static int countNodes(Node head)
    {
        int count = 0;
        while(head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
    
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        int n = countNodes(head);
        
        if(n < K) return head;
        
        Node x = head;
        Node x_prev = null;
        for(int i=1; i<K; i++)
        {
            x_prev = x;
            x = x.next;
        }
        Node y = head;
        Node y_prev = null;
        for(int j=1; j<n-K+1; j++)
        {
            y_prev = y;
            y = y.next;
        }
        
        if(x_prev != null)
        {
            x_prev.next = y;
        }
        if(y_prev != null)
        {
            y_prev.next = x;
        }
        
        Node temp = x.next;
        x.next = y.next;
        y.next = temp;
        
        // Change head pointers
        if(K == 1)
        {
            head = y;
        }
        if(K == n)
        {
            head = x;
        }
        
        return head;
    }
}