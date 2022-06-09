package View;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class EventButton implements ActionListener  {
	private MainTela context;

	public EventButton(MainTela context) {
		// TODO Auto-generated constructor stub
		if(this.context == null) {
			this.context = context;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e)  {
		
		
		context.getFinalPane().setText("Anaminese Realizada com Sucesso");

	}


}
