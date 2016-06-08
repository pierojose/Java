package principal;

import java.util.Random;

import javax.swing.JOptionPane;

public class matriz {
	
	Random rnd = new Random();
	
	int mtr[][],fila,columna;
	
	public matriz(int ax[][], int x, int y){
		this.mtr = ax;
		this.fila = x;
		this.columna = y;
	}
	
	public int[][] getMtr() {
		return mtr;
	}

	public void setMtr(int[][] mtr) {
		this.mtr = mtr;
	}

	public void llenar_matriz(){
		for(int x=0;x<this.fila;x++)
		{
			for(int y=0;y<this.columna;y++)
			{
				this.mtr[x][y]=rnd.nextInt(100+1);
			}
		}
	}
	
	public void mostrar_matriz(){
		System.out.println(" ");
		System.out.println("La matriz es:");
		System.out.println("-----------------------------------");
		for(int x=0;x<this.fila;x++)
		{
			for(int y=0;y<this.columna;y++)
			{
				System.out.print(this.mtr[x][y]+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void nueva_matriz(int dig){
		int aux;
			System.out.println(" ");
			System.out.println("La matriz según el " + dig + " es:");
			System.out.println("-----------------------------------");
			for(int x=0;x<this.fila;x++)
			{
				for(int y=0;y<this.columna;y++)
				{
					aux=this.mtr[x][y]%10;
					if(aux==dig)
						System.out.print(this.mtr[x][y]+" ");
				}
				System.out.println(" ");
			}
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}
