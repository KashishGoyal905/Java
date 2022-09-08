package _10_linkedList;

import java.util.Scanner;

public class _6_print_Ith {
    int data;
    _6_print_Ith next;

    _6_print_Ith(int data) {
        this.data = data;
        next = null;
    }

    public static _6_print_Ith takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _6_print_Ith head = null;
        _6_print_Ith tail = null;
        while (data != -1) {
            _6_print_Ith newNode = new _6_print_Ith(data);
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

    public static void print(_6_print_Ith head,int i){
        int k = 0;
        while(k!=i){
            head = head.next;
            k++;
        }
        System.out.println("data is "  + head.data);
    }
    public static void main(String[] args) {
        _6_print_Ith head =  takeInput();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        print(head,i);
    }

}
