import java.util.*;
public class exp2_1{
    public static void main(String[] args){
        // print first line
        System.out.print('*' + "\t");
        for(int p = 1;p <= 9;p++){
            System.out.print(p + "\t");
        }
        System.out.println();

        // print 乘法表
        for(int i = 1;i <= 9;i++){
            System.out.print(i + "\t"); // print 行数
            // print 表格
            for(int j = 1;j <= i;j++){
                System.out.print(i*j + "\t");
            }
            System.out.println(); // print \t
        }
    }
}