import java.util.*;

public class exp9_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int temp = rand.nextInt(101);
        System.out.println("生成的数字是："+temp);
        try {
            if (temp > 60) {
                throw new Exception();
            }
            System.out.println("right");
        } catch (Exception e) {
            System.out.println("wrong");
        }
    }
}