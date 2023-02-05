package com.allaboutjava.basicconcepts.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

  public static void main(String[] args) throws IOException {
    FileWriter fileWriter = new FileWriter(
        "/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/test.txt");
    fileWriter.write("Hi there!\nThis is a sample file created via java program");
    fileWriter.close();
  }

}
