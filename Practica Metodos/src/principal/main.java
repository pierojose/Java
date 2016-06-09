package principal;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		contador item = new contador();
		item.setCad(JOptionPane.showInputDialog("Ingrese una cadena: "));
		item.show_inf();

	}

}
