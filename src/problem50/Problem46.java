package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：两个字符串连接程序
 */
public class Problem46 {

    public static void main(String[] args){
        System.out.println("Please input a string: ");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        System.out.println("Please input another string: ");
        String str2 = input.nextLine();

        System.out.println(str1 + str2);
    }
}
