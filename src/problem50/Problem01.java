package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/28/2015.
 *
 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ����
 * ����������Ϊ���٣�
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
