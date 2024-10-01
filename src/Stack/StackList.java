package Stack;

import java.util.EmptyStackException;

public class StackList {

    private ListNode top;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackList () {
        top = null;
        length = 0;
    }

    public int length () {
        return length;
    }

    public boolean isEmpty () {
        return length == 0;
    }
     public void push (int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
     }

     public int pop () {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
     }

     public int peek () {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
     }
    public static void main(String[] args) {
        StackList stack = new StackList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());
        System.out.println(stack.length());

        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.length());

        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.length());
    }
}
