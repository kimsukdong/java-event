package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo7 extends JFrame { 
	//�͸� Ŭ������ ����ؼ� ����Ÿ���� �����ϰ� ��ư�� ������ ���� ������
	JLabel label;
	HelloEventDemo7() {
		setTitle("�̺�Ʈ ����");		
		setLayout(new GridLayout(2,2,30,30));

		label = new JLabel();
		JButton b1 = new JButton("���� ����");
		b1.addActionListener(new  ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label.setText("��ư�� ����");
			}
		}
				);
		add(b1);		
		JButton b2 = new JButton("���� ����");
		b2.addActionListener(new  ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label.setText("");
			}
		}
				);
		add(b2);	
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloEventDemo7();
	}
}
