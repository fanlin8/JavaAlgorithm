package problem50;

/**
 * Created by Fan on 09/29/2015.
 * 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 */
public class Problem13 {

    public static void main(String[] args){
        for (int i = 1; i < 1000000; i++)
            if (Math.sqrt(i+100)%1 == 0 &&
                    Math.sqrt(i+168)%1 == 0)
                System.out.println("The number is: " + i);
    }
}
