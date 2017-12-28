import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class exp9_5{
	public static void main(String[] args) {
		demo demo1 = new demo();
	}
}

class demo extends JFrame{
	
	public static final int WIDTH = 300;
	public static final int HEIGHT = 150;
	public JLabel label1, label2;
	public JButton jb1, jb2;

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

	public demo(){
		init();

		label1 = new JLabel("右移标签");
		label2 = new JLabel("左移标签");
		label1.setBounds(10, 30, 80, 20);
		label2.setBounds(200, 60, 80, 20);
		add(label1);
		add(label2);

		jb1 = new JButton("向右移");
		jb2 = new JButton("向左移");
		jb1.setBounds(50, 100, 80, 20);
		jb2.setBounds(150, 100, 80, 20);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Thread1 firstThread = new Thread1();
				firstThread.start();
			}
		});
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Thread2 secondThread = new Thread2();
				secondThread.start();
			}
		});
		add(jb1);
		add(jb2);
	}

	class Thread1 extends Thread {
		public void run(){
			while(true){
				try {
					sleep(1000);
					label1.setLocation(label1.getX() + 10, label1.getY());
				} catch (InterruptedException ie) {}
			}	
		}
	}

	class Thread2 extends Thread {
		public void run(){
			while(true){
				try {
					sleep(1000);
					label2.setLocation(label2.getX() - 10, label2.getY());
				} catch (InterruptedException ie) {}
			}	
		}
	}
}


