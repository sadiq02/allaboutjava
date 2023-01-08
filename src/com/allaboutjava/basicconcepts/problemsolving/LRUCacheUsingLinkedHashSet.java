package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LRUCacheUsingLinkedHashSet {

  int size;
  LinkedHashSet<Object> lruCache;

  LRUCacheUsingLinkedHashSet(int size) {
    this.size = size;
    lruCache = new LinkedHashSet<>();
  }

  public int getCurrentCacheFilledSize() {
    return lruCache.size();
  }

  public int getCacheCapacity() {
    return size;
  }

  public boolean isCacheEmpty() {
    return size == 0;
  }

  public boolean isCacheFull() {
    return lruCache.size() == size;
  }

  public void refer(Object key) {
    if (!lruCache.contains(key)) {
      if (isCacheFull()) {
        Object temp = null;
        Iterator<Object> itr = lruCache.iterator();
        while (itr.hasNext()) {
          temp = itr.next();
          break;
        }
        System.out.println("Cache is currently full so removing least used item - " + temp
            + " and adding new item - " + key);
        lruCache.remove(temp);
        lruCache.add(key);
      } else {
        System.out.println("Referred item " + key + " does not exist in the cache so adding it!");
        lruCache.remove(key);
        lruCache.add(key);
      }
    } else {
      System.out.println("Referred item " + key + " exist in the cache so moving it to the top!");
      lruCache.remove(key);
      lruCache.add(key);
    }
  }

  public void displayCacheContent() {
    System.out.println("Current cache content\n");
    for (Object temp : lruCache) {
      System.out.println(temp);
    }
  }

  public static void main(String[] args) {
    LRUCacheUsingLinkedHashSet lruCache = new LRUCacheUsingLinkedHashSet(3);
    System.out.println("Is LRUCache Empty? - " + lruCache.isCacheEmpty());
    System.out.println("LRUCache capacity - " + lruCache.getCacheCapacity());
    lruCache.refer(1);
    lruCache.refer(2);
    System.out.println("Current occupancy of the cache - " + lruCache.getCurrentCacheFilledSize());
    lruCache.refer(3);
    lruCache.refer(1);
    lruCache.refer(4);
    lruCache.refer(5);
    lruCache.refer(6);
    System.out.println("Is LRUCache Full? - " + lruCache.isCacheFull());
    lruCache.displayCacheContent();
  }
}