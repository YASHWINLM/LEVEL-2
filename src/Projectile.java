import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	int speed;
	public Projectile(int x, int y, int width, int height, int speed){
		super(x,y,width,height);
		
		this.speed=10;
	}
	void Update(){
		super.Update();
		y-=speed;
		if (y<0) {
			isAlive=false;
		}
		
	}
	void Draw(Graphics g){
		//g.setColor(Color.RED);
		//g.fillRect(x, y, width, height);
		g.drawImage(GamePanel.bulletImg, x, y, width, height, null);
	}
}
