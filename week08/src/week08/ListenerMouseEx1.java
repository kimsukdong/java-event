package week08;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerMouseEx1 extends JFrame {
	private static final long serialVersionUID = 1L;
	ListenerMouseEx1() {
		setTitle("��ư�� Mouse �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Mouse Event �׽�Ʈ ��ư");
		btn.setBackground(Color.YELLOW);

		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		MyActionListener listener1 = new MyActionListener();
		btn.addActionListener(listener1);
		
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ListenerMouseEx1();
	}
	class MyMouseListener implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
	}
	
	class MyActionListener implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			b.setBackground(Color.green);
			b.setText("�׼�");

		}
	}

} 
