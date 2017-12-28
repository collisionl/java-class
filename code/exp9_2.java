// 编写一个多线程程序，在其中实现两个定时线程，一个线程每隔1秒显示一次秒数，另一个每隔3秒显示一次字母(a,b,…)。
import java.util.*;

public class exp9_2{
	public static void main(String[] args){
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();
	}
}

class Thread1 extends Thread{
	public void run(){
		while(true){
			try {
				for (int i = 0; i < 60; i++) {
					System.out.print(i + " ");
					sleep(1000);
				}
			} catch (InterruptedException ie) {}
		}	
	}
}

class Thread2 extends Thread{
	public void run(){
		while(true){
			try {
				for (int i = 0; i < 26; i++) {
					System.out.print((char)('a' + i) + " ");
					sleep(3000);
				}
			} catch (InterruptedException ie) {}
		}	
	}
}


