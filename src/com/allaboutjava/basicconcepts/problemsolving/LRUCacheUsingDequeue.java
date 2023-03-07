package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Deque;
import java.util.LinkedList;

public class LRUCacheUsingDequeue {

  int size;
  Deque<Object> cache;

  LRUCacheUsingDequeue(int size) {
    this.size = size;
    cache = new LinkedList<>();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  private boolean isFull() {
    return cache.size() == size;
  }

  public int getCurrentOccupancy() {
    return cache.size();
  }

  public void refer(Object key) {
    if (!cache.contains(key)) {
      if (isFull()) {
        Object temp = cache.removeLast();
        cache.addFirst(key);
        System.out.println("Cache is full, removing " + temp + " from the cache");
      } else {
        System.out.println("Item " + key + " not present in the cache, so adding it");
        cache.addFirst(key);
      }
    } else {
      System.out.println(
          "Item " + key + " present in the cache, so removing and adding it to the front");
      cache.remove(key);
      cache.addFirst(key);
    }
  }

  public void displayCacheContent() {
    System.out.println("Current cache content");
    for (Object temp : cache) {
      System.out.println(temp);
    }

  }

  public static void main(String[] args) {
    LRUCacheUsingDequeue cache = new LRUCacheUsingDequeue(3);
    cache.refer(1);
    cache.refer(2);
    cache.refer(3);
    cache.displayCacheContent();
    cache.refer(4);
    cache.displayCacheContent();
    cache.refer(3);
    cache.displayCacheContent();
  }
}
