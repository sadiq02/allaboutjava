package com.allaboutjava.basicconcepts.misc;

public class ClassForMeDemo {

  public static void main(String[] args)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Class className = Class.forName("com.allaboutjava.basicconcepts.misc.PersonDto");
    System.out.println(className.getName());
    PersonDto personDto = (PersonDto) className.newInstance();

   System.out.println(personDto.city);
  }
}
