package upper;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
    mayus cad = new mayus();
	cad.setCad(JOptionPane.showInputDialog("Ingrese la cadena"));
	cad.mayuscula();
	cad=null;
	System.gc();
	}
}