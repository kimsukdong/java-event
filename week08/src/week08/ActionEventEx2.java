package week08;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ActionEventEx2 extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JPanel p1,p2,p3;
	JButton red, green, blue,end;
	JTextField tf;
	GridLayout gb;
	JTextArea ta;

	public ActionEventEx2(){

		super("ActionEvent Test2");
		gb=new GridLayout(3,1,5,5);
		setLayout(gb);
		p1=new JPanel();
		p2=new JPanel();
		p2.setLayout(new GridLayout(1,4,5,5));
		p3=new JPanel();

		red=new JButton("빨강");
		red.setBackground(Color.RED);
		green=new JButton("초록");
		green.setBackground(Color.GREEN);
		blue=new JButton("노랑");
		blue.setBackground(Color.YELLOW);
		end=new JButton("종료");
		end.setBackground(Color.CYAN);

		tf=new JTextField(20);
		tf.setEditable(false);
		ta = new JTextArea();

		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		end.addActionListener(this);

		p2.add(red);
		p2.add(green);
		p2.add(blue);
		p2.add(end);
		p3.add(tf);

		add(p1);
		add(p2);
		add(p3);

		setSize(400,300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		String name;
		name=ae.getActionCommand();

		if(name.equals("빨강")) {
			p1.setBackground(Color.RED);
			tf.setText("빨강이 선택었습니다.");
		}else if(name.equals("초록")) {
			p1.setBackground(Color.GREEN);
			tf.setText("초록이 선택었습니다.");
		}else if(name.equals("노랑")) {
			p1.setBackground(Color.YELLOW);
			tf.setText("노랑이 선택었습니다.");
		}
		else
		{
			System.exit(0);
		}
	}

	public static void main(String[] args){
		new ActionEventEx2();	
	}
}
