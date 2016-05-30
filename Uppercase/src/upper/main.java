package upper;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
    mayus cad = new mayus();
	String cad1 = "casa";
	cad.setCad(cad1);
	cad.mayuscula();
	cad=null;
	System.gc();
	}
}