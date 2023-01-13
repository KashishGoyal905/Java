package _15_BT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _8_BuildPostIn {
    int data;
    _8_BuildPostIn left;
    _8_BuildPostIn right;

    public _8_BuildPostIn(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static void printI(_8_BuildPostIn root) {
        if (root == null) {
            return;
        }
        Queue<_8_BuildPostIn> q = new LinkedList<_8_BuildPostIn>();
        q.add(root);
        while (!q.isEmpty()) {
            _8_BuildPostIn frontNode = q.remove();
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

    public static _8_BuildPostIn Build(int[] in, int[] post, int inS, int inE, int postS, int postE) {
        if(inS > inE){
            return null;
        }

        int element = post[postE];
        _8_BuildPostIn root = new _8_BuildPostIn(element);
        int position = -1;
        for(int i = inS;i<=inE;i++){
            if(in[i]==element){
                position = i;
                break;
            }
        }
        if(position==-1){
            return null;
        }
        int leftInS = inS;
        int leftInE = position - 1;
        int leftpostS = postS;
        int leftpostE = leftInE - leftInS + leftpostS;
        int rightInS = position + 1;
        int rightInE = inE;
        int rightpostS = leftpostE + 1;
        int rightpostE = postE-1;
        root.left = Build(in,post,leftInS,leftInE,leftpostS,leftpostE);
        root.right = Build(in,post,rightInS,rightInE,rightpostS,rightpostE);
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
        int[] postorder = new int[n];
        System.out.println("Enter the values for postorder");
        for (int i = 0; i < n; i++) {
            postorder[i] = s.nextInt();
        }
        _8_BuildPostIn root = Build(inorder, postorder, 0, n - 1, 0, n - 1);
        printI(root);
    }

}