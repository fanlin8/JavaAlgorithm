package problem50;

/**
 * Created by Fan on 09/28/2015.
 * ��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "��
 * ����6=1��2��3.
 * �ҳ�1000���ڵ�����������
 */
public class Problem09 {

    public static void main(String[] args){
        int bound = 1000;

        for (int i = 1; i <= bound; i++){
            int sum = 0;
            for (int j = 1; j <= i/2; j++){
                if (i%j == 0 ){
                    sum += j;
                }
            }
            if (i == sum)
                System.out.println(i);
        }
    }
}
