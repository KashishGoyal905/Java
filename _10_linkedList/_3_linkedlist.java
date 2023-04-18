package _10_linkedList;

import java.util.Scanner;

public class _3_linkedlist {
    public static _3_node<Integer> takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _3_node<Integer> head = null;
        _3_node<Integer> tail = null;

        while (data != -1) {
            _3_node<Integer> newNode = new _3_node<Integer>(data);
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

    public static void print(_3_node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static _3_node<Integer> insert(_3_node<Integer> head) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int data = scanner.nextInt();
        int i = 0;
        _3_node<Integer> temp2 = head;
        _3_node<Integer> newNode = new _3_node<Integer>(data);
        if (index == 0) {
            newNode.next = temp2;
            return newNode;
        }

        while (i < index - 1) {
            temp2 = temp2.next;
            i++;
        }
        newNode.next = temp2.next;
        temp2.next = newNode;
        return head;
    }

    public static _3_node<Integer> delete(_3_node<Integer> head) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int i = 0;
        _3_node<Integer> temp2 = head;
        if (index == 0) {
            head = head.next;
            return head;
        }
        while (i < index - 1) {
            temp2 = temp2.next;
            i++;
        }
        temp2.next = temp2.next.next;
        return head;
    }

    public static void main(String[] args) {
        _3_node<Integer> head = takeInput();
        print(head);
        head = insert(head);
        print(head);
        head = delete(head);
        print(head);
    }
}
