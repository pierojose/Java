package principal;

import javax.swing.JOptionPane;

public class shape {
	
	int rango;
	
	public shape(){
		
	}

	void figura_Triangulo(int rango) {
	    int f = rango;
	    while (f >= 1) {
	        int c = 1;
	        while (c <= rango) {
	            if(f<c)
	            	System.out.print(" ");
	            else
	            	System.out.print("*");
	            c++;
	        }
	        System.out.println("");
	        f--;
	    }
	}

	public int leerNum(){

	  rango=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión de la figura entre 3 y 9:")); 
	   if((rango<1)||(rango>27))
	       return -1;
	   else
	   return rango;
	}

}
