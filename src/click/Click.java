package click;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Click {
	JFrame frame;
	final static int WI = 1500;
	final static int HE = 900;
	GamePanel gp;
	
	public static void main(String[] args) {
		Click er = new Click();
		er.setup();
	}
	
	Click(){
		frame = new JFrame();
		gp = new GamePanel();
	}
	
	public void setup() {
		frame.add(gp);
		frame.addKeyListener(gp);
		frame.getContentPane().setPreferredSize(new Dimension(WI, HE));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gp.startGame();
	}
}
