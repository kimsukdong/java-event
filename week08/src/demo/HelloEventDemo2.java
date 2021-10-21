package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo2 extends JFrame implements ActionListener{ 
	//������ ������ Ŭ������ ������ �ʰ� ���� Ŭ�������� �ѹ��� ó���Ѵ�.
	JLabel label;
	JButton b1,b2;
	HelloEventDemo2() {
		setTitle("�̺�Ʈ ������");
		setLayout(new GridLayout(2,2,30,30));
		b1 = new JButton("���� ����");
		b1.addActionListener(this);
		add(b1);		
		b2 = new JButton("���� ����");
		b2.addActionListener(this);
		add(b2);		
		label = new JLabel();
		add(label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
			label.setText("��ư�� ����");
		else 
			label.setText("");
	}	
	public static void main(String[] args) {
		new HelloEventDemo2();
	}
}