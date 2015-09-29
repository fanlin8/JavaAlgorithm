package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/28/2015.
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加由键盘控制。
 */
public class Problem08 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please set the number: ");
        int num = input.nextInt();
        System.out.println("Please set the repeat times: ");
        int N = input.nextInt();
        int sum = 0;
        String temp = "";

        for (int i = 1; i <= N; i++){
            temp += String.valueOf(num);
            System.out.println(temp);
            sum += Integer.parseInt(temp);
        }

        System.out.println("The Sum is: " + sum);
    }

}
