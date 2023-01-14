package _16_BST;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class _2_Search {
    int data;
    _2_Search left;
    _2_Search right;

    public _2_Search(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static _2_Search takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data: ");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        _2_Search root = new _2_Search(rootData);
        Queue<_2_Search> q = new LinkedList<_2_Search>();
        q.add(root);
        while (!q.isEmpty()) {
            _2_Search frontNode = q.remove();
            System.out.println("Enter the left child of: " + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _2_Search leftChild = new _2_Search(leftChildData);
                frontNode.left = leftChild;
                q.add(leftChild);
            }
            System.out.println("Enter the right child of: " + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _2_Search rightChild = new _2_Search(rightChildData);
                frontNode.right = rightChild;
                q.add(rightChild);
            }
        }
        return root;
    }

    public static _2_Search search(_2_Search root, int k) {
        if (root == null) {
            return null;
        }
        if (root.data == k) {
            return root;
        }

        if (root.data < k) {
            return search(root.right, k);
        } else {
            return search(root.left, k);
        }

    }

    public static void main(String[] args) {
        _2_Search root = takeInputI();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value you want to search: ");
        int k = s.nextInt();
        _2_Search ans = search(root, k);
        if (ans == null) {
            System.out.println("value is: " + ans);
        } else {
            System.out.println("value is: " + ans.data);
        }
    }
}
