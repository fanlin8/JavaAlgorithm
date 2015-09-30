package problem50;

/**
 * Created by Fan on 09/29/2015.
 * 题目：输出9*9口诀。
 */
public class Problem16 {

    public static void main(String[] args){
        for (int i=1; i<10; i++){
            for (int j=1; j<=i; j++)
                System.out.print(i + " * " + j + " = " + i*j + "  ");
            System.out.println("");
        }
    }

}
