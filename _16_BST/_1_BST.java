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

    public static _1_BST insert(_1_BST root,int data) {
        if(root==null){
            root = new _1_BST(data);
            return root;
        }

        if(root.data>data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;
    }

    public static void inorder(_1_BST root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        _1_BST root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        inorder(root);
    }
}
  