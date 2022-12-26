package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _8_PostOrder {
    int data;
    ArrayList<_8_PostOrder> Children;

    _8_PostOrder(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _8_PostOrder takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _8_PostOrder root = new _8_PostOrder(rootData);
        Queue<_8_PostOrder> q = new LinkedList<_8_PostOrder>();
        q.add(root);
        while (!q.isEmpty()) {
            _8_PostOrder frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _8_PostOrder child = new _8_PostOrder(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static void PostOrder(_8_PostOrder root) {
        if (root == null) {
            System.out.println("-1");
            return;
        }
        for (int i = 0; i < root.Children.size(); i++) {
            PostOrder(root.Children.get(i));
        }
        System.out.print(root.data + ", ");
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    // 1 2 2 3 2 4 5 2 6 7 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _8_PostOrder root = takeInputI();
        PostOrder(root);
    }
}
