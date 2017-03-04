import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer timer;
	GameObject object;
	GamePanel(){
		this.timer= new Timer(1000/60,this);
		this.object= new GameObject(10,10,500,500);
	}
	void StartGame(){
		timer.start();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		object.Update();
	}
public void paintComponent(Graphics g){
	object.Draw(g);

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
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("KEY");
}


}
