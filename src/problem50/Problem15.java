package problem50;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class Problem15 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp;

        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c){
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c){
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a + " < " + b + " < " + c);

    }

}
