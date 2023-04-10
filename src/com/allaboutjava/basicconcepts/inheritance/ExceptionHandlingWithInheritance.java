package com.allaboutjava.basicconcepts.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingWithInheritance {

   static class Parent{
        void show() throws IOException {
            System.out.println("Hi from parent");
        }
    }

   static class Child extends Parent{
        void show() throws FileNotFoundException {
            System.out.println("Hi from child");
        }
    }

    public static void main(String[] args) throws IOException {
        Parent obj = new Child();
        obj.show();
    }
}
