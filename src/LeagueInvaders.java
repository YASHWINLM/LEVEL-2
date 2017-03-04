import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders implements KeyListener {
	JFrame frame;
	final int width= 500;
	final int height= 800;
	GamePanel game;
	public static void main(String[] args) {
		LeagueInvaders invade= new LeagueInvaders();
	
	
	}
	LeagueInvaders(){
		this.frame= new JFrame();
		game= new GamePanel();
		setup();
	}
	void setup(){
		frame.add(game);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.StartGame();
		frame.addKeyListener(game);
		game.addKeyListener(this);
		frame.setSize(width, height);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
