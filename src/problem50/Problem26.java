package problem50;

import java.util.Scanner;

/**
 * Created by Fan on 09/29/2015.
 * ��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ����������жϵڶ�����ĸ��
 */
public class Problem26 {

    public static void main(String[] args){
        System.out.println("Please input first Uppercase letter for a weekday: ");
        Scanner input = new Scanner(System.in);
        char ch1 = input.nextLine().charAt(0);
        String day;
        switch (ch1){
            case 'M':
                day = "Monday";
                break;
            case 'T':
                System.out.println("Please input second letter(Lowercase) for a weekday: ");
                char ch2 = input.nextLine().charAt(0);
                switch (ch2){
                    case 'u':
                        day = "Tuesday";
                        break;
                    case 'h':
                        day = "Thursday";
                        break;
                    default:
                        day = "Invalid Day!";
                        break;
                }
                break;
            case 'W':
                day = "Wednesday";
                break;
            case 'F':
                day = "Friday";
                break;
            case 'S':
                System.out.println("Please input second letter(Lowercase) for a weekday: ");
                char ch3 = input.nextLine().charAt(0);
                switch (ch3){
                    case 'a':
                        day = "Saturday";
                        break;
                    case 'u':
                        day = "Sunday";
                        break;
                    default:
                        day = "Invalid Day!";
                        break;
                }
                break;
            default:
                day = "Invalid Day!";
                break;
        }
        System.out.println("It is " + day);
    }
}
