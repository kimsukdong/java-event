package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo7 extends JFrame { 
	//익명 클래스를 사용해서 데이타들을 공유하고 버튼의 종류에 따라 구분함
	JLabel label;
	HelloEventDemo7() {
		setTitle("이벤트 예제");		
		setLayout(new GridLayout(2,2,30,30));

		label = new JLabel();
		JButton b1 = new JButton("라벨이 보임");
		b1.addActionListener(new  ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label.setText("버튼이 눌림");
			}
		}
				);
		add(b1);		
		JButton b2 = new JButton("라벨을 가림");
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
