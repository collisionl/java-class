import java.util.*;
import javax.swing.*;
import java.awt.*;

public class exp6_2_2 {
	public static void main(String[] args) {
		JFrame frameDemo = new JFrame();
		frameDemo.setSize(450,200);
		frameDemo.setLayout(new FlowLayout());
		JLabel jLabelWelcome = new JLabel();
		jLabelWelcome.setText("有标签的窗口");
		Container c = frameDemo.getContentPane();
		c.add(jLabelWelcome);
		frameDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDemo.setVisible(true);
	}
}