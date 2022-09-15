package _10_linkedList;

import java.util.Scanner;

public class _7_findNode {
    int data;
    _7_findNode next;

    _7_findNode(int data) {
        this.data = data;
        next = null;
    }

    public static _7_findNode takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _7_findNode head = null;
        _7_findNode tail = null;
        while (data != -1) {
            _7_findNode newNode = new _7_findNode(data);
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

    public static void print(_7_findNode head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void find(_7_findNode head, int data) {
        int i = 0;
        while (head.data != data) {
            if(head.next == null) {
                System.out.println("-1");
                return;
            }
            head = head.next;
            i++;
        }
        System.out.println("index is-> " + i);
    }

    public static void main(String[] args) {
        _7_findNode head = takeInput();
        print(head);
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("plz write the value you want index for");
        int data = scanner.nextInt();
        find(head, data);
    }
}
