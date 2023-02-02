package com.allaboutjava.basicconcepts.cloning;

public class PrimitiveDataType {

  static class Person implements Cloneable {

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
    public Object clone() throws CloneNotSupportedException {
      return super.clone();
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

  public static void main(String[] args) throws CloneNotSupportedException {
    Person person = new Person(33, "Sadiq", "India");
    Person clonedPerson = (Person) person.clone();
    clonedPerson.setAge(34);
    clonedPerson.setName("Sarine");
    System.out.println("Original object - " + person.toString());
    System.out.println("Cloned object - " + clonedPerson.toString());
  }
}
