import java.util.*;
import java.lang.Math.*;
public class exp2_11{
    public static void main(String[] args){

        // 生成随机数10-20
        int max=20;
        int min=10;
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        
        // 生成6*6数组
        int [][] ary = new int[6][6];
        for (int i = 0;i < 6;i++){
            for(int j = 0;j < 6;j++){
                ary[i][j] = random.nextInt(max)%(max-min+1) + min;
            }
        }

        //print 数组
        for (int i = 0;i < 6;i++){
            for(int j = 0;j < 6;j++){
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 平房根的和
        double sum = 0;
        for (int i = 0;i < 6;i++){
            sum += Math.sqrt(ary[i][i]);
        }
        System.out.println(sum);
        }
    }
