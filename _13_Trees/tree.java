package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tree {
    int data;
    ArrayList<tree> list;

    tree(int data) {
        this.data = data;
        list = new ArrayList<tree>();
    }

    public static tree takeInputR() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the root data");
        int data = scanner.nextInt();
        tree root = new tree(data);
        System.out.println("Enter the number of children of " + root.data + ": ");
        int children = scanner.nextInt();
        for (int i = 0; i < children; i++) {
            tree child = takeInputR();
            root.list.add(child);
        }
        return root;
    }

    public static tree takeInputI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the root data");
        int data = scanner.nextInt();
        Queue<tree> q = new LinkedList<tree>();
        tree root = new tree(data);
        q.add(root);
        while (!q.isEmpty()) {
            tree frontNode = q.remove();
            System.out.println("enter the number of children of " + frontNode.data);
            int children = scanner.nextInt();
            for (int i = 0; i < children; i++) {
                System.out.println("enter the " + i + " th child of " + frontNode.data);
                int childData = scanner.nextInt();
                tree child = new tree(childData);
                q.add(child);
                frontNode.list.add(child);
            }
        }
        return root;
    }

    // print recursively
    public static void print(tree root) {
        System.out.print(root.data + ": ");
        for (int i = 0; i < root.list.size(); i++) {
            System.out.print(root.list.get(i).data + ", ");
        }
        System.out.println();
        for (int i = 0; i < root.list.size(); i++) {
            print(root.list.get(i));
        }
    }

    // print levelWise
    public static void printLevelWise(tree root) {
        Queue<tree> queue = new LinkedList<tree>();
        queue.add(root);
        while (!queue.isEmpty()) {
            tree frontNode = queue.remove();
            System.out.print(frontNode.data + ": ");
            for (int i = 0; i < frontNode.list.size(); i++) {
                queue.add(frontNode.list.get(i));
                System.out.print(frontNode.list.get(i).data + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // tree root = takeInputR();
        tree root = takeInputI();
        // print(root);
        printLevelWise(root);
    }

}
