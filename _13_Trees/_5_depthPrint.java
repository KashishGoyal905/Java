package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _5_depthPrint {
    int data;
    ArrayList<_5_depthPrint> Children;

    _5_depthPrint(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _5_depthPrint takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _5_depthPrint root = new _5_depthPrint(rootData);
        Queue<_5_depthPrint> q = new LinkedList<_5_depthPrint>();
        q.add(root);
        while (!q.isEmpty()) {
            _5_depthPrint frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _5_depthPrint child = new _5_depthPrint(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static void depthPrint(_5_depthPrint root, int k) {
        if (k == 0) {
            System.out.print(root.data + ", ");
            return;
        }
        for (int i = 0; i < root.Children.size(); i++) {
            depthPrint(root.Children.get(i), k - 1);
        }
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0

    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _5_depthPrint root = takeInputI();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the depth you want to print");
        int n = s.nextInt();
        depthPrint(root, n);
    }
}
