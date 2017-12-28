
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame{
	
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	
	public void init(){
		this.setVisible(true);
		this.setSize(WIDTH, HEIGHT);
		this.setTitle("信息管理系统");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit tl = Toolkit.getDefaultToolkit();
		Dimension d = tl.getScreenSize();
		int x,y;
		x = (int)(d.getWidth()-WIDTH)/2;
		y = (int)(d.getHeight()-HEIGHT)/2;
		this.setLocation(x, y);
	}
	public void setGUI(){
		JLabel stdNum = new JLabel("学号：");
		JTextField stdNumInput = new JTextField(10);
		JLabel password = new JLabel("密码：");
		JPasswordField passwordInput = new JPasswordField(10);
		JLabel sex = new JLabel("性别：");
		String [] sexOption = new String[]{"男","女"};
		JComboBox sexSelection = new JComboBox(sexOption);
		JButton confirm = new JButton("确定");
		JButton cancel = new JButton("取消");
		this.setLayout(new GridBagLayout());
		GridBagConstraints cons = new GridBagConstraints();
		this.add(stdNum, cons, 0, 0, 1,1);
		this.add(stdNumInput, cons, 1, 0, 1, 1);
		this.add(password, cons, 0, 1, 1, 1);
		this.add(passwordInput, cons, 1, 1, 1, 1);
		this.add(sex, cons, 0, 2, 1, 1);
		this.add(sexSelection, cons, 1, 2, 1, 1);
		this.add(confirm, cons, 0, 3, 1, 1);
		
		confirm.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(stdNumInput.getText().equals("111") && passwordInput.getText().equals("tcg")){
					JOptionPane.showMessageDialog(null, "验证通过！","结果提示",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "验证不通过！","结果提示",JOptionPane.WARNING_MESSAGE);
				}	
			}});
		
		this.add(cancel, cons, 1, 3, 1, 1);
		cancel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int result;
				result = JOptionPane.showConfirmDialog(null, "确认退出吗？","结果提示",JOptionPane.OK_CANCEL_OPTION);
				if(result == 0){
					System.exit(0);
				}
			}});
		this.setVisible(true);
	}

	public void add(JComponent p, GridBagConstraints cons, int x, int y, int width, int height){
		cons.insets = new Insets(5,5,5,5);
		cons.gridx = x;
		cons.gridy = y;
		cons.gridwidth = width;
		cons.gridheight = height;
		this.add(p,cons);
	}

	public Login(){
		init();
		setGUI();
	}

	public static void main(String[] args) {
		Login login = new Login();
	}

}
