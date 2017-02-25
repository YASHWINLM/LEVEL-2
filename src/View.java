import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame {
	JPanel panel= new JPanel();
	JLabel label1= new JLabel();
	JLabel label2= new JLabel();
	JLabel label3= new JLabel();
	JButton butt= new JButton();
	JButton butt2= new JButton();
	
	public void ShowMachine(){
		this.add(panel);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(butt);
		panel.add(butt2);
		this.setVisible(true);
		this.pack();
		butt.setBackground(Color.RED);
		butt.setForeground(Color.RED);
		butt.setBorder(null);
		butt.setOpaque(true);
		
	}
}
