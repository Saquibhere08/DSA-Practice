package DSADay30.leetcodeSolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Brute Force: O(n2)
    // public static int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             if(nums[j]+nums[i]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return null;    
    
    // }
    // public static int[] twoSum(int[] nums, int target){

    //     Map<Integer,Integer> map= new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         map.put(nums[i], i);
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
    //             return new int[]{i,map.get(target-nums[i])};
    //         }
    //     }
    //     return null;
    // }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int find=target-nums[i];
            if (map.containsKey(find)) {
                return new int[]{i,map.get(find)};
            }
            map.put(nums[i], i);
        }
        return null;
    }


    
    
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(nums));
        int [] result=twoSum(nums,18);
        System.out.println("Resultant Index: "+Arrays.toString(result));

    }
}

/*
1. Two Sum

Hint
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

*/