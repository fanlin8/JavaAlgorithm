package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
 * 凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 */
public class Problem37 {

    public static void main(String[] args){
        System.out.println("Please input number n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        int i = 0;
        int count = 0;

        while (n > 1){
            if (array[i] == 0){
                count++;
                if (count == 3){
                    count = 0;
                    array[i] = -1;
                    n--;
                }
            }
            i++;
            if (i == array.length)
                i = 0;
        }

        for (int j=0; j<array.length; j++)
            if (array[j] != -1)
                System.out.println("No." + (j+1) +" stays!");
    }
}
