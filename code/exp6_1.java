import java.util.*;
import javax.swing.*;
import java.awt.*;
public class exp6_1 {
	public static void main(String[] args) {
		demo1 FlowLayout = new demo1();
		FlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout.setVisible(true);

		demo2 BorderLayout = new demo2();
		BorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout.setVisible(true);

		demo3 GridLayout = new demo3();
		GridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout.setVisible(true);

	}
}

class demo1 extends JFrame {
	public static final int WIDTH=450;
	public static final int HEIGHT=200;
	public demo1() {
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		JButton jb = new JButton("FlowLayout");
		add(jb);
	}
}

class demo2 extends JFrame {
	public static final int WIDTH=450;
	public static final int HEIGHT=200;
	public demo2() {
		setSize(WIDTH,HEIGHT);
		setLayout(new BorderLayout());
		JButton jb=new JButton("BorderLayout");
		add(jb);
	}
}

class demo3 extends JFrame {
	public static final int WIDTH=450;
	public static final int HEIGHT=200;
	public demo3() {
		setSize(WIDTH,HEIGHT);
		setLayout(new GridLayout(3,3));
		JButton jb=new JButton("GridLayout");
		add(jb);
	}
}
