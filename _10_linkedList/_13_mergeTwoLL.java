package _10_linkedList;

import java.util.Scanner;

public class _13_mergeTwoLL {
    int data;
    _13_mergeTwoLL next;

    _13_mergeTwoLL(int data) {
        this.data = data;
        next = null;
    }

    public static _13_mergeTwoLL takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _13_mergeTwoLL head = null;
        _13_mergeTwoLL tail = null;
        while (data != -1) {
            _13_mergeTwoLL newNode = new _13_mergeTwoLL(data);
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

    public static void print(_13_mergeTwoLL head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static _13_mergeTwoLL sort(_13_mergeTwoLL head1, _13_mergeTwoLL head2) {
        _13_mergeTwoLL head = null;
        _13_mergeTwoLL temp = head;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                if (head == null) {
                    head = head1;
                    temp = head;
                    head1 = head1.next;
                } else {
                    temp.next = head1;
                    temp = temp.next;
                    head1 = head1.next;
                }
            } else {
                if (head == null) {
                    head = head2;
                    temp = head;
                    head2 = head2.next;
                } else {
                    temp.next = head2;
                    temp = temp.next;
                    head2 = head2.next;
                }
            }
        }
        while (head1 != null) {
            if (head == null) {
                head = head1;
                temp = head;
                head1 = head1.next;
            } else {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }
        }
        while (head2 != null) {
            if (head == null) {
                head = head2;
                temp = head;
                head2 = head2.next;
            } else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        _13_mergeTwoLL head1 = takeInput();
        _13_mergeTwoLL head2 = takeInput();
        _13_mergeTwoLL head = null;
        print(head1);
        System.out.println();
        print(head2);
        head = sort(head1, head2);
        print(head);
    }
}
