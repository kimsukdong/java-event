package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo5 extends JFrame { //버튼마다 다른 리스너를 연결해 처리한다
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	HelloEventDemo5() {
		setTitle("이벤트 맛보기");

		setLayout(new GridLayout(2,2,30,30));
		MyActionListener3 listener3 = new MyActionListener3();
		JLabel label = new JLabel();
		listener3.setLabel(label);

		MyActionListener4 listener4 = new MyActionListener4();
		listener4.setLabel(label);

		JButton b1 = new JButton("라벨이 보임");
		b1.addActionListener(listener3);
		add(b1);

		JButton b2 = new JButton("라벨을 가림");
		b2.addActionListener(listener4);
		add(b2);

		add(label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloEventDemo5();
	}
}

class MyActionListener3 implements ActionListener{
	JLabel label;
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public void actionPerformed(ActionEvent e) {
		label.setText("버튼이 눌림");
	}
}

class MyActionListener4 implements ActionListener{
	JLabel label;
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public void actionPerformed(ActionEvent e) {
		label.setText("");
	}
}