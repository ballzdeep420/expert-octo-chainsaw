package edu.graphexam.main;

import java.util.LinkedList;

public class GraphExam {
	static class Edge{
		int source;
		int dest;
		int weight;
		
		public Edge(int source, int dest, int weight) {
			this.source = source;
			this.dest = dest;
			this.weight = weight;
		}
	}
	
	static class Graph{
		int vertices;
		LinkedList<Edge>[] adjL;
		
		Graph(int vertices){
			this.vertices = vertices;
			adjL = new LinkedList [vertices];
			
			for(int i = 0; i < vertices; i++) {
				adjL[i] = new LinkedList<>();
			}
		}
		public void addEdge(int source, int dest, int weight) {
			Edge edge = new Edge(source, dest, weight);
			adjL[source].addFirst(edge);
		}
		public void printGraph() {
			for(int i = 0; i < vertices; i++) {
				LinkedList<Edge> list = adjL[i];
				for(int j = 0; j < list.size(); j++) {
					System.out.println("vertex-"+i+" connected to "+list.get(j).dest+" with weight "+list.get(j).weight );
				}
			}
		}
	}
	public static void main(String[] args) {
		int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 4);
        graph.addEdge(4, 1, 4);
        graph.addEdge(4, 5, 6);
        graph.printGraph();
}
}







