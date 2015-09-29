package problem50;

/**
 * Created by Fan on 09/28/2015.
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 *
 */
public class Problem10 {

    public static void main(String[] args){
        double height = 100;
        int times = 10;
        double sumHeight = 0;

        for (int i = 1; i <= times; i++){
            sumHeight += height;
            height = height/2;
        }

        System.out.println("Total distance traveled: " + sumHeight);
        System.out.println(times + "th height is: " + height*2);
    }
}
