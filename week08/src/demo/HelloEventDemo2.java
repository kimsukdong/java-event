package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo2 extends JFrame implements ActionListener{ 
	//별도의 리스너 클래스를 만들지 않고 메인 클래스에서 한번에 처리한다.
	JLabel label;
	JButton b1,b2;
	HelloEventDemo2() {
		setTitle("이벤트 맛보기");
		setLayout(new GridLayout(2,2,30,30));
		b1 = new JButton("라벨이 보임");
		b1.addActionListener(this);
		add(b1);		
		b2 = new JButton("라벨을 가림");
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
			label.setText("버튼이 눌림");
		else 
			label.setText("");
	}	
	public static void main(String[] args) {
		new HelloEventDemo2();
	}
}