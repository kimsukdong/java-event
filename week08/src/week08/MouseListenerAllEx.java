package week08;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane = new JPanel();
	JLabel la;

	MouseListenerAllEx() {
		setTitle("MouseListener?? MouseMOtionListener ????");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addMouseListener(
						new MyMouseListener());
		contentPane.addMouseMotionListener(
						new MyMouseListener());
		la = new JLabel("No Mouse Event");
		contentPane.add(la);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener, 
														MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			la.setText("MousePressed ("+e.getX()+","+e.getY()+")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+","+e.getY()+")");
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
	}	

	public static void main(String [] args) {
		new MouseListenerAllEx();
	}
} 
