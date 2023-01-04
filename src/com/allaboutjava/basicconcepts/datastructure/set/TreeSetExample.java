package com.allaboutjava.basicconcepts.datastructure.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.allaboutjava.basicconcepts.dto.Employee;

public class TreeSetExample {

  public static void main(String[] args) {

    Comparator<Employee> ageComparator = new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        if (o1.getAge() > o2.getAge()) {
          return -1;
        }
        if (o1.getAge() < o2.getAge()) {
          return 1;
        } else {
          return 0;
        }
      }
    };

    Comparator<Employee> nameComparator = new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
      }
    };

    Employee e1 = new Employee("Raj", 30, "Delhi");
    Employee e2 = new Employee("Sham", 33, "Bangalore");
    Employee e3 = new Employee("Dev", 29, "Orissa");

    Set<Employee> employeeSet1 = new TreeSet<>(ageComparator);
    employeeSet1.add(e1);
    employeeSet1.add(e2);
    employeeSet1.add(e3);
    System.out.println("**** TreeSet with age comparator ****\n");
    for (Employee employee : employeeSet1) {
      System.out.println(employee.toString());
    }

    Set<Employee> employeeSet2 = new TreeSet<>(nameComparator);
    employeeSet2.add(e1);
    employeeSet2.add(e2);
    employeeSet2.add(e3);
    System.out.println("\n**** TreeSet with name comparator ****\n");
    for (Employee employee : employeeSet2) {
      System.out.println(employee.toString());
    }
  }
}
