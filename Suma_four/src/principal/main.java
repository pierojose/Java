package principal;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		suma num = new suma();
		num.setA(JOptionPane.showInputDialog("Ingrese valor A"));
		num.setB(JOptionPane.showInputDialog("Ingrese valor B"));
		num.setC(JOptionPane.showInputDialog("Ingrese valor C"));
		num.setD(JOptionPane.showInputDialog("Ingrese valor D"));
		
		num.comparar(num.getA(),num.getB());
		num.getTotal();
	}

}
