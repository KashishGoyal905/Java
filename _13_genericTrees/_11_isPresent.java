package _13_genericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11_isPresent {
    int data;
    ArrayList<_11_isPresent> Children;

    _11_isPresent(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _11_isPresent takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _11_isPresent root = new _11_isPresent(rootData);
        Queue<_11_isPresent> q = new LinkedList<_11_isPresent>();
        q.add(root);
        while (!q.isEmpty()) {
            _11_isPresent frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _11_isPresent child = new _11_isPresent(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static boolean isPresent(_11_isPresent root, int n) {
        boolean ans;
        if (root.data == n) {
            return true;
        } else {
            ans = false;
        }
        for (int i = 0; i < root.Children.size(); i++) {
            ans = ans || isPresent(root.Children.get(i), n);
        }
        return ans;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int n = s.nextInt();
        _11_isPresent root = takeInputI();
        boolean ans = isPresent(root, n);
        System.out.println(ans);
    }
}
