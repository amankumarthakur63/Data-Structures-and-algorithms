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
    public static void main(String[] args) {

    }
}
