package List;


public class SinglyLinkedList {

    private ListNode head;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display () {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int length () {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst (int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }


    public void insertAtAnyPosition (int value, int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position never be negative");
        }

//        if (position < length()) {
//            throw new IllegalArgumentException("Length is exceed");
//        }
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 0;
            while (count < position - 1) {
                count++;
                previous = previous.next;
            }
            newNode.next = previous.next;
            previous.next = newNode;
        }
    }

    public void insertEnd (int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst () {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteAtAnyPosition (int position) {
        if (length() < position) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (position < 0) {
            throw new IllegalArgumentException("Position never be Negative");
        }
        if (position == 1) {
            ListNode temp = head;
            head.next = head;
            temp.next = null;
            return temp;
        }
        ListNode previous = head;
        int count = 0;
        while (count < position -1) {
            count++;
            previous = previous.next;
        }
        ListNode current = previous.next;
        previous.next = current.next;
        return current;
    }

    public ListNode deleteLast () {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public boolean find (ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
                current = current.next;
        }
        return false;
    }

    public ListNode reverse (ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode getMiddleNode () {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (slowPtr!= null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public ListNode getNthNodeFromEnd (int n) {
        if (head == null) {
            return null;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Invalid value : n = " + n);
        }
        ListNode refPtr = head;
        ListNode mainRef = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + "is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainRef = mainRef.next;
        }
        return mainRef;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(5);
        sll.insertFirst(4);
        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(1);

        sll.display();

        System.out.println(sll.length());

//        sll.insertAtAnyPosition(5,2);
//        sll.display();
//        System.out.println(sll.length());
//
//        sll.insertAtAnyPosition(10,1);
//        sll.display();
//        System.out.println(sll.length());
//
//        sll.insertEnd(0);
//        sll.display();
//        System.out.println(sll.length());

//        sll.deleteFirst();
//        sll.display();
//        sll.length();

//        if (sll.find(sll.head, 3)) {
//            System.out.println("Search Key is found");
//        } else {
//            System.out.println("Search Key is not found");
//        }
//
//        sll.deleteAtAnyPosition(3);
//        sll.display();
//
//        sll.deleteLast();
//        sll.display();

//        sll.reverse(sll.head);
//        sll.display();

       ListNode middleNode = sll.getMiddleNode();
        System.out.println("Middle Node is " + middleNode.data);

        sll.getNthNodeFromEnd(2);
        sll.display();

    }
}
