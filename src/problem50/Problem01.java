package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/28/2015.
 *
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月
 * 的兔子总数为多少？
 */
public class Problem01 {

    public static int fib(int m){
        if (m == 1 || m == 2)
            return 1;
        else
            return fib(m - 1) + fib(m - 2);
    }

    public static void main(String[] args){
        System.out.println("Please Input Months: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        System.out.println("The pairs of rabbits: " + fib(month));

    }
}
