package problem50;

/**
 * Created by Fan on 09/29/2015.
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。
 * 求第一天共摘了多少。
 *
 */
public class Problem17 {

    public static void main(String[] args){
        int days = 10;
        int residue = 1;

        for (int i=0; i<days-1; i++)
            residue = (residue+1)*2;

        System.out.println("Total Peaches: " + residue);
    }
}
