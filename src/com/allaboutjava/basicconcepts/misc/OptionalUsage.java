package com.allaboutjava.basicconcepts.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalUsage {

  public static void main(String[] args) {
    List<Optional<String>> input = new ArrayList<>();
    input.add(0, Optional.ofNullable("Sadiq"));
    input.add(1, Optional.ofNullable(null)); //this would other wise through NPE. Because of use of optional, NPE is prevented.
    input.add(2, Optional.ofNullable("Sarine"));
    for (int i = 0; i < input.size(); i++) {
      if (input.get(i).isPresent()) {
        System.out.println(input.get(i).get().concat(" hello"));
      }
    }
  }

}
