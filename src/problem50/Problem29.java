package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ����һ��3*3����Խ���Ԫ��֮�͡�
 */

public class Problem29 {

    public static void main(String[] args){
        int n = 3;
        System.out.println("Please input " + n*n + " integers: ");
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[n][n];
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                matrix[i][j] = input.nextInt();

        int diagonalSum = 0;

        for (int i=0; i<n; i++)
            diagonalSum += matrix[i][i];

        System.out.println("The diagonal SUM is: " + diagonalSum);

    }
}
