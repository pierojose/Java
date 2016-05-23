package exercise;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		exercise proceso = new exercise();
		int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
		proceso.set_num(num);
		proceso.get_num();
		System.out.println("El valor absoluto es: ");
		proceso.rest(num);
	}

}
