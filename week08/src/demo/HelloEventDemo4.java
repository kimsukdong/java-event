package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo4 extends JFrame { // 두개의 버튼에 한개의 리스너를 연결하고 리스너에서 버튼의 이름으로 구분한다.
	HelloEventDemo4() {
		setTitle("이벤트 예제");		
		setLayout(new GridLayout(2,2,30,30));
		MyActionListener2 listener = new MyActionListener2();
		JLabel label = new JLabel();
		listener.setLabel(label);
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
//		if(e.getActionCommand().equals("라벨이 보임"))
//			label.setText("버튼이 눌림");
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("라벨이 보임"))
			label.setText("버튼이 눌림");
		else 
			label.setText("");
	}
}