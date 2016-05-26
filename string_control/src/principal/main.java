package principal;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		st_control cad = new st_control();
		cad.set_st(JOptionPane.showInputDialog("Ingrese la cadena"));
		if(cad.control())
			JOptionPane.showMessageDialog(null,"El resultado es verdadero");
		else
			JOptionPane.showMessageDialog(null,"El resultado es falso");
		cad=null;
		System.gc();
	}	
}