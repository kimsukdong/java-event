package week08;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerEx1 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel la;
	int cnt = 0;

	MouseListenerEx1() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseAdapter());

		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);

		setSize(200,200);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	public static void main(String [] args) {
		new MouseListenerEx1();
	}
} 
