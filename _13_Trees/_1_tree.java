package _13_Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class _1_tree {
    int data;
    ArrayList<_1_tree> list;

    _1_tree(int data) {
        this.data = data;
        list = new ArrayList<_1_tree>();
    }

    public static _1_tree takeInput() {
        Scanner s = new Scanner(System.in);
        int data = 0;
        System.out.println("Enter the " + data + " node data: ");
        data = s.nextInt();
        _1_tree root = new _1_tree(data);
        System.out.println("Enter the number of children of " + root.data + ": ");
        int children = s.nextInt();
        for (int i = 0; i < children; i++) {
            _1_tree child = takeInput();
            root.list.add(child);
        }
        return root;
    }

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
        _1_tree root = takeInput();
        print(root);
    }

}
