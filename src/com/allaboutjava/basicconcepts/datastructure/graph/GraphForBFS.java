package com.allaboutjava.basicconcepts.datastructure.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphForBFS {

  private int numberOfVertices; //number of vertices in the graph
  private LinkedList<Integer> adjacentList[]; //adjacent list array to contains edges for each vertex

  GraphForBFS(int numberOfVertices) {
    this.numberOfVertices = numberOfVertices;
    adjacentList = new LinkedList[numberOfVertices]; //creating same number of adjacent list as that of number of vertices
    for (int i = 0; i < numberOfVertices;
        i++) { //creating as many linked lists as number of vertices
      adjacentList[i] = new LinkedList<>();
    }
  }

  void addEdge(int x, int y) {
    adjacentList[x].add(y); //just add an entry for the given vertices in respective linked lists
  }

  void bfsTraversal(int givenVertex) { //given vertex can be any vertex in the graph
    boolean visited[] = new boolean[numberOfVertices]; //an array of boolean values to track if a vertex is visited or not since there can be loops and it will result in infinite loop
    Queue<Integer> queue = new LinkedList<>(); //queue to add and poll the vertices for traversal

    visited[givenVertex] = true; //add the vertex to the visited array
    queue.add(givenVertex); //add it to the queue

    while (!queue.isEmpty()) { //till queue is empty continue the below flow. Because we are adding all the vertices and their adjacents to the queue, we are using this condition.
      givenVertex = queue.poll(); //poll the added vertex
      System.out.println(givenVertex); //print it
      Iterator<Integer> itr = adjacentList[givenVertex].iterator(); //iterate through the linked list of the removed vertex to print its adjacent vertices
      while (itr.hasNext()) {
        int temp = itr.next();
        if (!visited[temp]) { //add itt oqyeye only its not visited yet.
          visited[temp] = true;
          queue.add(temp);
        } else {
          //do nothing since its already visited
        }
      }

    }
  }

  // irrespective of the type of the graph i.e. whether directed or undirected, this logic works.
  boolean isLoopPresent(int vertex) {

    boolean visited[] = new boolean[numberOfVertices];
    Queue<Integer> queue = new LinkedList<>();

    visited[vertex] = true;
    queue.add(vertex);

    while (!queue.isEmpty()) {
      int temp1 = queue.poll();
      //System.out.println(temp1);
      Iterator<Integer> itr = adjacentList[temp1].iterator();
      while (itr.hasNext()) {
        int temp = itr.next();
        if (!visited[temp]) {
          visited[temp] = true;
          queue.add(temp);
        }
        if (visited[temp] && adjacentList[temp].contains(temp)) {
          System.out.println("GraphForBFS contains a loop at vertex : " + temp);
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    GraphForBFS graphForBFS = new GraphForBFS(4);
    graphForBFS.addEdge(0, 1);
    graphForBFS.addEdge(1, 1);
    graphForBFS.addEdge(0, 2);
    graphForBFS.addEdge(1, 2);
    graphForBFS.addEdge(2, 0);
    graphForBFS.addEdge(2, 3);
    graphForBFS.addEdge(3, 1);
    graphForBFS.addEdge(3, 0);

    // graphForBFS.addEdge(3, 3);

    System.out.println("BFS traversal from vertex 2\n");
    graphForBFS.bfsTraversal(2);
    System.out.println("Does given graphForBFS has a loop? : " + graphForBFS.isLoopPresent(2));
  }

}
