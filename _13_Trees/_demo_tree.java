package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _demo_tree {
    int data;
    ArrayList<_demo_tree> trees;

    _demo_tree(int data) {
        this.data = data;
        trees = new ArrayList<_demo_tree>();
    }

    // ! Recursive
    public static _demo_tree takeInputR() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int data = s.nextInt();
        _demo_tree root = new _demo_tree(data);
        System.out.println("Enter the number of children of" + root.data + "node");
        int children = s.nextInt();
        for (int i = 0; i < children; i++) {
            _demo_tree child = takeInputR();
            root.trees.add(child);
        }
        return root;
    }

    public static void printR(_demo_tree root) {
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
    public static _demo_tree takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data");
        int data = s.nextInt();
        _demo_tree root = new _demo_tree(data);
        Queue<_demo_tree> queue = new LinkedList<_demo_tree>();
        queue.add(root);
        while (!queue.isEmpty()) {
            _demo_tree top = queue.remove();
            System.out.println("Enter the number of children of" + top.data + "node");
            int number = s.nextInt();
            for (int i = 0; i < number; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + top.data + "node");
                int value = s.nextInt();
                _demo_tree children = new _demo_tree(value);
                queue.add(children);
                top.trees.add(children);
            }
        }
        return root;
    }

    public static void printI(_demo_tree root) {
        Queue<_demo_tree> q = new LinkedList<_demo_tree>();
        q.add(root);
        while (!q.isEmpty()) {
            _demo_tree front = q.remove();
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
        _demo_tree root = takeInputI();
        printI(root);
        // ! Recusrive
        // _demo_tree root = takeInputR();
        // printR(root);

    }
}
