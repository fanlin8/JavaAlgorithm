package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 *
 */
public class Problem25 {

    public static boolean numAnl_5(int n){
        char[] array = Integer.toString(n).toCharArray();
        if (array[0] == array[4] && array[1] == array[3])
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a 5-digit Number!");
        int n = input.nextInt();

        if(numAnl_5(n))
            System.out.println("It is a palindromic number!");
        else
            System.out.println("It is NOT a palindromic number!");
    }
}
