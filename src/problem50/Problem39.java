package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * ��Ŀ����дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,������nΪ����ʱ�����ú���1/1+1/3+...+1/n
 */
public class Problem39 {

    public static double even(int n){
        if (n == 2)
            return (double)1/n;
        else
            return (double)1/n + even(n - 2);
    }

    public static double odd(int n){
        if (n == 1)
            return (double)1/n;
        else
            return (double)1/n + odd(n - 2);
    }

    public static void main(String[] args){
        System.out.println("Please input an integer");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n%2 == 0)
            System.out.println("The sum is: " + even(n));
        else
            System.out.println("The sum is: " + odd(n));
    }

}
