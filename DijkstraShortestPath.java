package Dijkstra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DijkstraShortestPath {

	PriorityQueue<Integer> S = new PriorityQueue<Integer>();
	static int V = 9;
	static PriorityQueue<Edge> Q = new PriorityQueue<Edge>(V, new MyComparator());
	// static LinkedList<Edge> adjListArray[];
	static int INF = 99999;

	// A user define class to represent a graph.
	// A graph is an array of adjacency lists.
	// Size of array will be V (number of vertices
	// in graph)
	static class Graph {
		int V;
		LinkedList<Edge> adjListArray[];

		// constructor
		Graph(int V) {
			this.V = V;

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
		public void addEdge(int src, int dest, int weight) {
			Edge edge = new Edge(src, dest, weight);
			adjListArray[src].addFirst(edge); // for directed graph
			//Q.add(edge);
		}

		// A utility function to print the adjacency list
		// representation of graph
		public void printGraph() {
			for (int i = 0; i < 9; i++) {
				LinkedList<Edge> list = adjListArray[i];
				for (int j = 0; j < list.size(); j++) {
					System.out.println("vertex-" + i + " is connected to " + list.get(j).dest + " with weight "
							+ list.get(j).dist);
				}
			}
		}
	}

	static class Edge {

		int src;
		int dest;
		int dist;

		Edge(int source, int destination, int distance) {
			this.src = source;
			this.dest = destination;
			this.dist = distance;
		}

	}

	public static class MyComparator implements Comparator<Edge> {
		public int compare(Edge x, Edge y) {
			return x.dist - y.dist;
		}
	}

	public static void main(String[] args) {
		int verticies = 9;
		Graph G = new Graph(verticies);
		
		G.addEdge(0, 1, 4);
		G.addEdge(0, 7, 8);
		G.addEdge(1, 2, 8);
		G.addEdge(1, 7, 11);
		G.addEdge(2, 3, 7);
		G.addEdge(2, 5, 4);
		G.addEdge(2, 8, 2);
		G.addEdge(3, 4, 9);
		G.addEdge(3, 5, 14);
		G.addEdge(4, 5, 10);
		G.addEdge(5, 6, 2);
		G.addEdge(6, 7, 1);
		G.addEdge(6, 8, 6);
		G.addEdge(7, 8, 7);

		// print the adjacency list representation of
		// the above graph
		G.printGraph();
		
	}
}
