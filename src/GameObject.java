import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	GameObject(int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	void Update(){
		x=x+10;
		y=y+10;
	}
	void Draw(Graphics gg){
		gg.fillRect(x, y, 100, 100);
	}
}
