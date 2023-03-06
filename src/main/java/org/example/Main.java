package org.example;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (unique.contains(nums[i])) {
                return true;
            }
            unique.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2 , 3, 4 , 5, 5};
        int [] nums1 = {2,7,11,15};
        int target = 9;

        Main obj = new Main();
        TwoSum obj1 = new TwoSum();
        ReverseString obj2 = new ReverseString();
        Palindrome obj3 = new Palindrome();
        CorrectCapitalization obj4 = new CorrectCapitalization();
        int size = TwoSum.twoSum(nums1,target).length;
        int[] arr =   TwoSum.twoSum(nums1,target);

        for (int i = 0; i <= size-1; i++ )
        {
            System.out.println(arr[i]);
        }
            ////System.out.println(containsDuplicate(nums));
           // System.out.println(obj2.toString());
           // System.out.println(obj3.toString());
            System.out.println(obj4);
    }
}
