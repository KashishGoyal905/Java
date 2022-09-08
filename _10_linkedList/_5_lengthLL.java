package _10_linkedList;

import java.util.Scanner;

public class _5_lengthLL {
    int data;
    _5_lengthLL next;

    _5_lengthLL(int data) {
        this.data = data;
        next = null;
    }


    public static void takeInput(int length) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _5_lengthLL head = null;
        _5_lengthLL tail = null;
        while (data != -1) {
            _5_lengthLL newNode = new _5_lengthLL(data);
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
        System.out.println("Lenght of ll is " + length);
    }

    public static void main(String[] args){
        int length = 0;
        takeInput(length);
    }

}
