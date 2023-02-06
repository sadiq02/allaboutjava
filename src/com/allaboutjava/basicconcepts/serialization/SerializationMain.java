package com.allaboutjava.basicconcepts.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationMain {

  static class Person implements Serializable {

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

  public static void main(String[] args) throws IOException {
    Person person = new Person(33, "Sadiq", "India");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(
        "/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/serializedObject.ser"));
    objectOutputStream.writeObject(person);
    objectOutputStream.close();
  }

}
