package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * ��Ŀ��дһ����������һ���ַ����ĳ��ȣ���main�����������ַ�����������䳤�ȡ�
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
