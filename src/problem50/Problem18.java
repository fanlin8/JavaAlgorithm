package problem50;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
 * �ѳ�ǩ���������������������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������
 */
public class Problem18 {

    public static void versus(char[] players, int count){
        if (count == 0){
            players[count] = 'x'; printVS(players);
            players[count] = 'y'; printVS(players);
            players[count] = 'z'; printVS(players);
        }
        else{
            players[count] = 'x'; versus(players, count-1);
            players[count] = 'y'; versus(players, count-1);
            players[count] = 'z'; versus(players, count-1);
        }
    }

    public static void printVS(char[] players){
        if (players[0] != 'x' && players[2] != 'x'&& players[2] != 'z'
                && players[0] != players[1] && players[1] != players[2]
                && players[0] != players[2]){
            System.out.println("a VS " + players[0]);
            System.out.println("b VS " + players[1]);
            System.out.println("c VS " + players[2]);
        }
    }

    public static void main(String[] args){
        int count = 3;
        char[] players = {'x', 'y', 'z'};

        versus(players, count-1);

    }
}
