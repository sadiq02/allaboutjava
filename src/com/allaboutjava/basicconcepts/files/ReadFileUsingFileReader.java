package com.allaboutjava.basicconcepts.files;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

  public static void main(String[] args) throws IOException {
    FileReader fileReader = new FileReader(
        "/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/test.txt");
    int i = 0;
    while ((i = fileReader.read()) != -1) {
      System.out.print((char) i);
    }
    fileReader.close();
  }
}
