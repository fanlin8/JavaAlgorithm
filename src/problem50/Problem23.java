package problem50;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ����5��������һ���ʵ�5���˶����ꡣ��˵�ȵ�4���˴�2�ꡣ
 * �ʵ�4������������˵�ȵ�3���˴�2�ꡣ
 * �ʵ�3���ˣ���˵�ȵ�2�˴�2�ꡣ
 * �ʵ�2���ˣ�˵�ȵ�1���˴�2�ꡣ
 * �����һ���ˣ���˵��10�ꡣ���ʵ�����˶��
 */
public class Problem23 {
    public static void main(String[] args){
        int age = 10;
        for (int i=0; i<4; i++)
            age += 2;
        System.out.println("The age is: " + age);
    }
}
