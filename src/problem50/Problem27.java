package problem50;

import java.util.ArrayList;

/**
 * Created by Fan on 09/29/2015.
 * 题目：求100之内的素数
 */
public class Problem27 {

    public static void primeFind(ArrayList array, int n){
        for (int i=4; i<=n; i++){
            boolean flag = false;
            for (int j=2; j<=Math.sqrt(i); j++){
                if (i%j == 0){
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
            if (flag)
                array.add(i);
        }
    }

    public static void main(String[] args){
        ArrayList array = new ArrayList();
        array.add(2);
        array.add(3);
        int n = 100;

        primeFind(array, n);

        System.out.println("We have total " + array.size() + " primes.");
        System.out.println("They are: ");
        for (Object prime : array)
            System.out.print(prime + "\t");
    }

}
