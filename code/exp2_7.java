import java.util.*;
import java.util.Arrays;
public class exp2_7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] ary = new int[10];
        for (int i=0;i < 10;i++){
        ary[i] = in.nextInt();
        }
        Arrays.sort(ary,0,10);
        System.out.println("min = "+ary[0]);             
        }
    }
