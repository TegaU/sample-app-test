package com.interswitch.test;

public class UpperLowerCase {
    public String wordToUpper(String word){
        if(null !=word){
            String[] words = word.split(" ");
            return words[0].toUpperCase();
        }
        throw new IllegalArgumentException("Word cannot be empty or null");
    }
    public String wordToLower(String word){
        if(null !=word){
            String[] words = word.split(" ");
            return words[0].toLowerCase();
        }
        throw new IllegalArgumentException("Word cannot be empty or null");
    }

}
