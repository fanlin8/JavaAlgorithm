package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：打印出杨辉三角形（要求打印出10行如下图）
 *                 1
 *              1    1
 *           1    2    1
 *        1    3    3    1
 *     1    4    6    4    1
 * 1    5    10    10    5    1
 * .............................
 */
public class Problem33 {

    public static int[][] yangHui(int n){
        int[][] array = new int[n][n];

        for (int i=0; i<n; i++)
            for (int j=0; j<=i; j++){
                if (j == 0 || j == i)
                    array[i][j] = 1;
                else
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
            }

        return array;
    }

    public static void print(int[][] array, int n){
        for (int i=0; i<n; i++){
            for (int k=0; k<(n-i-1)*2; k++)
                System.out.print(" ");
            for (int j=0; j<=i; j++)
                System.out.print(array[i][j] + "   ");
            System.out.println("");
        }
    }

    public static void main(String[] args){
        System.out.println("Please input the lines of the Triangle: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] triangle = yangHui(n);

        print(triangle, n);
    }
}
