package org.example;

public class CorrectCapitalization {
    public boolean correctCapitalization() {
        String str = "uSa";

        if (str.toUpperCase().equals(str) || str.toLowerCase().equals(str)) {
            return true;
        }else{
            return false;
        }


    }
}
