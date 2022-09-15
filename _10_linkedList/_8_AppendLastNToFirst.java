package _10_linkedList;

import java.util.Scanner;

public class _8_AppendLastNToFirst {
    int data;
    _8_AppendLastNToFirst next;

    _8_AppendLastNToFirst(int data) {
        this.data = data;
        next = null;
    }

    public static void takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _8_AppendLastNToFirst head = null;
        _8_AppendLastNToFirst tail = null;
        int length = 0;
        while (data != -1) {
            _8_AppendLastNToFirst newNode = new _8_AppendLastNToFirst(data);
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
        System.out.println("plz write the index you wnat to take append front");
        int index = scanner.nextInt();
        int ans = length - index;
        append(head, tail, ans);
    }

    public static void append(_8_AppendLastNToFirst head, _8_AppendLastNToFirst tail, int index) {
        int i = 0;
        _8_AppendLastNToFirst temp = head;
        while (i != index) {
            if (i + 1 == index) {
                _8_AppendLastNToFirst temp2 = head;
                head = head.next;
                temp2.next = null;
            } else {
                head = head.next;
            }
            i++;
        }
        tail.next = temp;
        print(head);
    }

    public static void print(_8_AppendLastNToFirst head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        takeInput();
    }
}
