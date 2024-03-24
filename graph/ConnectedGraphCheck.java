import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedGraphCheck {
    static int[] visited;
    static List<List<Integer>> graph;

    public static void main(String[] args) {
        int n = 7; // Number of nodes
        visited = new int[n];
        // Arrays.fill(visited, 0);/

        // Initialize the adjacency list representation of the graph
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Adding edges to the graph (undirected graph)
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(4, 5);
        addEdge(5, 6);

        // Example: Check if node 0 and node 6 are connected
        int source = 0;
        int destination = 6;

        if (isConnected(source, destination)) {
            System.out.println("Node " + source + " and Node " + destination + " are connected.");
        } else {
            System.out.println("Node " + source + " and Node " + destination + " are not connected.");
        }
    }

    // Function to add an edge between two nodes in the graph
    public static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // For undirected graph
    }

    // Depth First Search (DFS) traversal
    public static void DFS(int node) {
        visited[node] = 1; // Mark the current node as visited
        for (int neighbor : graph.get(node)) {
            if (visited[neighbor] == 0) {
                DFS(neighbor); // Recursive DFS traversal
            }
        }
    }

    // Function to check if two nodes are connected in the graph
    public static boolean isConnected(int source, int destination) {
        Arrays.fill(visited, 0); // Reset the visited array
        DFS(source); // Perform DFS traversal starting from source node
        return visited[destination] == 1; // Check if the destination node is visited
    }
}
