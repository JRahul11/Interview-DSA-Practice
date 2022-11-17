// Sort a Linked List in wave form
// Solution 1: Sort the array and swap the adjacent numbers
// Solution 2: Keep larger numbers at even index and lower numbers at odd index

class P2
{

    static int listSize(Node node)
    {
        int c = 0;
        while (node != null)
        {
            c++;
            node = node.next;
        }
        return c;
    }

    public Node sortInWave(Node head)
    {
        Node current = head;
        Node prev = null;

        int i = 0;
        int n = listSize(head);

        while(i < n)
        {
            if(i % 2 == 0)
            {
                // If current even element is smaller than the previous element
                if (i > 0 && (prev.data > current.data)) {
                    // Perform Swap
                    int t = prev.data;
                    prev.data = current.data;
                    current.data = t;
                }

                // If current even element is smaller than the next element
                if (i < n - 1 && (current.data < current.next.data)) {
                    // Perform swap
                    int t = current.data;
                    current.data = current.next.data;
                    current.next.data = t;
                }
            }
            i++;
            prev = current;
            current = current.next;
        }
    }
}


