package com.allaboutjava.basicconcepts.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.allaboutjava.basicconcepts.serialization.SerializationMain.Child;
import com.allaboutjava.basicconcepts.serialization.SerializationMain.Person;

public class DeserializationMain {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(
        "/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/serializedObject.ser"));
    Person person = (Person) inputStream.readObject();
    System.out.println(person.toString());
    inputStream.close();

    ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream(
        "/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/serializedChildObject.ser"));
    Child child = (Child) inputStream1.readObject();
    System.out.println(child.toString());
    inputStream1.close();
  }

}
