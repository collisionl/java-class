import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exp7_1 {
	public static void main(String[] args) {
		new PressMe();
	}
}

class PressMe {
	private JFrame frame;
	private JButton button;
	private JTextField field;
	private static int count = 1;
	public PressMe()
	{
		frame = new JFrame();
		button = new JButton(" Press Me ");
		// 匿名内部类
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if (" Press Me ".equals(e.getActionCommand()))
				{
					field.setText("您按了我"+ count++ +"次");
				}
			}
		});
		field = new JTextField("您还没按我呢！", 12);
		frame.add(field);
		frame.add(button);
		frame.setSize(170, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}