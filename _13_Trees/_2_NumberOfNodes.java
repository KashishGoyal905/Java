package _13_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2_NumberOfNodes {
    int data;
    ArrayList<_2_NumberOfNodes> Children;

    _2_NumberOfNodes(int data) {
        this.data = data;
        Children = new ArrayList<>();
    }

    // ! Iteratively || LevelWise
    public static _2_NumberOfNodes takeInputI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node data");
        int rootData = s.nextInt();
        _2_NumberOfNodes root = new _2_NumberOfNodes(rootData);
        Queue<_2_NumberOfNodes> q = new LinkedList<_2_NumberOfNodes>();
        q.add(root);
        while (!q.isEmpty()) {
            _2_NumberOfNodes frontNode = q.remove();
            System.out.println("Enter the number of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + (i + 1) + "th children of " + frontNode.data);
                int childData = s.nextInt();
                _2_NumberOfNodes child = new _2_NumberOfNodes(childData);
                frontNode.Children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    public static int Nodes(_2_NumberOfNodes root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < root.Children.size(); i++) {
            ans += Nodes(root.Children.get(i));
        }
        return ans + 1;
    }

    public static void main(String[] args) {
        // ! Iteratively || levelwise
        _2_NumberOfNodes root = takeInputI();
        int nodes = Nodes(root);
        System.out.println("Number of nodes in this tree are: " + nodes);
    }
}
