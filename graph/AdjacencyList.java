import java.util.*;

// Class to represent a graph using adjacency list
class AdjacencyList {
    private int V; // Number of vertices
    private LinkedList<Integer> adj[]; // Array of lists to store adjacency lists

    // Constructor
    AdjacencyList(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list
    }

    // Function to print the adjacency list representation of graph
    void printGraph() {
        for (int i = 0; i < V; ++i) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (Integer vertex : adj[i]) {
                System.out.print(vertex + "->");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Creating a graph with 4 vertices
        AdjacencyList graph = new AdjacencyList(4);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 1);


        // Printing the adjacency list representation of the graph
        graph.printGraph();
    }
}
