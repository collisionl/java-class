import java.util.*;
public class exp2_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("iput a year: ");
        int a = in.nextInt();
        if (a%4 == 0 && a%100 != 0){
            System.out.println("闰年");
        }
        else if (a%4 == 0 && a%400 == 0){
            System.out.println("闰年");
        }
        else {
            System.out.println("非闰年");
        }
        }
    }
