package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Problem35 {

    public static int max(int[] n){
        int position = -1;
        int max = n[0];

        for (int i=1; i<n.length; i++){
            if (n[i] > max){
                max = n[i];
                position = i;
            }
        }

        return position;
    }

    public static int min(int[] n){
        int position = -1;
        int min = n[0];

        for (int i=1; i<n.length; i++){
            if (n[i] < min){
                min = n[i];
                position = i;
            }
        }

        return position;
    }

    public static void main(String[] args){
        System.out.println("Please input 10 integers: ");
        int[] n = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<10; i++)
            n[i] = input.nextInt();

        int temp;
        int idx;
        idx = max(n);
        temp = n[idx];
        n[idx] = n[0];
        n[0] = temp;

        idx = min(n);
        temp = n[idx];
        n[idx] = n[9];
        n[9] = temp;

        for (int num : n)
            System.out.print(num+" ");

    }
}
