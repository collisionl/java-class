import java.util.*;

public class exp5_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            // 产生0到50随机数
            Random random = new Random();
            int a = random.nextInt(51);
            // 获取当前时间
            Calendar c = Calendar.getInstance();
            int minute = c.get(Calendar.MINUTE); 
            int second = c.get(Calendar.SECOND); 
            int b = (minute + second) % 51;
            System.out.print(a + "+" + b + "=" );
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            if (temp == (a+b)) {
                System.out.println("right!");
            }
            else System.out.println("wrong!");
        }
    }
}