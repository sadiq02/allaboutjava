package com.allaboutjava.basicconcepts.String;

import java.util.HashMap;
import java.util.Map;

public class ImmutableExample {

  static final class Student {

    private final String name;
    private final int age;
    private final Map<String, Integer> metaData;

    Student(String name, int age, Map<String, Integer> metaData) {
      this.name = name;
      this.age = age;
      Map<String, Integer> tempData = new HashMap<>();
      for (Map.Entry<String, Integer> temp : metaData.entrySet()) { //deep cloning for reference types
        tempData.put(temp.getKey(), temp.getValue());
      }
      this.metaData = tempData;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }

    public Map<String, Integer> getMetaData() {
      Map<String, Integer> tempData = new HashMap<>();
      for (Map.Entry<String, Integer> temp : metaData.entrySet()) { //deep cloning for reference types
        tempData.put(temp.getKey(), temp.getValue());
      }
      return tempData;
    }

    @Override
    public String toString() {
      return "Student{" +
          "name='" + name + '\'' +
          ", age=" + age +
          ", metaData=" + metaData +
          '}';
    }
  }

  public static void main(String[] args) {
    Map<String, Integer> metadata = new HashMap<>();
    metadata.put("a-section", 8);
    Student student = new Student("Sadiq", 34, metadata);
    metadata.put("b-section", 9);
    System.out.println(student.toString());

  }

}
