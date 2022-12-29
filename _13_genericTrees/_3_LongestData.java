package _13_genericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _3_LongestData {
    int data;
    ArrayList<_3_LongestData> Children;

    _3_LongestData(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _3_LongestData takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _3_LongestData root = new _3_LongestData(rootData);
        Queue<_3_LongestData> q = new LinkedList<_3_LongestData>();
        q.add(root);
        while (!q.isEmpty()) {
            _3_LongestData frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _3_LongestData child = new _3_LongestData(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static int data(_3_LongestData root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int data = root.data;
        for (int i = 0; i < root.Children.size(); i++) {
            data = Math.max(data, data(root.Children.get(i)));
        }
        return data;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _3_LongestData root = takeInputI();
        int data = data(root);
        System.out.println("Node with largest data is: " + data);
    }
}
