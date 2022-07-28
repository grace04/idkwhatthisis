package click;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	
	GameObject go;
	Projectile bu;
	Thing1 t1;
	FinishLine fl;
	boolean win;
	
	ObjectManager(Thing1 t1) {
		this.t1 = t1;
	}
	
	void update() {
		t1.update();
	}
	
	void draw(Graphics g) {
		fl.draw(g);
		t1.draw(g);
	}
	
	void checkCollision(){
		if(t1.collisionBox.intersects(fl.collisionBox))
			win = true;
	}
}
