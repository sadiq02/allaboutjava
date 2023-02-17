package com.allaboutjava.basicconcepts.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareLists {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<String>(List.of(new String[]{"Sadiq", "Sarine"}));
    List<String> list2 = new ArrayList<String>(List.of(new String[]{"Danish", "Amara"}));
    List<String> list3 = new ArrayList<String>(List.of(new String[]{"Sadiq", "Sarine"}));
    System.out.println("Are given lists unique ? : " + Collections.disjoint(list1, list2));
    System.out.println("Are given lists unique ? : " + Collections.disjoint(list1, list3));
  }
}
