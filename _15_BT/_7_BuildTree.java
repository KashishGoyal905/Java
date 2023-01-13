package _15_BT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// using preorder and inorder

public class _7_BuildTree {
    int data;
    _7_BuildTree left;
    _7_BuildTree right;

    public _7_BuildTree(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static void printI(_7_BuildTree root) {
        if (root == null) {
            return;
        }
        Queue<_7_BuildTree> q = new LinkedList<_7_BuildTree>();
        q.add(root);
        while (!q.isEmpty()) {
            _7_BuildTree frontNode = q.remove();
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

    public static int positionOf(int[] in, int element, int n) {
        for (int i = 0; i < n; i++) {
            if (in[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static _7_BuildTree Build(int[] in, int[] pre, int inS, int inE, int preS, int preE) {
        if (inS > inE) {
            return null;
        }
        int element = pre[preS];
        _7_BuildTree root = new _7_BuildTree(element);
        int position = -1;
        for(int i = inS; i <= inE; i++) {
            if(in[i] == element) {
                position = i;
                break;
            }
        }
        if(position == -1) {
            return null;
        }
        int leftInS = inS;
        int leftInE = position - 1;
        int leftPreS = preS + 1;;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = position + 1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;
        root.left = Build(in, pre, leftInS, leftInE, leftPreS, leftPreE);
        root.right = Build(in, pre, rightInS, rightInE, rightPreS, rightPreE);
        return root;
    }

    // 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of inorder array");
        int n = s.nextInt();
        int[] inorder = new int[n];
        System.out.println("Enter the values for inorder");
        for (int i = 0; i < n; i++) {
            inorder[i] = s.nextInt();
        }
        int[] preorder = new int[n];
        System.out.println("Enter the values for preorder");
        for (int i = 0; i < n; i++) {
            preorder[i] = s.nextInt();
        }
        _7_BuildTree root = Build(inorder, preorder, 0, n-1, 0, n-1);
        printI(root);
    }

}
