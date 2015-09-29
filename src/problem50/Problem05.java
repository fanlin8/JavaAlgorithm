package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/28/2015.
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 *
 */
public class Problem05 {
    public static void main (String[] args){
        char grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a score: ");
        int score = input.nextInt();
        grade = score >= 90?'A'
                :score >= 60?'B'
                :'C';
        System.out.println("The Grade is: " + grade);
    }
}
