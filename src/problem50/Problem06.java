package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/28/2015.
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 */
public class Problem06 {

    public Problem06(){};

    public int gcdTest(int a, int b){
        int big = a > b?a:b;
        int small = a < b?a:b;
        int temp;

        while (small != 0){
            temp = big % small;
            big = small;
            small = temp;
        }

        return big;
    }

    public static void main(String[] args){
        System.out.println("Please input a positive integer:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Please input another positive integer:");
        int b = input.nextInt();
        Problem06 c = new Problem06();
        int commonDiv = c.gcdTest(a, b);
        int commonMulti = a*b/commonDiv;
        System.out.println("Max Common Divisor: " + commonDiv);
        System.out.println("Min Common Multiple: " + commonMulti);
    }

}
