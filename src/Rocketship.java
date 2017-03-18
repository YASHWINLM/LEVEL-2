import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int x; 
	int y;
	int width;
	int height;
	int speed;
	public Rocketship(int x, int y, int width, int height, int speed){
		super(x,y,width,height);
		this.x=x;
		this.y=y;
		this.width= width;
		this.height= height;
		this.speed=speed;
	}
void Update(){
		
	}
	void Draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);

	}
}
