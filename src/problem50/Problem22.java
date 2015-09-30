package problem50;

/**
 * Created by Fan on 09/29/2015.
 * 题目：利用递归方法求5!。
 */
public class Problem22 {

    public Problem22(){}

    public long fact(int n){
        if (n == 1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args){
        int n = 5;
        long sum = 0;
        Problem22 a = new Problem22();

        System.out.println("The Sum is: " + a.fact(n));
    }

}
