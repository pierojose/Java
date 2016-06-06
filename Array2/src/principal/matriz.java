package principal;

import javax.swing.JOptionPane;

public class matriz {
	public matriz(int mtr[][]){
		
	}
	
	public void sorting (int matriz[][])
	{
		for( int i=0; i < 2; i++)
		{//ordena la matriz de abajo hacia arriba
			for( int j=0;j< 8; j++)
			{
				for(int x=0; x < 2; x++)
				{
					for(int y=0; y <8; y++)
					{
							if(matriz[i][j] < matriz[x][y])
							{
								int t = matriz[i][j];
								matriz[i][j] = matriz[x][y];
								matriz[x][y] = t;
							}
					}
				}
			} 
		}
		

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<8; j++)
			{
				System.out.print(matriz [i][j]+" ");
			}
			System.out.println(" ");
		}
     }
	
	public void get_promedio(int v[][]){
		float aux=0;
		for(int fila=0;fila<2;fila++)
		{
			for(int col=0;col<8;col++)
			aux=aux+v[fila][col];
		}
		System.out.println("El promedio es: "+aux/16);
	}
	
	public void get_min(int v[][])
	{
		System.out.println("El minimo es: "+v[0][0]);
	}
	
	public void get_max(int v[][])
	{
		System.out.println("El minimo es: "+v[1][7]);
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}
