package problem50;

/**
 * Created by Fan on 09/30/2015.
 * ��Ŀ����̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ����
 * ��ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ�
 * �ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ�
 * ���������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
 */
public class Problem41 {

    public static int peaches(int monkey){
        if (monkey > 5)
            return 1;
        else
            return peaches(monkey+1)*5+1;
    }

    public static void main(String[] args){
        int monkey = 1;
        int peaches = peaches(monkey);

        System.out.println("Total peaches: " + peaches);
    }
}
