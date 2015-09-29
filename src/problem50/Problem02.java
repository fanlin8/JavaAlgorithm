package problem50;

import java.util.ArrayList;

/**
 * �ж�101-200֮���ж��ٸ����������������������
 * Created by Fan on 09/28/2015.
 */
public class Problem02{

    public static ArrayList primeCheck (int m, int n){
        ArrayList primes = new ArrayList();
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
            if (flag == true) primes.add(i);
        }
        return primes;
    }

    public static void main (String[] args){
        int m = 101, n = 200;
        ArrayList primes = primeCheck(m, n);
        System.out.println("There are " + primes.size() + " primes. They are: ");
        for (int i = 0; i < primes.size(); i++)
            System.out.println(primes.get(i));
    }
}
