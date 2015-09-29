package problem50;

/**
 * Created by Fan on 09/28/2015.
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
 * 例如6=1＋2＋3.
 * 找出1000以内的所有完数。
 */
public class Problem09 {

    public static void main(String[] args){
        int bound = 1000;

        for (int i = 1; i <= bound; i++){
            int sum = 0;
            for (int j = 1; j <= i/2; j++){
                if (i%j == 0 ){
                    sum += j;
                }
            }
            if (i == sum)
                System.out.println(i);
        }
    }
}
