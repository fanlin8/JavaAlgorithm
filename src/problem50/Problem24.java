package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
 *
 */
public class Problem24 {

    public static void numAnl(int n){
        char[] array = Integer.toString(n).toCharArray();
        System.out.println("It is a " + array.length + " digits number.");
        System.out.println("Print it in reversed order: ");
        for (int i = array.length-1; i>=0; i--)
            System.out.print(array[i]);
        System.out.println("");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a positive number!");
        int n = input.nextInt();

        numAnl(n);
    }

    //another way
    /*
    public static void main(String[] args){
        System.out.println("Please input a positive number!");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println("digits��" + num.length());
        for(int i = numLength-1; i>=0;i--){
            System.out.print(num.charAt(i)+"\t");
        }
    }
    */
}
