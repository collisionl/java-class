import java.util.*;
public class exp1_1 {
    public static void main(String[] args) {
	int a;
	char b;
	Scanner in = new Scanner(System.in);
	System.out.println("请输入:");
	a = in.nextInt();
	switch(a/10){ 
		case 10:case 9:b = 'A'; break;
		case 8:b = 'B'; break;
		case 7:b = 'C'; break;
		case 6:b = 'D'; break;
		default:b = 'E'; break;
	}
    System.out.println(b);
    }
}