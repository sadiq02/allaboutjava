package com.allaboutjava.basicconcepts.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

  public static void main(String[] args) {
    //filter with Optional
    Integer year = 2023;
    Optional<Integer> opYear = Optional.ofNullable(year);
    System.out.println("Is it 2023? - " + opYear.filter(x -> x == 2023).isPresent());
    System.out.println("Is it 2024? - " + opYear.filter(x -> x == 2024).isPresent());

    //get()
    Optional<String> opString = Optional.ofNullable("Sadiq");
    System.out.println(opString.get());
    System.out.println(opString.isPresent());
    //orElse

    String temp = null;
    String str = Optional.ofNullable(temp).orElse("defaultValue");
    System.out.println(str);
    //Optional.ofNullable(temp).orElseThrow(); // This will throw NoSuchElement Exception since there is no element present in this optional field.

    //Option with List data type
    List<String> input = new ArrayList<>();
    input.add("Sadiq");
    input.add("Sarine");
    Optional<List<String>> opList = Optional.of(input);
    System.out.println("Optional List size - " + opList.map(z -> z.size()).orElse(0));
  }
}
