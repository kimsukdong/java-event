package week08;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel la;
	int cnt = 0;

	MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());

		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);

		setSize(200,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			cnt= e.getClickCount();
			la.setText("hello"+cnt);
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}

	public static void main(String [] args) {
		new MouseListenerEx();
	}
} 
