package _13_genericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _6_countLeaf {
    int data;
    ArrayList<_6_countLeaf> Children;

    _6_countLeaf(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _6_countLeaf takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _6_countLeaf root = new _6_countLeaf(rootData);
        Queue<_6_countLeaf> q = new LinkedList<_6_countLeaf>();
        q.add(root);
        while (!q.isEmpty()) {
            _6_countLeaf frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _6_countLeaf child = new _6_countLeaf(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static int countLeaf(_6_countLeaf root) {
        if (root.Children.size() == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < root.Children.size(); i++) {
            count += countLeaf(root.Children.get(i));
        }
        return count;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    // 10 3 20 30 40 2 40 50 0 0 0 0

    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _6_countLeaf root = takeInputI();
        int leafNodes = countLeaf(root);
        System.out.println("Number of leaf nodes are: " + leafNodes);
    }
}
