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
        _3_node<Integer> temp = null;
        _3_node<Integer> temp2 = head;
        while(i!=index-1) {
            head = head.next;
            i++;
        }
        temp = head.next;
        _3_node<Integer> newNode = new _3_node<Integer>(data);
        head.next = newNode;
        newNode.next = temp;
        return temp2;
    }

    public static void main(String[] args) {
        _3_node<Integer> head = takeInput();
        print(head);
        _3_node<Integer> newHead = insert(head);
        print(newHead);
    }
}
