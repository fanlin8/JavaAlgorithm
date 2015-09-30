package problem50;

/**
 * Created by Fan on 09/29/2015.
 * 题目：有5个人坐在一起，问第5个人多少岁。他说比第4个人大2岁。
 * 问第4个人岁数，他说比第3个人大2岁。
 * 问第3个人，又说比第2人大2岁。
 * 问第2个人，说比第1个人大2岁。
 * 最后问一个人，他说是10岁。请问第五个人多大？
 */
public class Problem23 {
    public static void main(String[] args){
        int age = 10;
        for (int i=0; i<4; i++)
            age += 2;
        System.out.println("The age is: " + age);
    }
}
