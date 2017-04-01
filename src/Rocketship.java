import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	
	int speed;
	public Rocketship(int x, int y, int width, int height, int speed){
		super(x,y,width,height);
		
		this.speed=100;
	}
void Update(){
	super.Update();
	}
	void Draw(Graphics g){
		//g.setColor(Color.BLUE);
		//g.fillRect(x, y, width, height);
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
	}
	int GetX(){
		return x;
	}
	int GetY(){
		return y;
	}
}
