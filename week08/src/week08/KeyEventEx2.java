package week08;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyEventEx2 extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel pnl = new JPanel();
//	JLabel i1 = new JLabel("car.gif");
	JLabel la = new JLabel("Hello");
	JLabel lb = new JLabel("x,y");
	final int UNIT = 10;

	KeyEventEx2() {
		setTitle("KeyEvent Å×½ºÆ®");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pnl,BorderLayout.CENTER);
		add(lb,BorderLayout.SOUTH);
		pnl.setLayout(null);
		pnl.addKeyListener(new MyKeyListener());
		pnl.addMouseMotionListener(new MyMouseMotionAdapter());
		la.setLocation(250,150);
		la.setSize(100,100);
		Font f= new Font("Serif", Font.BOLD,25);
		la.setForeground(Color.red);
		la.setFont(f);

		pnl.add(la);
		setSize(600,500);
		setVisible(true);
		pnl.requestFocus();
	}	
	
	class MyMouseMotionAdapter extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			la.setLocation(e.getX()-50, e.getY()-50);
			String str = (e.getX()) +" , "+ (e.getY());
			lb.setText(str);
		}
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			String str;
			int x,y,z,xx,yy;
			x=la.getX();
			y=la.getY();
			if(e.isControlDown())
				z=3;
			else if(e.isShiftDown())
				z=2;
			else 
				z=1;
			int keyCode = e.getKeyCode();
			switch(keyCode) {
				case KeyEvent.VK_UP: 
					if((y-UNIT*z) <0)
						yy =0;
					else 
						yy = y-UNIT*z;						
					la.setLocation(x, yy);
					str = x+" , "+ yy;
					lb.setText(str);
					break;
				case KeyEvent.VK_DOWN: 
					if((y+UNIT*z) >350)
						yy =350;
					else 
						yy = y+UNIT*z;		
					la.setLocation(x, yy);
					str = x+" , "+ yy;
					lb.setText(str);
					break;
				case KeyEvent.VK_LEFT: 
					if((x-UNIT*z) <0)
						xx =0;
					else 
						xx = x-UNIT*z;	
					la.setLocation(xx, y);
					str = xx +" , "+ y;
					lb.setText(str);
					break;
				case KeyEvent.VK_RIGHT: 
					if((x+UNIT*z) >550)
						xx =550;
					else 
						xx = x+UNIT*z;	
					la.setLocation(xx, y);
					str = xx +" , "+ y;
					lb.setText(str);
					break;
			}
		}
	}

	public static void main(String [] args) {
		new KeyEventEx2();
	}
}
