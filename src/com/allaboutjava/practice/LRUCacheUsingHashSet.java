package com.allaboutjava.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LRUCacheUsingHashSet {

  static class LRUCache {

    int size;
    LinkedHashSet<Integer> cache;

    LRUCache(int size) {
      this.size = size;
      cache = new LinkedHashSet<>();
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public boolean isFull() {
      return cache.size() == size;
    }

    public void refer(int x) {
      if (!cache.contains(x)) {
        if (isFull()) {
          Iterator<Integer> itr = cache.iterator();
          int temp = 0;
          while (itr.hasNext()) {
            temp = itr.next();
            break; //because we need to remove the least refered element which is first element in linkedhashset
          }
          System.out.println("Removing least used element from cache - " + temp);
          cache.remove(temp);
          cache.add(x);
        } else {
          cache.add(x);
        }
      } else {
        cache.remove(x);
        cache.add(x);
      }

    }

    public void showContent() {
      System.out.println("Current cache content");
      cache.stream().forEach(System.out::println);
    }
  }

  public static void main(String[] args) {
    LRUCache lruCache = new LRUCache(3);
    lruCache.refer(1);
    lruCache.refer(2);
    lruCache.refer(3);
    lruCache.refer(4);
    lruCache.refer(45);
    lruCache.showContent();
  }


}
