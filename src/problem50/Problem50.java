package problem50;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Fan on 09/30/2015.
 * ��Ŀ�������ѧ����ÿ��ѧ����3�ſεĳɼ����Ӽ��������������ݣ�����ѧ���ţ����������ſγɼ�����
 * �����ƽ���ɼ�����ԭ�е����ݺͼ������ƽ����������ڴ����ļ� "stud "�С�
 */
public class Problem50 {

    public static void dataInput(int n, String[][] data, Scanner input){
        System.out.println("Please input student's ID, Name, Grades for 3 courses in order: ");
        for (int i=0; i<5; i++)
            data[n][i] = input.nextLine();
        data[n][5] = String.valueOf((Double.valueOf(data[n][2])
                + Double.valueOf(data[n][3]) + Double.valueOf(data[n][4]))/3);
    }

    public static void dataWriter(String[][] data){
        File f = new File("D:\\stud.txt");
        try {
            if (f.exists())
                System.out.println("File exists! ");
            else {
                System.out.println("File created! ");
                f.createNewFile();
            }

            BufferedWriter out = new BufferedWriter(new FileWriter(f));
            for (int i=0; i<5; i++){
                String str = "";
                for (int j=0; j<6; j++)
                    str += data[i][j] + "  ";
                str += "\r\n";
                out.write(str);
            }

            out.close();
            System.out.println("File Written!!!");

        } catch (IOException err){
            err.printStackTrace();
        }
    }

    public static void main(String[] args){
        String[][] stud = new String[5][6];
        Scanner input = new Scanner(System.in);

        for (int n=0; n<5; n++){
            System.out.println("Please input data for " + (n+1) + "th student: ");
            dataInput(n, stud, input);
        }

        dataWriter(stud);

        /*
        for (int i=0; i<5; i++){
            for (int j=0; j<6; j++)
                System.out.print(stud[i][j] + "  ");
            System.out.println("");
        }
        */
    }
}
