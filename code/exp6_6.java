import java.util.*;
import javax.swing.*;
import java.awt.*;
public class exp6_6 {
	public static void main(String[] args) {
		Demo1 shape1 = new Demo1("笑脸");
		shape1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shape1.setVisible(true);

		Demo2 shape2 = new Demo2("哭脸");
		shape2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shape2.setVisible(true);
	}
}

class Demo1 extends JFrame {
	public Demo1(String title) {
		super(title);
		setSize(200, 200);
	}

	public void paint(Graphics g) {
		g.drawOval(50, 50, 80, 100);
		g.fillOval(70, 80, 14, 7);
		g.fillOval(110, 80, 14, 7);
		g.drawArc(70, 110, 40, 20, 180, 180);
		g.drawString("笑！", 30, 60);
	}
}

class Demo2 extends JFrame {
	public Demo2(String title) {
		super(title);
		setSize(200, 200);
	}

	public void paint(Graphics g) {
		g.drawOval(50, 50, 80, 100);
		g.fillOval(70, 80, 14, 7);
		g.fillOval(110, 80, 14, 7);
		g.drawArc(70, 110, 40, 20, 0, 180);
		g.drawString("哭！", 30, 60);
	}
}