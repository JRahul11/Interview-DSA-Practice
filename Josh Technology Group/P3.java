// Segregate even and odd nodes in a Link List

class Solution
{
    Node divide(int N, Node head){
        
        if(head == null) 
            return null;
        
        Node even = new Node(-1);
        Node odd = new Node(-1);
        Node evenptr = even;
        Node oddptr = odd;
        
        Node temp = head;
        
        while(temp != null)
        {
            if(temp.data % 2 == 0)
            {
                evenptr.next = temp;
                evenptr = evenptr.next;
            }
            else
            {
                oddptr.next = temp;
                oddptr = oddptr.next;
            }
            temp = temp.next;
        }
        
        if(even.next != null)
        {
            evenptr.next = odd.next;
            oddptr.next = null;
            return even.next;
        }
        return odd.next;
    }
}