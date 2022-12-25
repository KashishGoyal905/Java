package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _4_Height {
    int data;
    ArrayList<_4_Height> Children;

    _4_Height(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _4_Height takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _4_Height root = new _4_Height(rootData);
        Queue<_4_Height> q = new LinkedList<_4_Height>();
        q.add(root);
        while (!q.isEmpty()) {
            _4_Height frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _4_Height child = new _4_Height(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static int height(_4_Height root) {
        if (root == null) {
            return 0;
        }
        int length = 0;
        for (int i = 0; i < root.Children.size(); i++) {
            length = Math.max(length, height(root.Children.get(i)));
        }
        return length + 1;
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _4_Height root = takeInputI();
        int height = height(root);
        System.out.println("Height of the tree: " + height);
    }
}
