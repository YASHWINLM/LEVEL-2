import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	int speed;
	Alien(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.speed=5;
	}
	void Draw(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
		
	}
	void Update(){
		y+=speed;
		
	}

}
