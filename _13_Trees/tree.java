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

    public static tree takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data value");
        int data = s.nextInt();
        tree root = new tree(data);
        System.out.println("Enter the number of children of " + root.data);
        int children = s.nextInt();
        for (int i = 0; i < children; i++) {
            tree child = takeInput();
            root.list.add(child);
        }
        return root;

    }

    public static void print(tree root) {
        String s  = root.data + ": ";
        for(int i = 0; i < root.list.size(); i++) {
            s = s + " " + root.list.get(i).data;
        }
        System.out.println(s);
        for(int i = 0; i < root.list.size(); i++){
            print(root.list.get(i));
        }
        }

    public static void main(String[] args) {
        tree root = takeInput();
        print(root);

    }
}
