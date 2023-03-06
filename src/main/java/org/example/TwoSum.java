package org.example;
import java.util.HashMap;

public class TwoSum {

    //method to add two sums to target
    public static int[] twoSum(int[] nums1, int target){
        //new empty hashset
        HashMap<Integer , Integer> prevMap= new HashMap<>();

        //for every array element
        for(int i = 0; i < nums1.length; i++){
            int num = nums1[i];
            int diff = target - num;

        if(prevMap.containsKey(diff)){
            return new int[] {prevMap.get(diff), i};
        }
        prevMap.put(num, i);
        }
        return new int[]{};

    }


}
