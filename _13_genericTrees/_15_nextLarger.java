package _13_genericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _15_nextLarger {
    int data;
    ArrayList<_15_nextLarger> Children;

    _15_nextLarger(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _15_nextLarger takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _15_nextLarger root = new _15_nextLarger(rootData);
        Queue<_15_nextLarger> q = new LinkedList<_15_nextLarger>();
        q.add(root);
        while (!q.isEmpty()) {
            _15_nextLarger frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _15_nextLarger child = new _15_nextLarger(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static int larger(_15_nextLarger root, int n) {
        if (root == null) {
            return -1;
        }
        int max = -1;
        if (root.data > n) {
            max = root.data;
        }
        for (int i = 0; i < root.Children.size(); i++) {
            max = Math.min(max, larger(root.Children.get(i), n));
        }
        return max;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        Scanner s = new Scanner(System.in);
        System.out.println("enter the tree:");
        _15_nextLarger root = takeInputI();
        System.out.println("enter the number:");
        int n = s.nextInt();
        int answer = larger(root, n);
        System.out.println("the next larger element is: " + answer);
    }
}
