package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _demo_tree {
    int data;
    ArrayList<_demo_tree> list;

    _demo_tree(int data) {
        this.data = data;
        list = new ArrayList<_demo_tree>();
    }

    // taking input recursively
    public static _demo_tree takeInputR() {
        Scanner s = new Scanner(System.in);
        int data = 0;
        System.out.println("Enter the " + data + " node data: ");
        data = s.nextInt();
        _demo_tree root = new _demo_tree(data);
        System.out.println("Enter the number of children of " + root.data + ": ");
        int children = s.nextInt();
        for (int i = 0; i < children; i++) {
            _demo_tree child = takeInputR();
            root.list.add(child);
        }
        return root;
    }

    // taking input iteratively
    public static _demo_tree takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data: ");
        int data = s.nextInt();
        _demo_tree root = new _demo_tree(data);
        Queue<_demo_tree> q = new LinkedList<_demo_tree>();
        q.add(root);
        while (!q.isEmpty()) {
            _demo_tree FrontNode = q.remove();
            System.out.println("Enter the number of children of " + FrontNode.data + ": ");
            int children = s.nextInt();
            for (int i = 0; i < children; i++) {
                System.out.println("Enter the " + (i + 1) + " th child of " + root.data + ": ");
                data = s.nextInt();
                _demo_tree child = new _demo_tree(data);
                q.add(child);
                FrontNode.list.add(child);
            }
        }
        return root;
    }

    // printing recursively
    public static void print(_demo_tree root) {
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
    public static void printLevelWise(_demo_tree root) {
        Queue<_demo_tree> queue = new LinkedList<_demo_tree>();
        queue.add(root);
        while (!queue.isEmpty()) {
            _demo_tree frontNode = queue.remove();
            System.out.print(frontNode.data + ": ");
            for (int i = 0; i < frontNode.list.size(); i++) {
                queue.add(frontNode.list.get(i));
                System.out.print(frontNode.list.get(i).data + ", ");
            }
            System.out.println();
        }
    }

    // find out the number of the nodes in a tree
    public static int getNumberOfNodes(_demo_tree root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.list.size(); i++) {
            count += getNumberOfNodes(root.list.get(i));
        }
        return count;
    }

    // Node with the largest data
    public static int largestData(_demo_tree root) {
        int largest = Integer.MIN_VALUE;
        Queue<_demo_tree> q = new LinkedList<_demo_tree>();
        q.add(root);
        if (root.data > largest) {
            largest = root.data;
        }
        while (!q.isEmpty()) {
            _demo_tree grab = q.remove();
            for (int i = 0; i < grab.list.size(); i++) {
                q.add(grab.list.get(i));
                if (grab.list.get(i).data > largest) {
                    largest = grab.list.get(i).data;
                }
            }
        }
        return largest;
    }

    public static int largestDataR(_demo_tree root) {
        // int largest = Integer.MIN_VALUE;

        int ans = root.data;
        for (int i = 0; i < root.list.size(); i++) {
            int child = largestDataR(root.list.get(i));
            if (child > ans) {
                ans = child;
            }
        }
        return ans;
    }

    // height of the tree
    public static int getHeight(tree root) {
        int count2 = 0;
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < root.list.size(); i++) {
            count = count + 1 + getHeight(root.list.get(i));
            if (count > count2) {
                count2 = count;
            }
        }
        return count2;
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
        _demo_tree root = takeInputI();
        // print(root); 
        printLevelWise(root);

        int numofnodes = getNumberOfNodes(root);
        System.out.println("Number of nodes are: " + numofnodes);

        int largest = largestData(root);
        System.out.println("largest node data is: " + largest);

        int largest2 = largestDataR(root);
        System.out.println("largest2 node data is: " + largest2);
    }

}
