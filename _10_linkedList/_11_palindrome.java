package _10_linkedList;

import java.util.Scanner;

public class _11_palindrome {
    int data;
    static int length = 0;
    _11_palindrome next;

    _11_palindrome(int data) {
        this.data = data;
        next = null;
    }

    public static void takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _11_palindrome head = null;
        _11_palindrome tail = null;
        while (data != -1) {
            _11_palindrome newNode = new _11_palindrome(data);
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
        int arr[] = new int[length];
        // while

        // return head;
    }
// todo later---

    public static void print(_11_palindrome head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static _11_palindrome reverse(_11_palindrome head) {
        _11_palindrome current = head;
        _11_palindrome prev = null;
        _11_palindrome next = null;
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
        takeInput();
        // print(head);
        // _11_palindrome head2 = reverse(head);
        // print(head2);
        // print(head);
        // print(head2);
    }
}
