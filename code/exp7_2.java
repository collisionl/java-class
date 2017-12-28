import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exp7_2 {
	public static void main(String[] args) {
		Demo1 shape1 = new Demo1();
		shape1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shape1.setVisible(true);
	}
}

class Demo1 extends JFrame implements MouseListener {
	int mouseClickedTime = 0;
	
	public Demo1(){
		setSize(200, 200);
		setVisible(true);
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e){  
		mouseClickedTime++;
		repaint();
	}

	public void paint(Graphics g) {
		if(mouseClickedTime%2 == 0){
			super.paint(g); 
			g.drawOval(50, 50, 80, 100);
			g.fillOval(70, 80, 14, 7);
			g.fillOval(110, 80, 14, 7);
			g.drawArc(70, 110, 40, 20, 180, 180);
			g.drawString("笑！", 30, 60);
		}
		else{
			super.paint(g);
			g.drawOval(50, 50, 80, 100);
			g.fillOval(70, 80, 14, 7);
			g.fillOval(110, 80, 14, 7);
			g.drawArc(70, 110, 40, 20, 0, 180);
			g.drawString("哭！", 30, 60);
		}
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
}
