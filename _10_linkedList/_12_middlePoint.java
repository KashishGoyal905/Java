package _10_linkedList;

import java.util.Scanner;

public class _12_middlePoint {
    int data;
    _12_middlePoint next;

    _12_middlePoint (int data) {
        this.data = data;
        next =null;
    }

    public static _12_middlePoint takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        _12_middlePoint head = null;
        _12_middlePoint tail = null;
        while(data != -1){
            _12_middlePoint newNode = new _12_middlePoint(data);
            if(head==null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = scanner.nextInt();
        }
        return head;
    }

    public static void print(_12_middlePoint head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void middlepoint(_12_middlePoint head){
        _12_middlePoint slow = head;
        _12_middlePoint fast = head;
        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("slow data is" + " -> " + slow.data);
    }
    public static void main (String[] args) {
        _12_middlePoint head = takeInput();
        print(head);
        middlepoint(head);
    }
}
