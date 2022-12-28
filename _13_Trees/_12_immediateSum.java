package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _12_immediateSum {
    int data;
    ArrayList<_12_immediateSum> Children;

    _12_immediateSum(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _12_immediateSum takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _12_immediateSum root = new _12_immediateSum(rootData);
        Queue<_12_immediateSum> q = new LinkedList<_12_immediateSum>();
        q.add(root);
        while (!q.isEmpty()) {
            _12_immediateSum frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _12_immediateSum child = new _12_immediateSum(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static int immediateSum(_12_immediateSum root) {
        if (root == null) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = root.data;
        int children = root.Children.size();
        for (int i = 0; i < children; i++) {
            sum += root.Children.get(i).data;
        }
        maxSum = Math.max(maxSum, sum);
        for (int i = 0; i < root.Children.size(); i++) {
            maxSum = Math.max(maxSum,immediateSum(root.Children.get(i)));
        }
        return maxSum;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _12_immediateSum root = takeInputI();
        int Sum = immediateSum(root);
        System.out.println("tree with max sum is: " + Sum);
    }
}
