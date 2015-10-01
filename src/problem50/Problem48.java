package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * ��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�
 * ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
 */
public class Problem48 {

    public static void encrypt(int[] n){
        for (int i=0; i<n.length; i++)
            n[i] = (n[i] + 5)%10;
        int temp = n[0];
        n[0] = n[3];
        n[3] = temp;
        temp = n[1];
        n[1] = n[2];
        n[2] = temp;
    }

    public static void main(String[] args){
        System.out.println("Please input 4 integers: ");
        Scanner input = new Scanner(System.in);
        int[] n = new int[4];
        for (int i=0; i<4; i++)
            n[i] = input.nextInt();

        encrypt(n);

        for (int num : n)
            System.out.print(num + " ");

    }

}
