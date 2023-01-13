package _15_BT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _6_inOrder {
    int data;
    _6_inOrder left;
    _6_inOrder right;

    public _6_inOrder(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    // ! Level Wise
    public static _6_inOrder takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data:");
        int rootData = s.nextInt();
        Queue<_6_inOrder> q = new LinkedList<_6_inOrder>();
        if (rootData == -1) {
            return null;
        }
        _6_inOrder root = new _6_inOrder(rootData);
        q.add(root);
        while (!q.isEmpty()) {
            _6_inOrder frontNode = q.remove();
            System.out.println("Enter the left child data of:" + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _6_inOrder left = new _6_inOrder(leftChildData);
                frontNode.left = left;
                q.add(left);
            } else {
                frontNode.left = null;
            }
            System.out.println("Enter the right child data of:" + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _6_inOrder right = new _6_inOrder(rightChildData);
                frontNode.right = right;
                q.add(right);
            } else {
                frontNode.right = null;
            }
        }
        return root;
    }

    public static void inOrder(_6_inOrder root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + ", ");
        inOrder(root.right);
    }

    // 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
    public static void main(String[] args) {
        // ! Level Wise
        _6_inOrder root = takeInputI();
        inOrder(root);
    }

}
