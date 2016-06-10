package principal;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		est dat[]=new est[5];
		
		dat[0]=new est("0002",22,15,"Piero","POO");
		dat[1]=new est("0005",15,8,"Jose","POO");
		dat[2]=new est("0003",18,19,"Maria","POO");
		dat[3]=new est("0001",25,20,"Alex","POO");
		dat[4]=new est("0004",30,18,"Andrea","POO");
		
		int n;
		do{
		n=Integer.parseInt(JOptionPane.showInputDialog(null, "  Seleccion una opcion\n "+" 1. Lista Estudiantes\n "+" 2. Buscar estudiantes por matricula\n "+" 3. Mostrar estudiantes que aprueban\n "+" 4. Salir\n "));
			if(n==1)
				{
					System.out.println("----------------------------------------------");
					for(int x=0;x<5;x++)
					{
						dat[x].show_inf();
					}
				}
			else if(n==2)
				{
					String m;
					m=JOptionPane.showInputDialog(null,"Ingrese su matricula");
				
					System.out.println("\n\n\n----------------------------------------------");
					System.out.println("El estudiante solicitado es: ");
					for(int x=0;x<5;x++)
					{
						if(m.equals(dat[x].getMatricula()))
						{
							dat[x].show_inf();
						}
						else
						{
							if(x==4)
							System.out.print("El alumno no cuenta en el registro");
						}
					}
				}
			else if(n==3)
				{
					System.out.println("\n\n\n----------------------------------------------");
					System.out.println("Los estudiantes aprobados son: ");
					for(int x=0;x<5;x++)
					{
						dat[x].Show_Apr();
					}
				}
			else if(n==4)
				{
					dat=null;
					System.gc();
				}
		}while(n!=4);

	}

}
