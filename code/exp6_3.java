import java.util.*;
import javax.swing.*;
import java.awt.*;
public class exp6_3 {
	public static void main(String[] args) {
		calculator calculator1 = new calculator();
		calculator1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator1.setVisible(true);
	}
}

class calculator extends JFrame {
	public static final int WIDTH=400;
	public static final int HEIGHT=125;
	public calculator() {
		setSize(WIDTH,HEIGHT);
		// setLayout(new GridLayout(4,4));
		setLayout(null);
		JTextField t1 = new JTextField(); 
		t1.setBounds(0, 0, 400, 25);
		JTextField t2 = new JTextField();
		t2.setBounds(0, 25, 400, 25);
		JTextField t3 = new JTextField();
		t3.setBounds(0, 75, 400, 25);
		JButton b1 = new JButton("+");
		b1.setBounds(0, 50, 100, 25);
		JButton b2 = new JButton("-");
		b2.setBounds(100, 50,100, 25);
		JButton b3 = new JButton("*");
		b3.setBounds(200, 50,100, 25);
		JButton b4 = new JButton("/");
		b4.setBounds(300, 50,100, 25);
		add(t1);
		add(t2);
		add(b1);add(b2);add(b3);add(b4);
		add(t3);
	}
}