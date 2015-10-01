package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class Problem38 {

    public static void main(String[] args){
        System.out.println("Please input a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] chars = str.toCharArray();

        System.out.println("Length is: " + chars.length);
        System.out.println("Length is: " + str.length());
    }
}
