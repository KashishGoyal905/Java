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

    public static _3_inRange insert(_3_inRange root,int data) {
        if(root==null){
            root = new _3_inRange(data);
            return root;
        }

        if(root.data>data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
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
        int[] values = { 8,5,3,1,4,6,10,11,14};
        _3_inRange root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first value for range: ");
        int k1 = s.nextInt();
        System.out.println("enter the second value for range: ");
        int k2 = s.nextInt();
        search(root, k1, k2);
    }
}
