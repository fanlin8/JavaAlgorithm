package problem50;

/**
 * Created by Fan on 09/28/2015.
 * ��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�������£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�
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
