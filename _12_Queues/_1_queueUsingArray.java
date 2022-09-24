package _12_Queues;

public class _1_queueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public _1_queueUsingArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public _1_queueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() {
        if (size() == 0) {
            System.out.println("Empty Queue");
            return -1;
        }
        return data[front];
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i <= temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i < front; i++) {
            data[index] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }

    public void enqueue(int value) {
        if (size() == data.length) {
            doubleCapacity();
        }
        rear++;
        if (rear == data.length) {
            rear = 0;
        }
        data[rear] = value;
        if (front == -1) {
            front++;
        }
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            front = -1;
            rear = -1;
            System.out.println("queue empty");
            return -1;
        }
        int ans = data[front];
        front++;
        if (front == data.length) {
            front = 0;
        }
        size--;
        return ans;
    }

    public static void main(String[] args) {
        _1_queueUsingArray queue = new _1_queueUsingArray();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue size " + queue.size());
        System.out.println(queue.dequeue());
    }
}
