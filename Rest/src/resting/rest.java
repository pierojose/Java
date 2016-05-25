package resting;
import javax.swing.JOptionPane;
public class rest {
	
	public rest(){
		
	}
	
	public void question_anwser()
	{
		int confirmation=JOptionPane.showConfirmDialog(null,"¿Es dia de semana?");
		int confirmation2=JOptionPane.showConfirmDialog(null,"¿Es dia de vacaciones?");
		if (confirmation!=1 && confirmation2!=0){
			JOptionPane.showMessageDialog(null,"No Puedes descansar");
		}
		else 
			JOptionPane.showMessageDialog(null,"Puedes descansar");
	}
}
