package problem50;

/**
 * Created by Fan on 09/30/2015.
 * ��Ŀ��809*??=800*??+9*??
 * ����??�������λ��,8*??�Ľ��Ϊ��λ����9*??�Ľ��Ϊ3λ������??�������λ������809*??��Ľ����
 *
 */
public class Problem42 {

    public static void main(String[] args){
        for (int i=2; i<112; i++)
            if (8*i < 100 && 9*i >= 100 && 9*i <1000)
                System.out.println("The number is " + i + ". 809*" + i + "=" + 809*i);
    }
}
