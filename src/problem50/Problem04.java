package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/28/2015.
 * 题目：将一个正整数分解质因数。
 * 例如：输入90,打印出90=2*3*3*5。
 */
public class Problem04 {

    public Problem04(){}

    public void factor(int num){
        for (int i = 2; i <= num; i++){
            if (num%i == 0){
                if (i == num)
                    System.out.print(i);
                else
                    System.out.print(i + "*");
                factor(num/i);
                break;
            }
        }
    }

    public static void main (String[] args){
        System.out.println("Please input a positive integer:");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Problem04 a = new Problem04();
        System.out.print(N + " = ");
        a.factor(N);
    }
}
