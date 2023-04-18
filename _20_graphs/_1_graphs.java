package _20_graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1_graphs {

    public static void printHelperDFS(int[][] matrix, int sv, boolean[] visited) {
        // DFS Traversal
        System.out.print(sv + " ");
        visited[sv] = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[sv][i] == 1 && !visited[i]) {
                printHelperDFS(matrix, i, visited);
            }
        }
    }

    public static void printDFS(int[][] matrix) {
        boolean[] visited = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (!visited[i]) {
                printHelperDFS(matrix, i, visited);
            }
        }
    }

    public static void printHelperBFS(int[][] matrix, int sv, boolean[] visited) {
        // BFS Traversal
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[sv][i] == 1 && !visited[sv]) {
                visited[sv] = true;
                queue.add(sv);
            }
        }

        while (!queue.isEmpty()) {
            int front = queue.poll();
            System.out.print(front + " ");
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[front][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void printBFS(int[][] matrix) {
        boolean[] visited = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (!visited[i]) {
                printHelperBFS(matrix, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of vertices in the graph: ");
        int vertices = s.nextInt();
        System.out.println("Enter the number of edges in the graph: ");
        int edges = s.nextInt();

        int[][] matrix = new int[vertices][vertices];
        for (int i = 0; i < edges; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }
        // ! DFS Traversal
        System.out.println("DFS printing: ");
        printDFS(matrix);
        // ! BFS Traversal
        System.out.println();
        System.out.println("BFS printing: ");
        printBFS(matrix);

    }
}
