import java.awt.*;
import javax.swing.*;
public class ChangeExample extends JFrame {
	static boolean b = true;
	public ChangeExample(String title) {
		super(title);
		setBounds(100, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		if (b)
			g.drawRect(40, 50, 100, 100);
		else
			g.drawOval(40, 50, 150, 100);
		b = !b;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		repaint();
	}
	public static void main(String[] args) {
		new ChangeExample("123");
	}
}
