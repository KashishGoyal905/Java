package _13_genericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7_PreOrder {
    int data;
    ArrayList<_7_PreOrder> Children;

    _7_PreOrder(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _7_PreOrder takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _7_PreOrder root = new _7_PreOrder(rootData);
        Queue<_7_PreOrder> q = new LinkedList<_7_PreOrder>();
        q.add(root);
        while (!q.isEmpty()) {
            _7_PreOrder frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _7_PreOrder child = new _7_PreOrder(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static void PreOrder(_7_PreOrder root) {
        if (root == null) {
            System.out.println("-1");
            return;
        }
        System.out.print(root.data + ", ");
        for (int i = 0; i < root.Children.size(); i++) {
            PreOrder(root.Children.get(i));
        }
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _7_PreOrder root = takeInputI();
        PreOrder(root);
    }
}
