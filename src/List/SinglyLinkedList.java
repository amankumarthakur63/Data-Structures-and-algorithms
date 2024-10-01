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
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(5);
        sll.insertFirst(4);
        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(1);
        sll.display();

        System.out.println(sll.length());

        sll.insertAtAnyPosition(5,2);
        sll.display();
        System.out.println(sll.length());

        sll.insertAtAnyPosition(10,1);
        sll.display();
        System.out.println(sll.length());

    }
}
