package principal;
import javax.swing.JOptionPane;
public class main {
	public static void main(String[] args) {
		tablas numero = new tablas();
		numero.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero")));
		numero.getNum();
		numero.table();
	}

}
