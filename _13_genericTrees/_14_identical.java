package _13_genericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _14_identical {
    int data;
    ArrayList<_14_identical> Children;

    _14_identical(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _14_identical takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _14_identical root = new _14_identical(rootData);
        Queue<_14_identical> q = new LinkedList<_14_identical>();
        q.add(root);
        while (!q.isEmpty()) {
            _14_identical frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _14_identical child = new _14_identical(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static boolean isIdentical(_14_identical root1, _14_identical root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean ans = false;
        if (root1.data == root2.data) {
            ans = true;
        }
        for (int i = 0; i < root1.Children.size(); i++) {
            ans = ans && isIdentical(root1.Children.get(i), root2.Children.get(i));
        }
        return ans;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        System.out.println("enter the first tree:");
        _14_identical root1 = takeInputI();
        System.out.println("enter the second tree:");
        _14_identical root2 = takeInputI();
        boolean identical = isIdentical(root1, root2);
        System.out.println("is both tree identical: " + identical);
    }
}
