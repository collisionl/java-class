import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit;
public class exp8_3 {
	public static void main(String[] args) {
		Demo1 shape1 = new Demo1();
	}
}

class Demo1 extends JFrame {
	public static final int WIDTH = 200;
	public static final int HEIGHT = 200;
	public int position = 25;
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
		super.paint(g);
		g.fillOval(80, position, 25, 25);
	}

	class Thread1 extends Thread {
		public void run(){
			while(true){
				try {
					sleep(500);
					position += 10;
					repaint();
				} catch (InterruptedException ie) {}
			}	
		}
	}

}