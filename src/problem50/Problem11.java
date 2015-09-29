package problem50;

/**
 * Created by Fan on 09/28/2015.
 * 题目：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */

public class Problem11 {

    public Problem11(){};

    static int count = 0;

    public void numberGen (int[] nums, int digits, int range){
        if (digits == 0){
            for (int i = 1; i <= range; i++) {
                nums[digits] = i;
                printNum(nums);
            }
        }
        else {
            for (int i = 1; i <= range; i++) {
                nums[digits] = i;
                numberGen(nums, digits-1, range);
            }
        }
    }

    public void printNum(int[] n){
        boolean flag = true;
        for (int i = 0; i < n.length-1; i++){
            for (int j = i+1; j < n.length; j++){
                if (n[i] == n[j]){
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            for (int i : n)
                System.out.print(i);
            System.out.println();
            count++;
        }
    }

    public static void main(String[] args){
        int n = 3;
        int range = 4;
        int[] num;
        num = new int[n];
        Problem11 a = new Problem11();
        a.numberGen(num, n-1, range);
        System.out.println("Numbers Count: " + count);
    }

}
