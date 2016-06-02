package Principal;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		figura cade = new figura();
		cade.setCad((JOptionPane.showInputDialog("Ingrese su palabra")));
		cade.getCad();
		cade.shape_v();
	}

}
