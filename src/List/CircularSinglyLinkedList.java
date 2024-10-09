package List;

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList () {
        last = null;
        length = 0;
    }

    public int length () {
        return length;
    }

    public boolean isEmpty () {
        return length == 0;
    }


    public void createCircularLinkedList () {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next =second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }


    public void display () {
        if (last == null) {
            return;
        }
        ListNode temp = last.next;
        while (temp != last) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void insertFirst (int data) {
        ListNode current = new ListNode(data);
        if (last == null) {
            last = current;
        } else {
            current.next = last.next;
        }
        last.next = current;
        length++;
    }
    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.insertFirst(1);
        cll.insertFirst(2);
        cll.display();
    }
}
