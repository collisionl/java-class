import java.util.*;

public class exp5_2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("输入十进制整数:");
        String str1 = in.nextLine();
        int i1 = Integer.valueOf(str1);
        System.out.println(i1);

        System.out.println("输入二进制整数:");
        String str2 = in.nextLine();
        int i2 = Integer.parseInt(str2);
        System.out.println(i2);

        System.out.println("输入实数:");
        String str3 = in.nextLine();
        double i3 = Double.valueOf(str3);
        System.out.println(i3);
        
        System.out.println("输入布尔型:");
        String str4 = in.nextLine();
        boolean i4 = Boolean.parseBoolean(str4);
        System.out.println(i4);
    }
}