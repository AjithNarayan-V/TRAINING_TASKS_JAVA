// class public BellmanFord{
//     int n;
//     BellmanFord(int N){
//         n=N;
//     }
//     int minval(int graph[][],int dist[]){
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1;j++){
//                 if(graph[i][j]!=0 && dist[j]<min){
//                     min=dist[j];
//                     min_index=j;
//                 }
//             }
//         }
//     }

//     void bellman(int graph[][], int src){
//         int dist[]=new int[n];
//         dist[src]=0;

//     }

//     public static void main(String[] args){
//         BellmanFord BellmanFord=new BellmanFord(9);
//         int graph[][]={ 0,  4,  0,  0,  0,  0,  0,  8,  0 },
//         { 4,  0,  8,  0,  0,  0,  0, 11,  0 },
//         { 0,  8,  0,  7,  0,  4,  0,  0,  2 },
//         { 0,  0,  7,  0,  9, 14,  0,  0,  0 },
//         { 0,  0,  0,  9,  0, 10,  0,  0,  0 },
//         { 0,  0,  4, 14, 10,  0,  2,  0,  0 },
//         { 0,  0,  0,  0,  0,  2,  0,  1,  6 },
//         { 8, 11,  0,  0,  0,  0,  1,  0,  7 },
//         {-3, -4,  2,  0,  0,  0, -1, -6,  0 }
        


//     }
// }



public class BellmanFord {
    int n;

    BellmanFord(int N) {
        n = N;
    }

    int minval(int graph[][], int dist[]) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for (int i = 0; i < n; i++) {
            if (dist[i] < min) {
                min = dist[i];
                min_index = i;
            }
        }
        return min_index;
    }

    void bellman(int graph[][], int src) {
        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        // Relax all edges n-1 times
        for (int i = 0; i < n - 1; i++) {
            for (int u = 0; u < n; u++) {
                for (int v = 0; v < n; v++) {
                    if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }
        }

        // Check for negative cycles
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }

        // Print the distances
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        BellmanFord bellmanFord = new BellmanFord(9);
        int graph[][] = { 
            { 0, 4, 0, 0, 0, 0, 0, -8, 0 }, 
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
            { 0, 0, 7, 0, 9, -14, 0, 0, 0 }, 
            { 0, 0, 0, 9, 0, -10, 0, 0, 0 }, 
            { 0, 0, 4, -14, -10, 0, 2, 0, 0 },
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
            { -8, -11, 0, 0, 0, 0, 1, 0, 7 }, 
            { -3, -4, 2, 0, 0, 0, -1, -6, 0 } };

        bellmanFord.bellman(graph, 0);
    }
}
