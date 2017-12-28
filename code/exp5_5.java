import java.util.*;

public class exp5_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] ary = new int[10];
        for (int i=0;i < 10;i++){
        ary[i] = random.nextInt(99999);
        }
        Arrays.sort(ary,0,10);
        for (int i=0;i < 10;i++){
            System.out.print(ary[i] + " ");
        }
        System.out.println();
    }
}