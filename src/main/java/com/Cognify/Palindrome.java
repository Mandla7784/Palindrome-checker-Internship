package com.Cognify;

import java.util.Scanner;

public class Palindrome {
    public  static void  main(String[]  args){
        var scanner = new Scanner(System.in);
        System.out.println("Please enter a word you want to check ");

        String givenWord  = scanner.nextLine().toLowerCase().trim();
        System.out.println((isApalindrom(givenWord)));

    }
    static  String reverse(String word){
        String reverse_word = "";

        for (int i = 0 ; i < word.length() ; i++){
            reverse_word = word.charAt(i) + reverse_word;

        }
        return  reverse_word;

    }
    static  boolean isApalindrom(String giveWord){
      if(giveWord.equals(reverse(giveWord))){
          System.out.println("Its a Palindrome");
          return true;
      }else{
          return  false;


        }

    }
}
