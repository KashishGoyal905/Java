package _10_linkedList;

import java.util.Scanner;

public class _9_removeDuplicates {
    int data;
    _9_removeDuplicates next;

    _9_removeDuplicates(int data) {
        this.data = data;
        next = null;
    }

    public static _9_removeDuplicates takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _9_removeDuplicates head = null;
        _9_removeDuplicates tail = null;
        while (data != -1) {
            _9_removeDuplicates newNode = new _9_removeDuplicates(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = scanner.nextInt();
        }
        return head;
    }

    public static void print(_9_removeDuplicates head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static _9_removeDuplicates reverse(_9_removeDuplicates head) {
        _9_removeDuplicates current = head;
        _9_removeDuplicates prev = null;
        _9_removeDuplicates next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next; 
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        _9_removeDuplicates head = takeInput();
        print(head);
        head = reverse(head);
        print(head);
    }
}
