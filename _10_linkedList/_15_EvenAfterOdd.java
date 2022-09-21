package _10_linkedList;

import java.util.Scanner;

public class _15_EvenAfterOdd {
    int data;
    _15_EvenAfterOdd next;

    _15_EvenAfterOdd(int data) {
        this.data = data;
        next = null;
    }

    public static _15_EvenAfterOdd takeInput() {
        _15_EvenAfterOdd head = null;
        _15_EvenAfterOdd tail = null;
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        while (data != -1) {
            _15_EvenAfterOdd newNode = new _15_EvenAfterOdd(data);
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

    public static void print(_15_EvenAfterOdd head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void evenOdd(_15_EvenAfterOdd head) {
        _15_EvenAfterOdd temp = head;
        _15_EvenAfterOdd temp2 = head;
        _15_EvenAfterOdd prev = head;
        while(prev!=null && prev.next != null) {
            while(temp.next.data%2!=0){
                temp = temp.next;
            }
            temp2 = temp.next;
            while(temp2.data%2==0){
                temp2 = temp2.next;
            }
            prev = temp.next;
            temp.next = temp2;
            prev.next = temp2.next;
            temp2.next = prev;
            temp2 = prev;
            print(head);
        }
        // return head;
    }

    public static void main(String[] args) {
        _15_EvenAfterOdd head = takeInput();
        print(head);
        evenOdd(head);
        print(head);
    }
}
