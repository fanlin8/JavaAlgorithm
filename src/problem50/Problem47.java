package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * ��Ŀ����ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ�����ģ���
 */
public class Problem47 {

    public static void main(String[] args){
        System.out.println("Please input an integer between [1,50]: ");
        System.out.println("(Any other number to quit!)");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n>=1 && n<=50){
            for (int i=0; i<n; i++)
                System.out.print("*");
            System.out.println("");
            System.out.println("Please input another integer between [1,50]: ");
            n = input.nextInt();
        }
    }
}
