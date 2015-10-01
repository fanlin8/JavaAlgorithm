package problem50;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：求0—7所能组成的奇数个数。
 */
public class Problem43 {

    public static String array2str(int[] array){
        String str = "";
        for (int i : array)
            str += String.valueOf(i);
        return str;
    }

    public static void oddGen(int[] odd, int n, int[] count){
        if (n == 0){
            for (int i=1; i<=7; i++){
                odd[n] = i;
                if (Long.valueOf(array2str(odd))%2 != 0)
                    count[0] = count[0] +1;
            }
        }
        else
            for (int j=0; j<=7; j++){
                odd[n] = j;
                oddGen(odd, n-1, count);
            }
    }

    public static void main(String[] args){
        System.out.println("Please input the length of the integers: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] count = new int[1];
        int[] odd = new int[n];

        if (n == 1)
            count[0] = 4;
        else {
            oddGen(odd, n-1, count);
        }

        System.out.println("Total number of ODD with length " + n + " is: " + count[0]);
    }
}
