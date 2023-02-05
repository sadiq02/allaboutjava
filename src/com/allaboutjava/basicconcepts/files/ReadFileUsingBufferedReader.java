package com.allaboutjava.basicconcepts.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(
        new FileReader("/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/test1.txt"));
    int i = 0;
    while ((i = reader.read()) != -1) {
      System.out.print((char) i);
    }
    reader.close();
  }
}
