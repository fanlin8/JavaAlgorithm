package problem50;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
 */
public class Problem20 {

    public static void main(String[] args){
        int x = 2;
        int y = 1;
        int temp;
        double sum = 0;
        int term = 20;

        for (int i=0; i<term; i++){
            sum += (double)x/y;
            temp = x;
            x = x + y;
            y = temp;
        }

        System.out.println("The Sum is: " + sum);
    }
}
