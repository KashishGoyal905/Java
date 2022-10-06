package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1_tree {
    int data;
    ArrayList<_1_tree> list;

    _1_tree(int data) {
        this.data = data;
        list = new ArrayList<_1_tree>();
    }

    // taking input recursively
    public static _1_tree takeInputR() {
        Scanner s = new Scanner(System.in);
        int data = 0;
        System.out.println("Enter the " + data + " node data: ");
        data = s.nextInt();
        _1_tree root = new _1_tree(data);
        System.out.println("Enter the number of children of " + root.data + ": ");
        int children = s.nextInt();
        for (int i = 0; i < children; i++) {
            _1_tree child = takeInputR();
            root.list.add(child);
        }
        return root;
    }

    // taking input iteratively
    public static _1_tree takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data: ");
        int data = s.nextInt();
        _1_tree root = new _1_tree(data);
        Queue<_1_tree> q = new LinkedList<_1_tree>();
        q.add(root);
        while (!q.isEmpty()) {
            _1_tree FrontNode = q.remove();
            System.out.println("Enter the number of children of " + FrontNode.data + ": ");
            int children = s.nextInt();
            for (int i = 0; i < children; i++) {
                System.out.println("Enter the " + (i + 1) + " th child of " + root.data + ": ");
                data = s.nextInt();
                _1_tree child = new _1_tree(data);
                q.add(child);
                FrontNode.list.add(child);
            }
        }
        return root;
    }

    // printing recursively
    public static void print(_1_tree root) {
        String s = root.data + ": ";
        for (int i = 0; i < root.list.size(); i++) {
            s = s + root.list.get(i).data + ", ";
        }
        System.out.println(s);
        for (int i = 0; i < root.list.size(); i++) {
            print(root.list.get(i));
        }
    }

    // printing iteratively
    public static void printLevelWise(_1_tree root) {
        Queue<_1_tree> queue = new LinkedList<_1_tree>();
        queue.add(root);
        while (!queue.isEmpty()) {
            _1_tree frontNode = queue.remove();
            System.out.print(frontNode.data + ": ");
            for (int i = 0; i < frontNode.list.size(); i++) {
                queue.add(frontNode.list.get(i));
                System.out.print(frontNode.list.get(i).data + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // _1_tree root = new _1_tree(4);
        // _1_tree node1 = new _1_tree(2);
        // _1_tree node2 = new _1_tree(3);
        // _1_tree node3 = new _1_tree(5);
        // _1_tree node4 = new _1_tree(6);
        // root.list.add(node1);
        // root.list.add(node2);
        // root.list.add(node3);
        // node2.list.add(node4);
        // System.out.println(root.data);

        // input form user
        // _1_tree root = takeInputR();
        _1_tree root = takeInputI();
        // print(root);
        printLevelWise(root);
    }

}
