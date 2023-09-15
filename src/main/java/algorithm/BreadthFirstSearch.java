package algorithm;

import java.util.*;

// This class represents an undirected graph using adjacency list representation
class BreadthFirstSearch {
    private int numberOfVertices;
    private LinkedList<LinkedList<Integer>> adjacencyList = new LinkedList<>();

    BreadthFirstSearch(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        for (int i = 0; i < numberOfVertices; ++i)
            adjacencyList.add(new LinkedList());
    }

    // Function to add an edge into the graph
    void addEdge(int from, int to) {
        adjacencyList.get(from).add(to);
        adjacencyList.get(to).add(from);
    }

    // Prints BFS traversal from a given source s
    void bfsTraversal(int vertex) {
        // Mark all the vertices as UNVISITED (By default set as false).
        boolean[] visited = new boolean[numberOfVertices];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[vertex] = true;
        queue.add(vertex);

        while (!queue.isEmpty()) {
            vertex = queue.poll();
            System.out.print(vertex + " ");

            // Get all adjacent vertices of the dequeued vertex
            for (int n : adjacencyList.get(vertex)) {
                if (!visited[n]) {
                    // If an adjacent Vertex has not been visited, then mark it visited and enqueue it
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BreadthFirstSearch graph = new BreadthFirstSearch(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 1);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);

        System.out.println("Breadth First Traversal from 1 is:");

        graph.bfsTraversal(1);
    }
}

