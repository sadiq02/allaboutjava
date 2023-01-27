package com.allaboutjava.basicconcepts.problemsolving.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange
 * them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange
 * them according to their first name in alphabetical order. If those two students also have the
 * same first name, then order them according to their ID. No two students have the same ID.
 */
class Student {

  private int id;
  private String fname;
  private double cgpa;

  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }

  public int getId() {
    return id;
  }

  public String getFname() {
    return fname;
  }

  public double getCgpa() {
    return cgpa;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", fname='" + fname + '\'' +
        ", cgpa=" + cgpa +
        '}';
  }
}

//Complete the code
public class Sorting {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    Comparator<Student> cgpaComparator = Comparator.comparingDouble(Student::getCgpa).reversed();
    Comparator<Student> firstNameComparator = Comparator.comparing(Student::getFname);
    Comparator<Student> mainComparator = cgpaComparator.thenComparing(firstNameComparator)
        .thenComparing(Student::getId);

    List<Student> studentList = new ArrayList<Student>();

    while (testCases > 0) {
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();

      Student st = new Student(id, fname, cgpa);
      studentList.add(st);

      testCases--;
    }

    List<Student> output = studentList.stream().sorted(mainComparator).collect(Collectors.toList());
    output.stream().forEach(x -> System.out.println(x.getFname()));
  }
}



