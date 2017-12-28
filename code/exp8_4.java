import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit;
public class exp8_4 {
	public static void main(String[] args) {
		Demo1 shape1 = new Demo1();
	}
}

class Demo1 extends JFrame {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	public int x = 15;
	public int y = 475;
	public void init(){
		this.setVisible(true);
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit tl = Toolkit.getDefaultToolkit();
		Dimension d = tl.getScreenSize();
		int x,y;
		x = (int)(d.getWidth()-WIDTH)/2;
		y = (int)(d.getHeight()-HEIGHT)/2;
		this.setLocation(x, y);
	}

	public Demo1() {
		init();
		Thread1 t1 = new Thread1();
		t1.start();
	}

	public void paint(Graphics g) {
		g.fillOval(x, y, 15, 15);
	}

	class Thread1 extends Thread {
		public void run(){
			double fx = 0;
			double fy = 0;
			while(x < 475){
				try {
					sleep(300);
					fx = fx + 7.0;
					fy = 4*fx - 0.02*fx*fx;
					x = (int)fx + 15;
					y = 475 - (int)fy;
					repaint();
				} catch (InterruptedException ie) {}
			}	
		}
	}
}