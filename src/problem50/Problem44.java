package problem50;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * 题目：一个偶数总能表示为两个素数之和。
 */
public class Problem44 {

    public static void main(String[] args){
        System.out.println("Please input an even number which is larger than 2: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();

        Problem27 a = new Problem27();
        a.primeFind(primes, n);

        for (int i=0; i<primes.size()-1; i++)
            for (int j=i+1; j<primes.size(); j++)
                if (n == primes.get(i) + primes.get(j))
                    System.out.println(n + " = " + primes.get(i) + " + " + primes.get(j));


    }
}
