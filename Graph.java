import java.util.LinkedList;

public class Graph {
	// A user define class to represent a graph.
	// A graph is an array of adjacency lists.
	// Size of array will be V (number of vertices
	// in graph)

	int V;
	String color;
	LinkedList<Integer> adjListArray[];

	// constructor
	Graph(int V,String color) {
		this.V = V;
		this.color=color;
		// define the size of array as
		// number of vertices
		adjListArray = new LinkedList[V];
		// Create a new list for each vertex
		// such that adjacent nodes can be stored
		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<>();
		}
	}

	// Adds an edge to an undirected graph
	public void addEdge(Graph graph, int src, int dest) {
		// Add an edge from src to dest.
		graph.adjListArray[src].addFirst(dest);

		// Since graph is undirected, add an edge from dest
		// to src also
		graph.adjListArray[dest].addFirst(src);
	}

	// A utility function to print the adjacency list
	// representation of graph
	public void printGraph(Graph graph) {
		for (int v = 0; v < graph.V; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer pCrawl : graph.adjListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}
}
