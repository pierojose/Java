package Principal;

import javax.swing.JOptionPane;

public class multa {
	float velocidad;
	public multa(){
		
	}
	
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	
	public void infraction(){
		int confirmation=JOptionPane.showConfirmDialog(null,"¿Es tu cumpleaños?");
		if(confirmation!=0)
		{
		if(getVelocidad()<=60)
			JOptionPane.showMessageDialog(null,"No hay multa");
		else if(getVelocidad()>60 && getVelocidad()<=80)
			JOptionPane.showMessageDialog(null,"Su multa es pequeña");
		else if(getVelocidad()>80)
			JOptionPane.showMessageDialog(null,"Su multa es grande");
		}
		else
		{
			if(getVelocidad()<=120)
				JOptionPane.showMessageDialog(null,"No hay multa");
			else if(getVelocidad()>120 && getVelocidad()<=160)
				JOptionPane.showMessageDialog(null,"Su multa es pequeña");
			else if(getVelocidad()>160)
				JOptionPane.showMessageDialog(null,"Su multa es grande");
		}
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}
