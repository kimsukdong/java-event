package week08;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ClickAndDoubleClickEx extends JFrame {
	JPanel contentPane = new JPanel();
	ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseListener2());
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ClickAndDoubleClickEx();
	}
} 

class MyMouseListener2 extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 2) {
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);

			JPanel p = (JPanel)e.getSource();
			p.setBackground(new Color(r,b,g));
		}
	}
}
