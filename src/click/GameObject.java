package click;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	
	int x;
	int y;
	/*int width;
	int height;*/
	int kc;
	boolean isAlive = true;
	Rectangle collisionBox;
	
	GameObject(int x, int y, int kc){
		this.x = x;
		this.y = y;
		this.kc = kc;
		collisionBox = new Rectangle(x, y, 50, 50);
	}
	
	void update() {
		collisionBox.setBounds(x, y, 50, 50);
	}
	
	void draw(Graphics g) {
		
	}
}
