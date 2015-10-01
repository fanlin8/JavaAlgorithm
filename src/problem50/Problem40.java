package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * ÌâÄ¿£º×Ö·û´®ÅÅÐò¡£
 */
public class Problem40 {

    public static void bubbleSort(char[] array){
        int n = array.length;
        char temp;

        for (int i=0; i<n-1; i++)
            for (int j=0; j<n-1-i; j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
    }

    public static void main(String[] args){
        System.out.println("Please input a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        bubbleSort(chars);

        for (char ch : chars)
            System.out.print(ch);
    }

}
