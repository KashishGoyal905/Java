package _11_Stacks;

public class _1_stackUsingArray {
    private int data[];
    // is the index of the topmost element of the stack;
    private int top;

    public _1_stackUsingArray() {
        data = new int[10];
        top = -1;
    }

    public _1_stackUsingArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public int top() {
        if (size() == 0) {
            // stackemptyexception
            return -1;
        }
        return data[top];
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i <= top; i++) {
            data[i] = temp[i];
        }
    }

    public void push(int element) {
        if (size() == data.length) {
            doubleCapacity();
        }
        top++;
        data[top] = element;
    }

    public int pop() {
        if (size() == 0) {
            // stackemptyexception
            return -1;
        }
        int temp = data[top];
        top--;
        return temp;
    }

    public static void main(String[] args) {
        _1_stackUsingArray stack = new _1_stackUsingArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
