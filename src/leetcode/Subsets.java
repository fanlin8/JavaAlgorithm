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

        for (int i : nums){
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> list : res){
                list = new ArrayList<>(list);
                list.add(i);
                //System.out.println(list);
                temp.add(list);
            }

            List<Integer> one = new ArrayList<>();
            one.add(i);
            temp.add(one);
            //System.out.println(temp);
            res.addAll(temp);
        }

        res.add(new ArrayList<>());

        return res;
    }

    public List<List<Integer>> subsetsRec(int[] nums) {
        if (nums == null)
            return null;
        Arrays.sort(nums);
        return helper(nums, nums.length-1);
    }

    public List<List<Integer>> helper(int[] nums, int n){
        if (n == -1 ){
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> empty = new ArrayList<>();
            res.add(empty);
            return res;
        }

        List<List<Integer>> res = helper(nums, n-1);
        int size = res.size();
        for (int i=0; i<size; i++){
            List<Integer> element = new ArrayList<>(res.get(i));
            element.add(nums[n]);
            res.add(element);
        }

        return res;
    }



    public Subsets() {}

    public static void main (String[] args) {
        int[] nums = {1, 2, 3};
        Subsets a = new Subsets();
        List<List<Integer>> subsets = a.subsets(nums);
        List<List<Integer>> subsets1 = a.subsetsRec(nums);

        System.out.println(subsets);
        System.out.println(subsets1);
    }
}
