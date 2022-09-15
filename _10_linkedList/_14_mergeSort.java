package _10_linkedList;

import java.util.Scanner;

public class _14_mergeSort {
    int data;
    _14_mergeSort next;

    _14_mergeSort(int data) {
        this.data = data;
        next = null;
    }

    public static _14_mergeSort takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _14_mergeSort head = null;
        _14_mergeSort tail = null;
        while (data != -1) {
            _14_mergeSort newNode = new _14_mergeSort(data);
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

    public static void print(_14_mergeSort head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static _14_mergeSort mergeSort(_14_mergeSort head) {
        
        return head;
    }

    public static void main(String[] args) {
        _14_mergeSort head= takeInput();
        print(head);
        head = mergeSort(head);
        print(head);
}
