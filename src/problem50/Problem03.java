package problem50;

/**
 * Created by Fan on 09/28/2015.
 *
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Problem03 {

    public static void main(String args[]){
        int d1, d2 ,d3;
        int count = 0;
        System.out.println("The numbers are: ");
        for (int i = 100; i <= 999; i++){
            d1 = i/100;
            d2 = (i%100)/10;
            d3 = (i%100)%10;
            if ( i == Math.pow(d1, 3)+Math.pow(d2, 3)+Math.pow(d3, 3)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are total " + count + " numbers.");
    }
}
