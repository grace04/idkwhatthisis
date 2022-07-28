package click;
import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{

		int speed = 10;
	
	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	void update() {
		super.update();
		x += speed;
		if(x>1500) {
			isAlive = false;
		}
	}
	
	void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
}
