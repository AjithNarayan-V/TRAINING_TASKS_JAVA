public class GraphRepresentation {
    private int[][] adjacencyMatrix;
    private int numVertices;

    // Constructor
    public GraphRepresentation(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    // Add edge between two vertices
    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        // If it's an undirected graph, you can also set the reverse edge
        adjacencyMatrix[destination][source] = 1;
    }

    // Print the adjacency matrix
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphRepresentation graph = new GraphRepresentation(5); // Create a graph with 5 vertices
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
