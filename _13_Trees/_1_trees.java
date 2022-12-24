package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1_trees {
    int data;
    ArrayList<_1_trees> trees;

    _1_trees(int data) {
        this.data = data;
        trees = new ArrayList<_1_trees>();
    }

    // ! Recursive
    public static _1_trees takeInputR() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int data = s.nextInt();
        _1_trees root = new _1_trees(data);
        System.out.println("Enter the number of children of" + root.data + "node");
        int children = s.nextInt();
        for (int i = 0; i < children; i++) {
            _1_trees child = takeInputR();
            root.trees.add(child);
        }
        return root;
    }

    public static void printR(_1_trees root) {
        System.out.print(root.data + ": ");
        for (int i = 0; i < root.trees.size(); i++) {
            System.out.print(root.trees.get(i).data + ", ");
        }
        System.out.println();
        for (int i = 0; i < root.trees.size(); i++) {
            printR(root.trees.get(i));
        }

    }

    // ! Iteratively || LevelWise
    public static _1_trees takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data");
        int data = s.nextInt();
        _1_trees root = new _1_trees(data);
        Queue<_1_trees> queue = new LinkedList<_1_trees>();
        queue.add(root);
        while (!queue.isEmpty()) {
            _1_trees top = queue.remove();
            System.out.println("Enter the number of children of" + top.data + "node");
            int number = s.nextInt();
            for (int i = 0; i < number; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + top.data + "node");
                int value = s.nextInt();
                _1_trees children = new _1_trees(value);
                queue.add(children);
                top.trees.add(children);
            }
        }
        return root;
    }

    public static void printI(_1_trees root) {
        Queue<_1_trees> q = new LinkedList<_1_trees>();
        q.add(root);
        while (!q.isEmpty()) {
            _1_trees front = q.remove();
            System.out.print(front.data + ": ");
            for (int i = 0; i < front.trees.size(); i++) {
                System.out.print(front.trees.get(i).data + ", ");
                q.add(front.trees.get(i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ! levelWise
        _1_trees root = takeInputI();
        printI(root);
        // ! Recusrive
        // _1_trees root = takeInputR();
        // printR(root);

    }
}
