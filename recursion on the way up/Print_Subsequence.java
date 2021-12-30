//problem link:pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion#!


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
String s=sc.next();
printSS(s,"");
    }

    public static void printSS(String str, String ans) {
      if(str.length()==0){
      System.out.println(ans);
      return;
      }
       char s=str.charAt(0);
       String ss=str.substring(1);
        printSS(ss,ans+s);
        printSS(ss,ans+"");
    }

}