import java.util.*;
import javax.swing.*;
import java.awt.*;
public class exp6_4{
	public static void main(String[] args) {
		demo system = new demo();
		system.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		system.setVisible(true);
	}
}

class demo extends JFrame {
	public static final int WIDTH=450;
	public static final int HEIGHT=200;
	public demo() {
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		setTitle("选课系统");
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb); 
		JMenu m1 = new JMenu("文体类");
		mb.add(m1);
		JMenu m2 = new JMenu("计算机类");
		mb.add(m2);
		JMenu m3 = new JMenu("帮助");
		mb.add(m3);
		m1.add(new JMenuItem("艺术欣赏"));
		m1.add(new JMenuItem("健美操"));
		m1.add(new JMenuItem("篮球"));
		m2.add(new JMenuItem("java语言"));
		m2.add(new JMenuItem("网络编程"));
		m3.add(new JMenuItem("选课方法"));
	}
}
