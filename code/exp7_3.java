import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class exp7_3 {

	public static void main(String[] args) {	
		Breakfast b=new Breakfast();	
		b.setTitle("自助早餐");	
		b.setBounds(200, 200, 250, 250);
		b.setVisible(true);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Breakfast extends JFrame {
	TextArea t1;
	List list=new List(10,true);
	public Breakfast(){
		Panel p=new Panel();
		Label la1,la2;
		la1=new Label("请选择早点：");
		la1.setBounds(10,5,80,30);
		la2=new Label("您选择了：");
		la2.setBounds(120, 5, 70, 30);
		p.add(la1);
		p.add(la2);
		t1=new TextArea();
		list.setBounds(4,35,90,170);
		p.add(list);
		list.add(" 名称     单价");
		list.add("**************");
		list.add(" 馒头   0.20元");
		list.add(" 花卷   0.30元");
		list.add(" 面包   0.50元");
		list.add(" 蛋糕   0.20元");
		list.add(" 豆浆   0.80元");
		list.add(" 牛奶   1.00元");
		t1=new TextArea();
		p.add(t1);
		t1.setBounds(90,35,140,140);
		Button exitbutton=new Button("退出");
		exitbutton.setBounds(120, 177, 70, 30);

		p.add(exitbutton);
		p.setLayout(null);

		exitbutton.addActionListener(new myListener());
		list.addItemListener(new item());

		this.add(p);
	}

	private class myListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);  
		}
	}

	private class item implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			int itemIndex[] = list.getSelectedIndexes();
			String SelectedItems[] = list.getSelectedItems();
			float sum = 0;
			double price[] = {0, 0, 0.2, 0.3, 0.5, 0.2, 0.8, 1.0};
			DecimalFormat df = new DecimalFormat("0.00");
			t1.setText(" ");
			for(int i = 0; i < itemIndex.length; i++){
				int idx = itemIndex[i];
				if(idx != 0 && idx != 1){
					sum += price[idx];
					t1.append(SelectedItems[i] + "\n");
				}
			}
			t1.append("\n  共计： "+ sum + "元" + "\n");
		}	

	}
}
