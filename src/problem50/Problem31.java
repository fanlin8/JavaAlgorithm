package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：将一个数组逆序输出。
 */
public class Problem31 {

    public static int[] reverseOrder(int[] n){
        int[] m = new int[n.length];
        for (int i=0; i<n.length; i++)
            System.arraycopy(n, i, m, n.length-1-i, 1);
        return m;
    }

    public static void main(String[] args){
        System.out.println("Please input an 5 integers array, finish with 'Enter': ");
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        for (int i=0; i<5; i++)
            n[i] = input.nextInt();

        int[] m = reverseOrder(n);

        for (int num: m)
            System.out.print(num + " ");

    }
}
