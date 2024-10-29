package LeetCode;

public class LinkedListCyclic2 {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void createALoop () {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
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

    public ListNode detectCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                break;
            }
        }
        if (fastPtr == null || fastPtr.next == null) {
            return null;
        }

        ListNode slowPtr2 = head;

        while (slowPtr != slowPtr2) {
            slowPtr = slowPtr.next;
            slowPtr2 = slowPtr2.next;
        }
        return slowPtr;
    }
    public static void main(String[] args) {
        LinkedListCyclic2 llc = new LinkedListCyclic2();
        //llc.createALoop();
        llc.detectCycle(llc.head);
        llc.display();
    }
}
