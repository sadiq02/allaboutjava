package com.allaboutjava.basicconcepts.misc;


public class PersonDto {

  public final String city = "Bangalore";
  private String name;
  private Integer age;

  public PersonDto(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public PersonDto() {
  }

  @Override
  public String toString() {
    return "PersonDto{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
