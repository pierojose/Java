package principal;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		meses proceso = new meses();
		
		do{
			proceso.setTa(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 12")));
		}while(proceso.getTa()>12||proceso.getTa()<1);
		
		proceso.dev_mes(proceso.getTa());

	}

}
