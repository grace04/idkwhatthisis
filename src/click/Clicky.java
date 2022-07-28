package click;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Clicky implements KeyListener {
	JFrame frame;
	JPanel panel;
	final static int WI = 1500;
	final static int HE = 900;
	Thing t;
	
	public static void main(String[] args) {
		Clicky c = new Clicky();
		c.setup();
		c.draw(g);
	}
	
	Clicky(){
		frame = new JFrame();
		panel = new JPanel();
	}
	
	public void setup() {
		frame.add(panel);
		frame.addKeyListener(this);
		frame.getContentPane().setPreferredSize(new Dimension(WI, HE));
		//frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ask();
	}

	public void ask() {
		String ax = JOptionPane.showInputDialog("x");
		String ay = JOptionPane.showInputDialog("y");
		String akc = JOptionPane.showInputDialog("key code");
		int x = Integer.parseInt(ax);
		int y = Integer.parseInt(ay);
		int kc = Integer.parseInt(akc);
		t = new Thing(x, y, kc);
	}
	
	public void draw(Graphics g) {
		
	}
	
	public void startGame() {
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
