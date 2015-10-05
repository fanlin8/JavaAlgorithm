package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Fan on 10/05/2015.
 * Given a set of distinct integers, nums, return all possible subsets.

 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If nums = [1,2,3], a solution is:
 *
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++){
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> list : res){
                list = new ArrayList<>(list);
                list.add(nums[i]);
                //System.out.println(list.toString());
                temp.add(list);
            }

            List<Integer> one = new ArrayList<>();
            one.add(nums[i]);
            temp.add(one);
            //System.out.println(temp.toString());
            res.addAll(temp);
        }

        res.add(new ArrayList<>());

        return res;
    }

    public Subsets() {}

    public static void main (String[] args) {
        int[] nums = {1, 0, 3};
        Subsets a = new Subsets();
        List<List<Integer>> subsets = a.subsets(nums);

        System.out.println(subsets.toString());
    }
}
