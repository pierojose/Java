import javax.swing.*;

public class main {
	public static void main(String[] args) {
		
		try{
		int dato =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
		JOptionPane.showMessageDialog(null, "App terminada correctamente");
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error de ingreso");
		}
	}
}
