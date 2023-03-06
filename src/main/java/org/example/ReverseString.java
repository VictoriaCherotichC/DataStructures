package org.example;

public class ReverseString {
    public ReverseString() {
        String string = "Victoria";
        //Stores the reverse of given string
        StringBuilder reversedStr = new StringBuilder();


        //Iterate through the string from last and add each character to variable reversedStr
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedStr.append(string.charAt(i));
        }
        System.out.println("Original " + string);
        System.out.println("Reversed " + reversedStr);
    }
}
