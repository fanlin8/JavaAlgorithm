package problem50;

/**
 * Created by Fan on 09/29/2015.
 * 题目：求1+2!+3!+...+20!的和
 */
public class Problem21 {

    public Problem21(){}

    public long fact(int n){
        if (n == 1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args){
        int n = 20;
        long sum = 0;
        Problem21 a = new Problem21();

        for (int i=1; i<=n; i++)
            sum += a.fact(i);

        System.out.println("The Sum is: " + sum);
    }
}
