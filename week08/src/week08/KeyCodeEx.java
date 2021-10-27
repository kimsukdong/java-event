package week08;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();

	KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		setSize(300,150);
		setVisible(true);
		contentPane.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(KeyEvent.getKeyText(e.getKeyCode()));
			if(e.getKeyChar() == '%') //unicode������ ��
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1) { //key code�� ��
				if(e.isShiftDown()) //shiftŰ�� �Բ� ���õǾ����� ��
					contentPane.setBackground(Color.pink);
				else
					contentPane.setBackground(Color.GREEN);
			}
		}
	}
	public static void main(String [] args) {
		new KeyCodeEx();
	}
}
