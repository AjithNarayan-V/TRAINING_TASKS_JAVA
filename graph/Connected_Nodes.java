
import java.util.ArrayList;
class Connected_Nodes {
	int V;
	ArrayList<ArrayList<Integer> > adjListArray;

	Connected_Nodes(int V)
	{
		this.V = V;
		adjListArray = new ArrayList<>();
		for (int i = 0; i < V; i++) {
			adjListArray.add(i, new ArrayList<>());
		}
	}
	void addEdge(int src, int dest)
	{
		adjListArray.get(src).add(dest);
		adjListArray.get(dest).add(src);
	}

	void DFSUtil(int v, boolean[] visited)
	{
		visited[v] = true;
		System.out.print(v + " ");  
		for (int x : adjListArray.get(v)) {
			if (!visited[x])
				DFSUtil(x, visited);
		}
	}
	void connectedComponents()
	{
		boolean[] visited = new boolean[V];
		for (int v = 0; v < V; ++v) {
			if (!visited[v]) {
				DFSUtil(v, visited);
				System.out.println();
			}
		}
	}
	public static void main(String[] args)
	{
		Connected_Nodes g = new Connected_Nodes(5);

		g.addEdge(1, 0);
		g.addEdge(2, 1);
		g.addEdge(3, 4);
		System.out.println(
			"Following are connected components");
		g.connectedComponents();
	}
}
