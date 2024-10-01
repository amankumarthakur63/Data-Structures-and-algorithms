package List;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;


        public ListNode (int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList () {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public int length () {
        return length;
    }

    public boolean isEmpty () {
        return length == 0;
    }

    public void displayForward () {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward () {
        if (tail == null)  {
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(tail.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

    }
}
