package click;

import java.awt.Graphics;
import java.util.Random;

public class Thing1 extends GameObject {
	Random gen = new Random();
	
	Thing1 (int x, int y, int kc){
		super(x, y, kc);
	}
	
	void update() {
		super.update();
		int fi = gen.nextInt(2);
		int si = gen.nextInt(2);
		int ti = gen.nextInt(5)*10;
		int amtchg = ti;
		if(si==0)
			amtchg *= -1;
		if(fi==0)
			x += amtchg;
		else
			y += amtchg;
	}
	
	void draw(Graphics g) {
		super.draw(g);
	}
}
