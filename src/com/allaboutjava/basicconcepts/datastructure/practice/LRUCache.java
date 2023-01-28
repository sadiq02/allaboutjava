package com.allaboutjava.basicconcepts.datastructure.practice;

import java.util.Deque;
import java.util.LinkedList;

public class LRUCache {

  int cacheSize;
  int currentSize;
  Deque<Integer> queue = new LinkedList<>();

  LRUCache(int cacheSize) {
    this.cacheSize = cacheSize;
    currentSize = 0;
  }

  void refer(int x) {
    if (queue.contains(x)) {
      queue.remove(x);
      queue.addFirst(x);
    } else {
      if (queue.size() == cacheSize) {
        System.out.println("Cache is full so polling - " + queue.poll());
        queue.addFirst(x);
      } else {
        queue.addFirst(x);
        currentSize++;
      }
    }
  }

  int getCurrentSize() {
    return currentSize;
  }

  int getCacheSize() {
    return cacheSize;
  }

  void currentCacheContent() {
    queue.stream().forEach(System.out::println);
  }

  int getMostRecentReferredItem() {
    return queue.peek();
  }

  public static void main(String[] args) {
    LRUCache lruCache = new LRUCache(4);
    lruCache.refer(1);
    lruCache.refer(2);
    lruCache.refer(3);
    lruCache.refer(4);
     lruCache.refer(5);
    lruCache.refer(2);
    System.out.println("Most recently referred item - " + lruCache.getMostRecentReferredItem());
    lruCache.currentCacheContent();
  }
}
