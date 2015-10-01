package problem50;

import java.util.ArrayList;

/**
 * Created by Fan on 09/29/2015.
 * 题目：求100之内的素数
 */
public class Problem27 {

    public Problem27(){}

    public void primeFind(ArrayList<Integer> array, int n){
        array.add(2);
        array.add(3);
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
        ArrayList<Integer> array = new ArrayList<>();
        int n = 100;

        Problem27 a = new Problem27();
        a.primeFind(array, n);

        System.out.println("We have total " + array.size() + " primes.");
        System.out.println("They are: ");
        for (Object prime : array)
            System.out.print(prime + "\t");
    }

}
