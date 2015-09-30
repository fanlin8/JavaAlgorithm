package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * Binary Search.
 */
public class BinSearch {

    public static int binSearch (int[] n, int key, int low, int high){
        if (low > high)
            return -1;
        else{
            int mid = (low+high)/2;
            if (n[mid]==key)
                return mid;
            else if (n[mid]>key)
                return binSearch(n, key, low, mid-1);
            else
                return binSearch(n, key, mid+1, high);
        }
    }

    public static void main(String[] args){
        int[] n = {1, 5, 12, 63, 68, 96, 123, 412, 566, 797, 1452};
        for (int num : n)
            System.out.print(num + " ");
        System.out.println("");
        System.out.println("Please input an integer: ");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();

        int index = binSearch(n, key, 0, n.length-1);

        if (index == -1)
            System.out.println("Not Found!");
        else
            System.out.println("The index of the number is " + index);
    }


}
