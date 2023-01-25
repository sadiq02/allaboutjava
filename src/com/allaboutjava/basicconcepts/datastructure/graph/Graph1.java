package com.allaboutjava.basicconcepts.datastructure.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph1 {

  private int numberOfVertices;
  private LinkedList<Integer> adjacencyList[];

  Graph1(int numberOfVertices) {
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
    Graph1 graph1 = new Graph1(4);
    graph1.addEdge(0, 1);
    graph1.addEdge(0, 2);
    graph1.addEdge(1, 2);
    graph1.addEdge(2, 0);
    graph1.addEdge(2, 3);
    graph1.addEdge(3, 3);
    System.out.println("DFS Traversal from vertex 2\n");
    graph1.dfsTraversal(2);
  }

}
