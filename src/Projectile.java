import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int x; 
	int y;
	int width;
	int height;
	int speed;
	public Projectile(int x, int y, int width, int height, int speed){
		super(x,y,width,height);
		this.x=x;
		this.y=y;
		this.width= width;
		this.height= height;
		this.speed=10;
	}
	void Update(){
		y-=speed;
		if (y<0) {
			isAlive=false;
		}
		System.out.println(y);
		
	}
	void Draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);

	}
}
