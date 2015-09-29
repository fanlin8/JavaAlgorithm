package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ����ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ���������10%��
 * �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%��
 * 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
 * �Ӽ������뵱��������Ӧ���Ž���������
 *
 */
public class Problem12 {

    public static double bonusCal(double profit){
        double bonus;

        if (profit > 0 && profit <= 10)
            bonus = profit * 0.1;
        else if (profit <= 20)
            bonus = (profit - 10) * 0.075 + 10 * 0.1;
        else if (profit <= 40)
            bonus = (profit - 20) * 0.05 + 10 * 0.075 + 10 * 0.1;
        else if (profit <= 60)
            bonus = (profit - 40) * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
        else if (profit <= 100)
            bonus = (profit - 60) * 0.015 + 20 * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
        else if (profit > 100)
            bonus = (profit - 100) * 0.01 + 40 * 0.015 + 20 * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
        else
            bonus = -1;

        return bonus;
    }

    public static void main(String[] args){
        System.out.println("Please input the profit: ");
        Scanner input = new Scanner(System.in);
        double profit = input.nextDouble();
        double bonus = bonusCal(profit);
        System.out.println("The bonus is: " + bonus);
    }

}
