package com.allaboutjava.basicconcepts.datastructure.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphForDFS {

  private int numberOfVertices;
  private LinkedList<Integer> adjacencyList[];

  GraphForDFS(int numberOfVertices) {
    this.numberOfVertices = numberOfVertices;
    adjacencyList = new LinkedList[numberOfVertices];
    for (int i = 0; i < numberOfVertices; i++) {
      adjacencyList[i] = new LinkedList<>();
    }
  }

  void addEdge(int a, int b) {
    adjacencyList[a].add(b);
  }

  void dfsTraversal(int a) {
    boolean visited[] = new boolean[numberOfVertices];
    dfsUtil(a, visited);
  }

  private void dfsUtil(int vertex, boolean[] visited) {
    visited[vertex] = true;
    System.out.println(vertex);

    Iterator<Integer> itr = adjacencyList[vertex].iterator();
    while (itr.hasNext()) {
      int temp = itr.next();
      if (!visited[temp]) {
        dfsUtil(temp, visited);
      }
    }
  }

  public static void main(String[] args) {
    GraphForDFS graphForDFS = new GraphForDFS(4);
    graphForDFS.addEdge(0, 1);
    graphForDFS.addEdge(0, 2);
    graphForDFS.addEdge(1, 2);
    graphForDFS.addEdge(2, 0);
    graphForDFS.addEdge(2, 3);
    graphForDFS.addEdge(3, 3);
    System.out.println("DFS Traversal from vertex 2\n");
    graphForDFS.dfsTraversal(2);
  }

}
