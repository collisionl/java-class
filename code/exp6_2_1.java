import java.util.*;
import javax.swing.*;
import java.awt.*;
public class exp6_2_1 {
	public static void main(String[] args) {
		demo lable = new demo();
		lable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lable.setVisible(true);
	}
}

class demo extends JFrame {
	public static final int WIDTH=450;
	public static final int HEIGHT=200;
	public demo() {
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		JLabel jLabelWelcome = new JLabel();
		jLabelWelcome.setText("有标签的窗口");
		jLabelWelcome.setBounds(40, 30, 45, 30);
		add(jLabelWelcome);
	}
}
