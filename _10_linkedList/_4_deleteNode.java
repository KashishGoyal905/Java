package _10_linkedList;

import java.util.Scanner;

public class _4_deleteNode {
    int data;
    _4_deleteNode next;

    _4_deleteNode(int data) {
        this.data = data;
        next = null;
    }

    public static void print(_4_deleteNode head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void takeInput(int length) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _4_deleteNode head = null;
        _4_deleteNode tail = null;
        while (data != -1) {
            _4_deleteNode newNode = new _4_deleteNode(data);
            length++;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = scanner.nextInt();
        }
        print(head);
        int index = scanner.nextInt();
        head = delete(head, index, length);
        print(head);
    }

    public static _4_deleteNode delete(_4_deleteNode head, int index, int length) {
        _4_deleteNode temp = head;
        int i = 0;
        if (index >= length) {
            return head;
        }
        if (index == 0) {
            head = head.next;
            return head;
        }
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;

    }

    public static void main(String[] args) {
        int length = 0;
        takeInput(length);

    }
}
