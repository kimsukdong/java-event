package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo4 extends JFrame { // �ΰ��� ��ư�� �Ѱ��� �����ʸ� �����ϰ� �����ʿ��� ��ư�� �̸����� �����Ѵ�.
	HelloEventDemo4() {
		setTitle("�̺�Ʈ ����");		
		setLayout(new GridLayout(2,2,30,30));
		MyActionListener2 listener = new MyActionListener2();
		JLabel label = new JLabel();
		listener.setLabel(label);
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
	public static void main(String[] args) {
		new HelloEventDemo4();
	}
}
class MyActionListener2 implements ActionListener{
	JLabel label;
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public void actionPerformed(ActionEvent e) {
//		if(e.getActionCommand().equals("���� ����"))
//			label.setText("��ư�� ����");
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("���� ����"))
			label.setText("��ư�� ����");
		else 
			label.setText("");
	}
}