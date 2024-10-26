package LeetCode;

public class AddTwoNumber {

    private ListNode head;

    private static class ListNode {
        private int val;
        private ListNode next;

        public ListNode (int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void display () {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insert (int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insert1 (int val) {
        ListNode newNode1 = new ListNode(val);
        newNode1.next = head;
        head = newNode1;
    }

    public ListNode addTwoNum(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }

    public static void main(String[] args) {
            AddTwoNumber adn = new AddTwoNumber();
            adn.insert(2);
            adn.insert(3);
            adn.insert(4);
            adn.display();

        adn.insert1(7);
        adn.insert1(0);
        adn.insert1(8);
        adn.display();

    }
}
