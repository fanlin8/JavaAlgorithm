package problem50;

/**
 * Created by Fan on 09/29/2015.
 * ���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ��
 * �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
 * �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
 * ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ�
 * ���һ�칲ժ�˶��١�
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
