package org.example;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String [] strs){
        if (strs == null || strs.length()==0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char [] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

        }
    }
}





git!exit
