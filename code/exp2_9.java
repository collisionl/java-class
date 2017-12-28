import java.util.*;
public class exp2_9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [][] ary = new int[5][5];
        int min = 99999999;
        for (int i = 0;i < 5;i++){
            for(int j = 0;j < 5;j++){
                ary[i][j] = in.nextInt();
                if(ary[i][j] < min){
                    min = ary[i][j];
                }
            }
        }
        System.out.println("min = " + min); 
        }
    }

// 1 2 3 4 5
// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9