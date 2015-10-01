package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * 题目：求100之内的素数
 */
public class Problem28 {

    public static void selectSort(int[] n){
        int temp;
        int position;
        for (int i=0; i<n.length-1; i++){
            temp = n[i];
            position = i;
            for (int j=i+1; j<n.length; j++){
                if (n[j] < temp){
                    temp = n[j];
                    position = j;
                }
            }
            n[position] = n[i];
            n[i] = temp;
        }
    }

    public static void main(String[] args){
        System.out.println("Please input 10 integers: ");
        Scanner input = new Scanner(System.in);
        int[] n = new int[10];
        for (int i=0; i<10; i++)
            n[i] = input.nextInt();

        selectSort(n);

        for (int num : n)
            System.out.print(num + "   ");
    }
}
