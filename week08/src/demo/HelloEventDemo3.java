package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo3 extends JFrame { //���� Ŭ������ ������ Ŭ������ ����
	HelloEventDemo3() {
		setTitle("�̺�Ʈ ����");
		setLayout(new FlowLayout());
		
		MyActionListener listener = new MyActionListener();
		JButton b = new JButton("Ŭ��");
		b.addActionListener(listener);

		add(b);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloEventDemo3();
	}
}

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư�� Ŭ���߽��ϴ�.");
	}
}