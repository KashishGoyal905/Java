package _15_BT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2_noOfNodes {
    int data;
    _2_noOfNodes left;
    _2_noOfNodes right;

    public _2_noOfNodes(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    // ! Level Wise
    public static _2_noOfNodes takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data:");
        int rootData = s.nextInt();
        Queue<_2_noOfNodes> q = new LinkedList<_2_noOfNodes>();
        if (rootData == -1) {
            return null;
        }
        _2_noOfNodes root = new _2_noOfNodes(rootData);
        q.add(root);
        while (!q.isEmpty()) {
            _2_noOfNodes frontNode = q.remove();
            System.out.println("Enter the left child data of:" + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                _2_noOfNodes left = new _2_noOfNodes(leftChildData);
                frontNode.left = left;
                q.add(left);
            } else {
                frontNode.left = null;
            }
            System.out.println("Enter the right child data of:" + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                _2_noOfNodes right = new _2_noOfNodes(rightChildData);
                frontNode.right = right;
                q.add(right);
            } else {
                frontNode.right = null;
            }
        }
        return root;
    }

    public static int count(_2_noOfNodes root) {
        if(root==null){
            return 0;
        }
        return count(root.right) + count(root.left) + 1;
    }
    
    // 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
    public static void main(String[] args) {
        // ! Level Wise
        _2_noOfNodes root = takeInputI();
        int noOfNodes = count(root);
        System.out.println("Number of node in this binary tree are: " + noOfNodes);
    }

}
