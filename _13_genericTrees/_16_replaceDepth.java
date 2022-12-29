// replace Treenode value by depth of that node.
package _13_genericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _16_replaceDepth {
    int data;
    ArrayList<_16_replaceDepth> Children;

    _16_replaceDepth(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _16_replaceDepth takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _16_replaceDepth root = new _16_replaceDepth(rootData);
        Queue<_16_replaceDepth> q = new LinkedList<_16_replaceDepth>();
        q.add(root);
        while (!q.isEmpty()) {
            _16_replaceDepth frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _16_replaceDepth child = new _16_replaceDepth(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static void replaceValues(_16_replaceDepth root, int count) {
        if (root == null) {
            return;
        }
        root.data = count;
        for(int i = 0; i < root.Children.size(); i++) {
            replaceValues(root.Children.get(i), count+1);
        }
    }

    public static void printI(_16_replaceDepth root) {
        Queue<_16_replaceDepth> q = new LinkedList<_16_replaceDepth>();
        q.add(root);
        while (!q.isEmpty()) {
            _16_replaceDepth frontNode = q.remove();
            System.out.print(frontNode.data + ": ");
            for (int i = 0; i < frontNode.Children.size(); i++) {
                System.out.print(frontNode.Children.get(i).data + ", ");
                q.add(frontNode.Children.get(i));
            }
            System.out.println();
        }
    }

    // 1 3 2 3 4 2 5 6 2 7 8 3 9 10 11 0 0 0 0 0 0 0
    public static void main(String[] args) {
        // ! Iteratively || levelwise
        System.out.println("enter the tree:");
        _16_replaceDepth root = takeInputI();
        System.out.println("enter the number:");
        replaceValues(root, 0);
        System.out.println("your tree after updating values is:");
        printI(root);
    }
}
