package principal;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int n;
		meses proceso = new meses();
		proceso.setTa(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 12")));
		proceso.dev_mes(proceso.getTa());

	}

}
