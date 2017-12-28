import java.util.*;
public class exp1_2 {
    public static void main(String[] args) {
	int a,b,c,d;
	Scanner in = new Scanner(System.in);
	System.out.println("请输入数字:");
	a = in.nextInt();
	b = in.nextInt();
	c = in.nextInt();
	if(a > b){
		d = a;
	}else{
		d = b;
	}
	if (d > c){}
	else{
		d = c;
	}
    System.out.println(d);
    }
}