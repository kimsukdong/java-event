package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo3 extends JFrame { //독립 클래스로 리스너 클래스를 생성
	HelloEventDemo3() {
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		
		MyActionListener listener = new MyActionListener();
		JButton b = new JButton("클릭");
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
		System.out.println("버튼을 클릭했습니다.");
	}
}