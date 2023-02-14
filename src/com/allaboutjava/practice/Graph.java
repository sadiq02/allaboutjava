package com.allaboutjava.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

  int v;
  LinkedList[] al;

  Graph(int v) {
    this.v = v;
    al = new LinkedList[v];
    for (int i = 0; i < v; i++) {
      al[i] = new LinkedList();
    }
  }

  void addEdge(int u, int v) {
    al[u].add(v);
  }

  void bfs(int source) {
    boolean visited[] = new boolean[300];
    Queue<Integer> queue = new LinkedList<>();
    visited[source] = true;
    queue.add(source);

    while (!queue.isEmpty()) {
      int temp = queue.poll();
      System.out.println(temp);

      Iterator<Integer> itr = al[temp].iterator();
      while (itr.hasNext()) {
        int temp1 = itr.next();
        if (!visited[temp1]) {
          visited[temp1] = true;
          queue.add(temp1);
        }
      }
    }
  }

  public static void main(String[] args) {
    Graph graph = new Graph(4);
    graph.addEdge(0, 1);
    graph.addEdge(1, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 1);
    graph.addEdge(3, 0);
    System.out.println("BFS traversal from vertex 2\n");
    graph.bfs(2);
  }
}
