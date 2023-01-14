package _16_BST;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class _3_inRange {
    int data;
    _3_inRange left;
    _3_inRange right;

    public _3_inRange(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static _3_inRange takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data: ");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        _3_inRange root = new _3_inRange(rootData);
        Queue<_3_inRange> q = new LinkedList<_3_inRange>();
        q.add(root);
        while (!q.isEmpty()) {
            _3_inRange frontNode = q.remove();
            System.out.println("Enter the left child of: " + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _3_inRange leftChild = new _3_inRange(leftChildData);
                frontNode.left = leftChild;
                q.add(leftChild);
            }
            System.out.println("Enter the right child of: " + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _3_inRange rightChild = new _3_inRange(rightChildData);
                frontNode.right = rightChild;
                q.add(rightChild);
            }
        }
        return root;
    }

    public static void search(_3_inRange root, int k1, int k2) {
        if (root == null) {
            // System.out.println("null");
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + ", ");
        }

        if(root.data>k2 ){
            search(root.left, k1, k2);
        }else if(root.data<k1){
            search(root.right, k1, k2);
        }else{
            search(root.left, k1, k2);
            search(root.right, k1, k2);
        }
        
    }

    public static void main(String[] args) {
        _3_inRange root = takeInputI();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first value for range: ");
        int k1 = s.nextInt();
        System.out.println("enter the second value for range: ");
        int k2 = s.nextInt();
        search(root, k1, k2);
    }
}
