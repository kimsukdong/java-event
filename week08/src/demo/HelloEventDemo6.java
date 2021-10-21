package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo6 extends JFrame { //내부 클래스를 사용해서 데이타들을 공유함
	JLabel label;
	HelloEventDemo6() {
		setTitle("이벤트 예제");		
		setLayout(new GridLayout(2,2,30,30));
		MyActionListener listener = new MyActionListener();
		label = new JLabel();
		JButton b1 = new JButton("라벨이 보임");
		b1.addActionListener(listener);
		add(b1);		
		JButton b2 = new JButton("라벨을 가림");
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
			if(b.getText().equals("라벨이 보임"))
				label.setText("버튼이 눌림");
			else 
				label.setText("");
		}
	}
	public static void main(String[] args) {
		new HelloEventDemo6();
	}
}
