import java.awt.*;
import javax.swing.*;
public class JRadioButtonDemo extends JFrame {
	public static final int WIDTH=250;
	public static final int HEIGHT=200;

	public JRadioButtonDemo(String title) {
		super(title);// 设置窗体的标题
		setSize(WIDTH, HEIGHT);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JRadioButton radioButton1 = new JRadioButton("Java",true);//创建单选按钮
		JRadioButton radioButton2 = new JRadioButton("PHP");// 创建单选按钮
		JRadioButton radioButton3 = new JRadioButton("C++");// 创建单选按钮
		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		ButtonGroup group = new ButtonGroup();// 创建单选按钮组
		group.add(radioButton1);// 将radioButton1增加到单选按钮组中
		group.add(radioButton2);// 将radioButton2增加到单选按钮组中
		group.add(radioButton3);// 将radioButton3增加到单选按钮组中

		JCheckBox c1, c2, c3;
		c1 = new JCheckBox("Checkbox1");
		c2 = new JCheckBox("Checkbox2");
		c3 = new JCheckBox("Checkbox3", true);
		setLayout(new GridLayout(3, 9));
		add(c1);
		add(c2);
		add(c3);

	}

	public static void main(String[] args){
		new JRadioButtonDemo("123");
	}
}
