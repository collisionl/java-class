import java.util.*;

public class exp3_1 {
    void fun(int a, int b){
        while(b != 0) {
            int temp = a%b;
            a = b;
            b = temp;
            }
            System.out.println(a);
    }

    public static void main(String[] args){
         exp3_1 d = new exp3_1();
         int a = 56;
         int b = 91;
         d.fun(a,b);
    }
}