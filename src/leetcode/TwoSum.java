package leetcode;

import java.util.HashMap;

/**
 * Created by Fan on 2015/10/4.
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum {

    public TwoSum(){}

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                res[0] = map.get(nums[i])+1;
                res[1] = i+1;
            }
            else
                map.put(target-nums[i], i);
        }

        return res;
    }

    public static void main(String[] args){
        int[] num = {2, 7, 11, 15};
        int target = 9;

        TwoSum a = new TwoSum();

        int[] res = a.twoSum(num, target);

        System.out.println("Index1 = " + res[0] + ", Index2 = " + res[1]);
    }
}