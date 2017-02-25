import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Casino {

	public static void main(String[] args) {
	View view= new View();
	Model model= new Model();
	Controller control= new Controller(view, model);
	control.run();
}

}
