package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/28/2015.
 * ��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
 */
public class Problem07 {

    public static void main(String[] args){
        int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;

        System.out.println("Please input any characters in a Line:");
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        char[] chars = inputStr.toCharArray();

        for (char ch : chars){
            if (Character.isLetter(ch))
                abcCount++;
            else if (Character.isSpaceChar(ch))
                spaceCount++;
            else if (Character.isDigit(ch))
                numCount++;
            else
                otherCount++;
        }

        System.out.println("Letters: " + abcCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Numbers: " + numCount);
        System.out.println("Others: " + otherCount);

    }

}
