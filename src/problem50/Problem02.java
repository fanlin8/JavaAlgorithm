package problem50;

import java.util.ArrayList;

/**
 * �ж�101-200֮���ж��ٸ����������������������
 * Created by Fan on 09/28/2015.
 */
public class Problem02{

    public static ArrayList<Integer> primeCheck (int m, int n){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = m; i <= n; i++){
            boolean flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
            if (flag) primes.add(i);
        }
        return primes;
    }

    public static void main (String[] args){
        int m = 101, n = 200;
        ArrayList<Integer> primes = primeCheck(m, n);
        System.out.println("There are " + primes.size() + " primes. They are: ");
        for (int i : primes)
            System.out.println(i);
    }
}
