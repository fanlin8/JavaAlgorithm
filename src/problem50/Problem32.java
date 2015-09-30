package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：取一个整数a从右端开始的4～7位
 */
public class Problem32 {

    public static void main(String[] args){
        System.out.println("Please input an integer with more than 7 digits: ");
        Scanner input = new Scanner(System.in);
        String n = input.next();

        for (int i=n.length()-4; i>=n.length()-7; i--)
            System.out.print(n.charAt(i));

    }
}
