package _15_BT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _5_height {
    int data;
    _5_height left;
    _5_height right;

    public _5_height(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    // ! Level Wise
    public static _5_height takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data:");
        int rootData = s.nextInt();
        Queue<_5_height> q = new LinkedList<_5_height>();
        if (rootData == -1) {
            return null;
        }
        _5_height root = new _5_height(rootData);
        q.add(root);
        while (!q.isEmpty()) {
            _5_height frontNode = q.remove();
            System.out.println("Enter the left child data of:" + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _5_height left = new _5_height(leftChildData);
                frontNode.left = left;
                q.add(left);
            } else {
                frontNode.left = null;
            }
            System.out.println("Enter the right child data of:" + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _5_height right = new _5_height(rightChildData);
                frontNode.right = right;
                q.add(right);
            } else {
                frontNode.right = null;
            }
        }
        return root;
    }

    public static int height(_5_height root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
    public static void main(String[] args) {
        // ! Level Wise
        _5_height root = takeInputI();
        int height = height(root);
        System.out.println("Height of the BST is: " + height);
    }

}
