package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo6 extends JFrame { //���� Ŭ������ ����ؼ� ����Ÿ���� ������
	JLabel label;
	HelloEventDemo6() {
		setTitle("�̺�Ʈ ����");		
		setLayout(new GridLayout(2,2,30,30));
		MyActionListener listener = new MyActionListener();
		label = new JLabel();
		JButton b1 = new JButton("���� ����");
		b1.addActionListener(listener);
		add(b1);		
		JButton b2 = new JButton("���� ����");
		b2.addActionListener(listener);
		add(b2);	
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("���� ����"))
				label.setText("��ư�� ����");
			else 
				label.setText("");
		}
	}
	public static void main(String[] args) {
		new HelloEventDemo6();
	}
}
