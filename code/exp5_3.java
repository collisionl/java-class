import java.util.*;

public class exp5_3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入100个字符的字符串:");
        String s = in.nextLine();
        StringBuffer sb = new StringBuffer(s);    
        int first = sb.indexOf("abc");
        int last = sb.lastIndexOf("abc");
        System.out.print("第一次出现的位置:");
        System.out.println(first);
        System.out.print("最后一次出现的位置:");
        System.out.println(last);
    }
}