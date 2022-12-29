package _13_genericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _9_greaterThanX {
    int data;
    ArrayList<_9_greaterThanX> Children;

    _9_greaterThanX(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _9_greaterThanX takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _9_greaterThanX root = new _9_greaterThanX(rootData);
        Queue<_9_greaterThanX> q = new LinkedList<_9_greaterThanX>();
        q.add(root);
        while (!q.isEmpty()) {
            _9_greaterThanX frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _9_greaterThanX child = new _9_greaterThanX(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static int GreaterX(_9_greaterThanX root, int x) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.data > x) {
            count += 1;
        }
        for (int i = 0; i < root.Children.size(); i++) {
            count += GreaterX(root.Children.get(i), x);
        }
        return count;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value by which you want to find nodes greatr than: ");
        int n = s.nextInt();
        _9_greaterThanX root = takeInputI();
        int Nodes = GreaterX(root, n);
        System.out.println("Number of Nodes greater than x are: " + Nodes);
    }
}
