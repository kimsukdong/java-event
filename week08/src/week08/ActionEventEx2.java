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

		red=new JButton("����");
		red.setBackground(Color.RED);
		green=new JButton("�ʷ�");
		green.setBackground(Color.GREEN);
		blue=new JButton("���");
		blue.setBackground(Color.YELLOW);
		end=new JButton("����");
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

		if(name.equals("����")) {
			p1.setBackground(Color.RED);
			tf.setText("������ ���þ����ϴ�.");
		}else if(name.equals("�ʷ�")) {
			p1.setBackground(Color.GREEN);
			tf.setText("�ʷ��� ���þ����ϴ�.");
		}else if(name.equals("���")) {
			p1.setBackground(Color.YELLOW);
			tf.setText("����� ���þ����ϴ�.");
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
