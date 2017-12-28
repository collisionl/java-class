import java.util.*;
import javax.swing.*;
import java.awt.*;
public class exp6_5 {
	public static void main(String[] args) {
		RectPaintDemo shape = new RectPaintDemo();
		shape.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shape.setVisible(true);
	}
}

class RectPaintDemo extends JFrame {
	public RectPaintDemo() {
		setSize(200, 150);
	}

	public void paint(Graphics g) {
	g.drawRect(40,50,120,80);
	g.drawOval(40,50,120,80);
	g.drawOval(40,70,60,40);
	g.drawOval(40,80,30,20);
	}
}
