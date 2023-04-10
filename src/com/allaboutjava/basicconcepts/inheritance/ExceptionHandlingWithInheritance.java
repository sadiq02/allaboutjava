package com.allaboutjava.basicconcepts.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;

public class ExceptionHandlingWithInheritance {

   static class Parent{
        void show() throws IOException {
            System.out.println("Hi from parent");
        }
    }

    //child class with one narrower exception
   static class Child1 extends Parent{
        void show() throws FileNotFoundException {
            System.out.println("Hi from child1");
        }
    }

    //child class with no exception at all
    static class Child2 extends Parent{
        void show() {
            System.out.println("Hi from child2");
        }
    }

    //child class with multiple narrower exception
    static class Child3 extends Parent{
        void show() throws FileNotFoundException, FileAlreadyExistsException, FileSystemAlreadyExistsException {
            System.out.println("Hi from child3");
        }
    }

    public static void main(String[] args) throws IOException {
        Parent obj1 = new Child1();
        obj1.show();

        Parent obj2 = new Child2();
        obj2.show();

        Parent obj3 = new Child3();
        obj3.show();
    }
}
