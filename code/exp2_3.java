import java.util.*;
public class exp2_3{
    public static void main(String[] args){
        // input the number of rows
        Scanner in = new Scanner(System.in);
        System.out.print("input the number of rows: ");
        int a = in.nextInt();
        // print
        for (int i = a; i >= 1;i--) {
            for (int j = 1;j < i;j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= a+1-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }
