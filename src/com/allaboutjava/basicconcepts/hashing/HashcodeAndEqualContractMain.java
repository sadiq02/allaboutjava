package com.allaboutjava.basicconcepts.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * To demonstrate the importance of overriding equal and hascode functions when working with a
 * datastructure that involves hashing mechanism
 */
public class HashcodeAndEqualContractMain {

  public static void main(String[] args) {
   Set<Person> personSet = new HashSet<>();

    Person p1 = new Person(33, "Sadiq");
    Person p2 = new Person(33, "Sadiq");

    personSet.add(p1);
    personSet.add(p2);

    System.out.println(personSet);


  }

}
