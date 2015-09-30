package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * 题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 */
public class Problem30 {

    public static int binSearch (int[] n, int key, int low, int high){
        if (low == high)
            return high;
        else if (low > high)
            return -1;
        else{
            int mid = (low+high)/2;
            if (n[mid]<=key){
                if (key<n[mid+1])
                    return mid;
                else
                    return binSearch(n,key,mid+1,high);
            }
            else
                return binSearch(n, key, low, mid-1);
        }
    }

    public static void main(String[] args){
        int[] n = {1, 5, 12, 63, 68, 96, 123, 412, 566, 797, 1452};
        int[] m = new int[n.length+1];
        for (int num1 : n)
            System.out.print(num1 + " ");
        System.out.println("");
        System.out.println("Please input an integer: ");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();

        int index = binSearch(n, key, 0, n.length-1);
        //for (int i=0; i<=index; i++)
        //    m[i] = n[i];
        //m[index+1] = key;
       // for (int i=index+1; i<n.length; i++)
        //    m[i+1] = n[i];

        System.arraycopy(n, 0, m, 0, index+1);
        m[index+1] = key;
        System.arraycopy(n, index+1, m, index+2, n.length-index-1);

        for (int num2 : m)
            System.out.print(num2 + " ");
    }
}
