package problem50;

/**
 * Created by Fan on 09/29/2015.
 * 题目：打印出如下图案（菱形）
 *    *
 *   ***
 *  *****
 * *******
 *  *****
 *   ***
 *    *

 */
public class Problem19 {

    public static void main(String[] args){
        int H = 7;
        int W = 7;

        for (int i=1; i<=H/2+1; i++){
            for (int j=1; j<=(W/2+1)-i; j++)
                System.out.print(' ');
            for (int k=1; k<=2*i-1; k++)
                System.out.print('*');
            System.out.println("");
        }

        for (int i=1; i<=H/2; i++){
            for (int j=1; j<=i; j++)
                System.out.print(' ');
            for (int k=1; k<=W-2*i; k++)
                System.out.print('*');
            System.out.println("");
        }

    }

}
