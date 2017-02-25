
public class Controller  { 
	View view;
	Model model;
	Controller(View view, Model model){
		this.view=view;
		this.model=model;
		
	}
	public void run(){
		view.ShowMachine();
	}
}
