package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1_trees {
    int data;
    ArrayList<_1_trees> Children;

    _1_trees(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Recursively
    public static _1_trees takeInputR() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _1_trees root = new _1_trees(rootData);
        System.out.println("Enter the number of children of " + rootData);
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            _1_trees child = takeInputR();
            root.Children.add(child);
        }
        return root;
    }

    public static void printR(_1_trees root) {
        System.out.print(root.data + ": ");
        for (int i = 0; i < root.Children.size(); i++) {
            System.out.print(root.Children.get(i).data + ", ");
        }
        System.out.println();
        for (int i = 0; i < root.Children.size(); i++) {
            printR(root.Children.get(i));
        }
    }

    // ! Iteratively || LevelWise
    public static _1_trees takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _1_trees root = new _1_trees(rootData);
        Queue<_1_trees> q = new LinkedList<_1_trees>();
        q.add(root);
        while (!q.isEmpty()) {
            _1_trees frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _1_trees child = new _1_trees(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static void printI(_1_trees root) {
        Queue<_1_trees> q = new LinkedList<_1_trees>();
        q.add(root);
        while (!q.isEmpty()) {
            _1_trees frontNode = q.remove();
            System.out.print(frontNode.data + ": ");
            for (int i = 0; i < frontNode.Children.size(); i++) {
                System.out.print(frontNode.Children.get(i).data + ", ");
                q.add(frontNode.Children.get(i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ! Recursive
        // _1_trees root = takeInputR();
        // printR(root);

        // ! Iteratively || levelwise
        _1_trees root = takeInputI();
        printI(root);
    }
}
