// (AUB)-C

class ListNode {
    int data;
    ListNode next;

    ListNode (int data)
    {
        this.data = data;
        this.next = null;
    }
}

class P6 {

    static ListNode insertList(ListNode head, int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    static void printList(ListNode head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static boolean isPresent(ListNode head, int data)
    {
        while(head != null)
        {
            if (head.data == data) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    static ListNode unionList(ListNode A, ListNode B)
    {
        ListNode resultHead = new ListNode(-1);
        ListNode temp = resultHead;

        // Append all elements of A into result list
        while (A != null) {
            ListNode newNode = new ListNode(A.data);
            temp.next = newNode;
            temp = newNode;
            A = A.next;
        }

        // Append elements of B if not present in result
        while (B != null && !isPresent(resultHead, B.data)) {
            ListNode newNode = new ListNode(B.data);
            temp.next = newNode;
            temp = newNode;
            B = B.next;
        }

        return resultHead.next;
    }
    
    static void minusList(ListNode A, ListNode B) 
    {
        while (A != null)
        {
            if (!isPresent(B, A.data)) {
                System.out.print(A.data + " ");
            }
            A = A.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ListNode A = null;
        // 1 - 2 - 3 - 4
        A = insertList(A, 4);
        A = insertList(A, 3);
        A = insertList(A, 2);
        A = insertList(A, 1);
        printList(A);

        ListNode B = null;
        // 5 - 6 - 3 - 1
        B = insertList(B, 1);
        B = insertList(B, 3);
        B = insertList(B, 6);
        B = insertList(B, 5);
        printList(B);

        ListNode C = null;
        // 6 - 1 - 3
        C = insertList(C, 3);
        C = insertList(C, 1);
        C = insertList(C, 6);
        printList(C);


        ListNode unionResult = unionList(A, B);
        printList(unionResult);
        // 1 - 2 - 3 - 4 - 5 - 6

        minusList(unionResult, C);
        // 2 - 4 - 5


    }
}