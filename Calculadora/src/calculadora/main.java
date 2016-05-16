package calculadora;
import javax.swing.JOptionPane;
public class main {
	public static void main(String[] args) {
		float num1,num2;
		num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su numero 1"));
		num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su numero 2"));
		calculadora proceso = new calculadora(num1,num2);
		proceso.suma(num1, num2);
		proceso.resta(num1, num2);
		proceso.multiplicacion(num1, num2);
		proceso.division(num1, num2);
		proceso.rc(proceso.get_num1());
		proceso.rc(proceso.get_num2());
		
		//FUNCIONES TRIGONOMETRICAS BASICAS
		proceso.sen(proceso.get_num1());
		proceso.sen(proceso.get_num2());
		
		proceso.cos(proceso.get_num1());
		proceso.cos(proceso.get_num2());
		
		proceso.tan(proceso.get_num1());
		proceso.tan(proceso.get_num2());
	}

}
