package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/28/2015.
 * ��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
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
