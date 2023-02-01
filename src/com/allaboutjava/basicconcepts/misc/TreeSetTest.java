package com.allaboutjava.basicconcepts.misc;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

  static class Person {

    int age;
    String name;
    String country;

    public Person(int age, String name, String country) {
      this.age = age;
      this.name = name;
      this.country = country;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    @Override
    public String toString() {
      return "Person{" +
          "age=" + age +
          ", name='" + name + '\'' +
          ", country='" + country + '\'' +
          '}';
    }
  }

  public static void main(String[] args) {
    Person person1 = new Person(33, "Sadiq", "India");
    Person person2 = new Person(33, "Sarine", "India");
    Person person3 = new Person(34, "aaa", "India");

    Comparator<Person> nameComparator = new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    };

    Comparator<Person> ageComparator = new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
      }
    };

    Comparator<Person> overallComparator = ageComparator.thenComparing(nameComparator);

    Set<Person> set = new TreeSet<>(overallComparator);
    set.add(person1);
    set.add(person2);
    set.add(person3);
    System.out.println(set);
  }

}
