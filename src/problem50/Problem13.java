package problem50;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
 */
public class Problem13 {

    public static void main(String[] args){
        for (int i = 1; i < 1000000; i++)
            if (Math.sqrt(i+100)%1 == 0 &&
                    Math.sqrt(i+168)%1 == 0)
                System.out.println("The number is: " + i);
    }
}
