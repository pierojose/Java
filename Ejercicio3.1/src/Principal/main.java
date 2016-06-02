package Principal;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		multa proceso = new multa();
		proceso.setVelocidad(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su velocidad")));
		proceso.getVelocidad();
		proceso.infraction();
		proceso=null;
		System.gc();
	}

}
