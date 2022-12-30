package _15_BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _4_postOrder {
    int data;
    _4_postOrder left;
    _4_postOrder right;

    public _4_postOrder(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    // ! Level Wise
    public static _4_postOrder takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data:");
        int rootData = s.nextInt();
        Queue<_4_postOrder> q = new LinkedList<_4_postOrder>();
        if (rootData == -1) {
            return null;
        }
        _4_postOrder root = new _4_postOrder(rootData);
        q.add(root);
        while (!q.isEmpty()) {
            _4_postOrder frontNode = q.remove();
            System.out.println("Enter the left child data of:" + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _4_postOrder left = new _4_postOrder(leftChildData);
                frontNode.left = left;
                q.add(left);
            } else {
                frontNode.left = null;
            }
            System.out.println("Enter the right child data of:" + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _4_postOrder right = new _4_postOrder(rightChildData);
                frontNode.right = right;
                q.add(right);
            } else {
                frontNode.right = null;
            }
        }
        return root;
    }

    public static void postOrder(_4_postOrder root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + ", ");
    }

    // 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
    public static void main(String[] args) {
        // ! Level Wise
        _4_postOrder root = takeInputI();
        postOrder(root);
    }

}
