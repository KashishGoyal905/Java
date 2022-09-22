package _11_Stacks;

public class _2_stackUsingLL {
    private int size;
    private _2_stackUsingLL head;

    _2_stackUsingLL() {
        head = null;
        size = 0;
    }

    int data;
    _2_stackUsingLL next;

    _2_stackUsingLL(int data) {
        this.data = data;
        this.next = null;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    int size() {
        return size;
    }

    int pop() {
        if(head == null){
            System.out.print("Stack Empty exception");
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    void push(int data) {
        _2_stackUsingLL node = new _2_stackUsingLL(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    int top() {
        if(head == null){
            System.out.print("Stack Empty exception");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        _2_stackUsingLL stack = new _2_stackUsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(30);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("top: " + stack  .top());
        System.out.println("size: " + stack.size());
        System.out.println(stack.isEmpty());
    }
}