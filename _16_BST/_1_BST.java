package _16_BST;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// nothing different same as BT

public class _1_BST {
    int data;
    _1_BST left;
    _1_BST right;

    public _1_BST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static _1_BST takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data: ");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        _1_BST root = new _1_BST(rootData);
        Queue<_1_BST> q = new LinkedList<_1_BST>();
        q.add(root);
        while (!q.isEmpty()) {
            _1_BST frontNode = q.remove();
            System.out.println("Enter the left child of: " + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _1_BST leftChild = new _1_BST(leftChildData);
                frontNode.left = leftChild;
                q.add(leftChild);
            }
            System.out.println("Enter the right child of: " + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _1_BST rightChild = new _1_BST(rightChildData);
                frontNode.right = rightChild;
                q.add(rightChild);
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
            if (frontNode.left != null) {
                System.out.print(frontNode.left.data + "(L), ");
                q.add(frontNode.left);
            }
            if (frontNode.right != null) {
                System.out.print(frontNode.right.data + "(R)");
                q.add(frontNode.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        _1_BST root = takeInputI();
        printI(root);
    }
}
