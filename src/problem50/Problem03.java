package problem50;

/**
 * Created by Fan on 09/28/2015.
 *
 * ��Ŀ����ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
 * ���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
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
