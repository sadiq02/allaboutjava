package com.allaboutjava.basicconcepts.recurrsion;

public class PalindromeCheck {

  public boolean isPalindrome(int i, String str) {
    if (i >= str.length() / 2) {
      return true;
    }
    if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
      return false;
    }
    return isPalindrome(i + 1, str);
  }

  public static void main(String[] args) {
    PalindromeCheck palindromeCheck = new PalindromeCheck();
    String str = "madam";
    System.out.println(
        "Is given string" + str + " a palindrome? : " + palindromeCheck.isPalindrome(0, str));
    String str1 = "madama";
    System.out.println(
        "Is given string" + str1 + " a palindrome? : " + palindromeCheck.isPalindrome(0, str1));
  }
}
