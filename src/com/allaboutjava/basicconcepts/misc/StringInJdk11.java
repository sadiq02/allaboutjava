package com.allaboutjava.basicconcepts.misc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class StringInJdk11 {

  public static void main(String[] args) throws Exception {
    String s = "Sadiq Hussain";
    System.out.println(s.repeat(4));
    System.out.println(s.strip());

    String s1 = "Sadiq\nSarine\nDanish\nAmara";
    System.out.println(s1.lines().count());

    Path filePath = Path.of("/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/test.txt");
    String fileContent = Files.readString(filePath);
    System.out.println(fileContent);

    Path filePath1 = Path.of("/Users/sadiqhus/mygit/personal/allaboutjava/sample_files/test2.txt");
    Files.writeString(filePath1, fileContent);
   /* String fileContent1 = Files.readString(filePath1);
    System.out.println(fileContent1);*/
  }

}
