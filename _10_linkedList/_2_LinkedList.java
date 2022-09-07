package _10_linkedList;

import java.util.Scanner;

public class _2_LinkedList {
    // pirnt function
    public static void print(_2_Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    // take input function
    public static _2_Node<Integer> takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _2_Node<Integer> head = null;
        _2_Node<Integer> tail = null;

        while (data != -1) {
            _2_Node<Integer> newNode = new _2_Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // _2_Node<Integer> temp = head;
                // while (temp.next != null) {
                //     temp = temp.next;
                // }
                // temp.next = newNode;
                tail.next = newNode;
                tail = tail.next;
            }

            data = scanner.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        // 1.// creating linkedlist nodes with node class which have 2 properties data
        // and next.
        // _2_Node<Integer> node1 = new _2_Node<Integer>(10);
        // System.out.println(node1.data);
        // System.out.println(node1.next);
        // // creataing 2nd node and connecting it with first node
        // _2_Node<Integer> node2 = new _2_Node<Integer>(20);
        // node1.next = node2;
        // System.out.println(node2.data);
        // System.out.println(node1.next);
        // System.out.println(node2);

        // 2. creating 3 nodes connecting them and printing them out
        // _2_Node<Integer> node1 = new _2_Node<Integer>(10);
        // _2_Node<Integer> node2 = new _2_Node<Integer>(20);
        // _2_Node<Integer> node3 = new _2_Node<Integer>(30);
        // // connecting
        // node1.next = node2;
        // node2.next = node3;
        // // printing
        // _2_Node<Integer> head = node1;
        // while(head!= null){
        // System.out.println(head.data);
        // head = head.next;
        // }

        // 3. taking input form the user uding funcitons
        _2_Node<Integer> head = takeInput();
        print(head);

    }
}
