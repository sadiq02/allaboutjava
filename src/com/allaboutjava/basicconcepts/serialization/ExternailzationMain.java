package com.allaboutjava.basicconcepts.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternailzationMain {

  static class Person implements Externalizable {

    int age;
    String name;
    String country;

    public Person() {
    }

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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      out.writeObject(age);
      //out.writeObject(name);
      out.writeObject(country);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      age = (int) in.readObject();
     // name = (String) in.readObject();
      country = (String) in.readObject();
    }
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Person person = new Person(33, "Sadiq", "India");
    FileOutputStream outputStream = new FileOutputStream(
        "/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/externaliseObject.txt");
    ObjectOutputStream out = new ObjectOutputStream(outputStream);
    out.writeObject(person);
    out.close();

    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(
        "/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/externaliseObject.txt"));
    Person person1 = (Person) inputStream.readObject();
    System.out.println(person1.toString());
  }

}
