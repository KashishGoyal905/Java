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

    public static _14_mergeSort middlepoint(_14_mergeSort head) {
        if(head == null){
            return head;
        }
        _14_mergeSort slow = head;
        _14_mergeSort fast = head;
        while (fast != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static _14_mergeSort sort(_14_mergeSort head1, _14_mergeSort head2) {
        _14_mergeSort result = null;
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data <= head2.data) {
            result = head1;
            result.next = sort(head1.next, head2);
        } else {
            result = head2;
            result.next = sort(head1, head2.next);
        }
        return result;

    }

    public static _14_mergeSort mergeSort(_14_mergeSort head) {
        if (head == null || head.next == null) {
            return head;
        }
        _14_mergeSort middle = middlepoint(head);
        _14_mergeSort tail = middle.next;
        middle.next = null;

        _14_mergeSort left = mergeSort(head);
        _14_mergeSort right = mergeSort(tail);
        _14_mergeSort sorted = sort(left, right);

        return sorted;
    }

    public static void main(String[] args) {
        _14_mergeSort head = takeInput();
        print(head);
        head = mergeSort(head);
        print(head);
    }
}
