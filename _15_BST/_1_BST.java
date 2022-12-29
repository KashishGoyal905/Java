package _15_BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1_BST {
    int data;
    _1_BST left;
    _1_BST right;

    public _1_BST(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    // ! Recursively
    public static _1_BST takeInputR() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data:");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        _1_BST root = new _1_BST(rootData);
        root.left = takeInputR();
        root.right = takeInputR();
        return root;
    }

    public static void printR(_1_BST root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ": ");
        if (root.left != null) {
            System.out.print(root.left.data + "(L), ");
        }
        if (root.right != null) {
            System.out.print(root.right.data + "(R)");
        }
        System.out.println();
        printR(root.left);
        printR(root.right);
    }

    // ! Level Wise
    public static _1_BST takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data:");
        int rootData = s.nextInt();
        Queue<_1_BST> q = new LinkedList<_1_BST>();
        if (rootData == -1) {
            return null;
        }
        _1_BST root = new _1_BST(rootData);
        q.add(root);
        while (!q.isEmpty()) {
            _1_BST frontNode = q.remove();
            System.out.println("Enter the left child data of:" + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _1_BST left = new _1_BST(leftChildData);
                frontNode.left = left;
                q.add(left);
            } else {
                frontNode.left = null;
            }
            System.out.println("Enter the right child data of:" + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _1_BST right = new _1_BST(rightChildData);
                frontNode.right = right;
                q.add(right);
            } else {
                frontNode.right = null;
            }
        }
        return root;
    }

    public static void printI(_1_BST root) {
        if (root == null) {
            return;
        }
        Queue<_1_BST> q = new LinkedList<_1_BST>();
        q.add(root);
        while (!q.isEmpty()) {
            _1_BST frontNode = q.remove();
            System.out.print(frontNode.data + ": ");
            if (root.left != null) {
                System.out.print(root.left.data + "(L), ");
                q.add(root.left);
            }
            if (root.right != null) {
                System.out.print(root.right.data + "(R)");
                q.add(root.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ! Recursively
        // _1_BST root = takeInputR();
        // printR(root);
        // ! Level Wise
        _1_BST root = takeInputI();
        printR(root);
    }

}
