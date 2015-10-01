package problem50;

/**
 * Created by Fan on 09/30/2015.
 * 题目：809*??=800*??+9*??
 * 其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
 *
 */
public class Problem42 {

    public static void main(String[] args){
        for (int i=2; i<112; i++)
            if (8*i < 100 && 9*i >= 100 && 9*i <1000)
                System.out.println("The number is " + i + ". 809*" + i + "=" + 809*i);
    }
}
