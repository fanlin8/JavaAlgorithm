package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 *
 */
public class Problem14 {

    public static int dayCal(int year, int month, int day){
        int days = 0;
        int[] daysOfMonth = {31, 28, 31, 30, 31 ,30, 31, 31, 30, 31, 30, 31};
        if ((year%400 == 0) || (year%4 == 0 && year%100 != 0))
            daysOfMonth[1] = 29;

        for (int i = 0; i < month-1; i++)
            days += daysOfMonth[i];
        days += day;

        return days;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input Year: ");
        int year = input.nextInt();
        System.out.println("Please input Month: ");
        int month = input.nextInt();
        System.out.println("Please input Day: ");
        int day = input.nextInt();

        int days = dayCal(year, month, day);

        System.out.println("It is the " + days + "th day of the year.");
    }

}
