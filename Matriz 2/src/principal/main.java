package principal;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int f,c,n;
		
		do{
			f=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la fila"));
			c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la columna"));
		}while(f<=0||c<=0);
		
		int matrix[][] = new int [f][c];
		
		matriz pro = new matriz(matrix,f,c);
		pro.llenar_matriz();
		pro.mostrar_matriz();
		
		//CONTROL DE INGRESO DEL DIGITO
		do
		{	
			n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 0 al 9"));
		}while(n<0 || n>9);//FIN DEL CONTROL
		
		pro.nueva_matriz(n);
		pro=null;
		System.gc();
	}

}
