package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
 * 每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
public class Problem48 {

    public static void encrypt(int[] n){
        for (int i=0; i<n.length; i++)
            n[i] = (n[i] + 5)%10;
        int temp = n[0];
        n[0] = n[3];
        n[3] = temp;
        temp = n[1];
        n[1] = n[2];
        n[2] = temp;
    }

    public static void main(String[] args){
        System.out.println("Please input 4 integers: ");
        Scanner input = new Scanner(System.in);
        int[] n = new int[4];
        for (int i=0; i<4; i++)
            n[i] = input.nextInt();

        encrypt(n);

        for (int num : n)
            System.out.print(num + " ");

    }

}
