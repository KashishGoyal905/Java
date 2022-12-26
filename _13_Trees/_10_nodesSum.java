package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _10_nodesSum {
    int data;
    ArrayList<_10_nodesSum> Children;

    _10_nodesSum(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _10_nodesSum takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _10_nodesSum root = new _10_nodesSum(rootData);
        Queue<_10_nodesSum> q = new LinkedList<_10_nodesSum>();
        q.add(root);
        while (!q.isEmpty()) {
            _10_nodesSum frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _10_nodesSum child = new _10_nodesSum(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static int Sum(_10_nodesSum root) {
        if (root == null) {
            return 0;
        }
        int Sum = 0;
        Sum += root.data;
        for (int i = 0; i < root.Children.size(); i++) {
            Sum+=Sum(root.Children.get(i));
        }
        return Sum;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _10_nodesSum root = takeInputI();
        int Sum = Sum(root);
        System.out.println("Sum of all the nodes in the tree is: " + Sum);
    }
}
