package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：计算字符串中子串出现的次数.
 */
public class Problem49 {

    public static int subCount(String str, String subStr){
        int count = 0;
        for (int i=0; i<=str.length()-subStr.length(); i++)
            if (subStr.equals(str.substring(i,i+subStr.length())))
                count++;
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String str = input.nextLine();
        System.out.println("Please input a substring: ");
        String subStr = input.nextLine();

        int count = subCount(str, subStr);

        System.out.println("The substring appears " + count + " times.");
    }
}
