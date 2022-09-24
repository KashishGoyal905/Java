package _12_Queues;

public class _2_queueUsingLL {
    private _2_queueUsingLL front;
    private _2_queueUsingLL rear;
    private int size;

    _2_queueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    int data;
    _2_queueUsingLL next;

    _2_queueUsingLL(int data) {
        this.data = data;
        this.next = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(int data) {
        _2_queueUsingLL newNode = new _2_queueUsingLL(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = rear.next;
        }
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("queue empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        size--;
        if (size == 0) {
            rear = null;
        }
        return value;
    }

    public int front() {
        if (size == 0) {
            System.out.println("queue empty");
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        _2_queueUsingLL queue = new _2_queueUsingLL();
        for (int i = 0; i <= 5; i++) {
            queue.enqueue(i);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

    }
}
