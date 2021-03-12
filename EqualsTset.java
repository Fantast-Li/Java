package com.li;

public class EqualsTset {
    public static void main(String[] args) {
        String str =  "ming" ;
        String str1 = "ming" ;
        System.out.println(str==str1);
      String string = new String("ming");
      String string1 = new String("ming");
      System.out.println(string == string1);
      System.out.println(string.equals(string1));
    }
}
