package _15_BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _3_preOrder {
    int data;
    _3_preOrder left;
    _3_preOrder right;

    public _3_preOrder(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    // ! Level Wise
    public static _3_preOrder takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data:");
        int rootData = s.nextInt();
        Queue<_3_preOrder> q = new LinkedList<_3_preOrder>();
        if (rootData == -1) {
            return null;
        }
        _3_preOrder root = new _3_preOrder(rootData);
        q.add(root);
        while (!q.isEmpty()) {
            _3_preOrder frontNode = q.remove();
            System.out.println("Enter the left child data of:" + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _3_preOrder left = new _3_preOrder(leftChildData);
                frontNode.left = left;
                q.add(left);
            } else {
                frontNode.left = null;
            }
            System.out.println("Enter the right child data of:" + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _3_preOrder right = new _3_preOrder(rightChildData);
                frontNode.right = right;
                q.add(right);
            } else {
                frontNode.right = null;
            }
        }
        return root;
    }

    public static void preOrder(_3_preOrder root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ", ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
    public static void main(String[] args) {
        // ! Level Wise
        _3_preOrder root = takeInputI();
        preOrder(root);
    }

}
