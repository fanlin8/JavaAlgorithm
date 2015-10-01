package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：输入3个数a,b,c，按大小顺序输出。
 */
public class Problem34 {

    public static void main(String[] args){
        System.out.println("Please input three integers: ");
        Scanner input = new Scanner(System.in);
        int[] n = new int[3];
        for (int i=0; i<3; i++)
            n[i] = input.nextInt();

        Problem15 method = new Problem15();
        int[] order = method.compare(n[0], n[1], n[2]);

        System.out.println(order[2] + " > " + order[1] + " > " + order[0]);

    }
}
