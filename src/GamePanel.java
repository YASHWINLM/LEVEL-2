import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState=MENU_STATE;
	Font titleFont;
	Font titleFont2;
	Font titleFont3;
	Rocketship ship= new Rocketship(250,700,50,50,5);
	ObjectManager manager= new ObjectManager();
	
	GamePanel(){
		this.timer= new Timer(1000/60,this);
		this.titleFont= new Font("Comic Sans MS", Font.PLAIN,48);
		this.titleFont2= new Font("Comic Sans MS", Font.PLAIN,40);
		this.titleFont3= new Font("Comic Sans MS", Font.PLAIN,40);
		manager.addObject(ship);
	}
	void updateMenuState(){
		
		
	}
void updateGameState(){
	manager.update();
	}
	void updateEndState(){
		
		
	}
	void drawMenuState(Graphics g){
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.RED);
		g.setFont(titleFont);
		g.drawString("League Invaders", 100,100);
		g.setColor(Color.RED);
		g.setFont(titleFont3);
		g.drawString("press enter to start", 100,400);
		
		

	}
	void drawGameState(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500,800);    
		manager.draw(g);
		
	}
	void drawEndState(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500,800); 
		g.setColor(Color.BLUE);
		g.setFont(titleFont2);
		g.drawString("Mission Failed we'll ", 2,100);
		g.drawString("get em next time", 10,140);
		

	}
	void StartGame(){
		timer.start();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
			updateEndState();
		}

	}
public void paintComponent(Graphics g){
	if(currentState == MENU_STATE){
		drawMenuState(g);
	}else if(currentState == GAME_STATE){
		drawGameState(g);
	}else if(currentState == END_STATE){
		drawEndState(g);
	}
	
	
	}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("KEY");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("KEY");
	System.out.println(e.getKeyCode());
	if (e.getKeyCode()==10) {
		updateGameState();
		currentState+=1;
	}
	if (e.getKeyCode()==38) {
		ship.y-=10;
	}
	if (e.getKeyCode()==40) {
		ship.y+=10;
	}
	if (e.getKeyCode()==39) {
		ship.x+=10;
	}
	if (e.getKeyCode()==37) {
		ship.x-=10;
	}
	if(currentState > END_STATE){
		currentState = MENU_STATE;
	}

}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("KEY");
}


}
