package org.example;

public class Palindrome {
    public Palindrome(){
        String string = "level";

        String reversedString = "";


        for(int i = string.length()-1; i >= 0; i--){
            reversedString = reversedString + string.charAt(i);
        }
        if(string.equalsIgnoreCase(reversedString)){
            System.out.println(string + " is a palindrome");

        }
        else{
            System.out.println(string + " is not a palindrome");
        }
    }
}
