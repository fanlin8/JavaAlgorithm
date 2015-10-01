package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：判断一个整数能被几个9整除
 */
public class Problem45 {

    public static int divide9 (int n, int count){
        if (n%9 != 0)
            return count;
        else
            return divide9(n/9, count+1);
    }

    public static void main(String[] args){
        System.out.println("Please input an integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;

        count = divide9(n, count);

        System.out.println("It could be divided by [" + count + "] 9s with no reminders.");
    }
}
