package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class Problem36 {

    public static void main(String[] args){
        System.out.println("How many integers?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Input all the integers: ");
        int[] array = new int[n];
        for (int i=0; i<n; i++)
            array[i] = input.nextInt();
        System.out.println("Shift distance: " );
        int m = input.nextInt();

        int[] newArray = new int[n];
        System.arraycopy(array, array.length-m, newArray, 0, m);
        System.arraycopy(array, 0, newArray, m, array.length-m);

        for (int e : newArray)
            System.out.print(e + " ");
    }
}
