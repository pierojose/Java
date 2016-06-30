package principal;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		datos dat[]=new datos[5];
		
		dat[0]=new datos("0002",22,15,"Piero",'M');
		dat[1]=new datos("0005",15,8,"Jose",'M');
		dat[2]=new datos("0003",18,19,"Maria",'F');
		dat[3]=new datos("0001",25,20,"Alex",'M');
		dat[4]=new datos("0004",30,18,"Andrea",'F');
		
		
		int n;
		do{
		n=Integer.parseInt(JOptionPane.showInputDialog(null, "  Seleccion una opcion\n "+" 1. Buscar Alumno\n "+" 2. Modificar Nota del parcial\n "+" 3. Mostrar Nota del examen\n "+" 4. Mostrar lista de alumnos ordenados ascendentes\n "));
			if(n==1)
				{
					int op;
					n=Integer.parseInt(JOptionPane.showInputDialog(null, "  Seleccion una opcion\n "+" 1. Por Matricula\n "+" 2. Por Nombre\n "));
					if(op==1)
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
					else if(op==2)
					{
						String na;
						na=JOptionPane.showInputDialog(null,"Ingrese su nombre");
			
						System.out.println("\n\n\n----------------------------------------------");
						System.out.println("El estudiante solicitado es: ");
						for(int x=0;x<5;x++)
						{
							if(na.equals(dat[x].getNombres()))
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
				}
			else if(n==2)
				{
					String m;float nuevo_p;
					m=JOptionPane.showInputDialog(null,"Ingrese su matricula");
					
					System.out.println("\n\n\n----------------------------------------------");
					System.out.println("El estudiante solicitado es: ");
					for(int x=0;x<5;x++)
					{
						if(m.equals(dat[x].getMatricula()))
						{
							Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nueva nota parcial"));
							dat[x].setNota_parciales(nuevo_p);
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
				String m;float nuevo_p;
				m=JOptionPane.showInputDialog(null,"Ingrese su matricula");
				float nuevo_e;
				System.out.println("\n\n\n----------------------------------------------");
				System.out.println("El estudiante solicitado es: ");
				for(int x=0;x<5;x++)
				{
					if(m.equals(dat[x].getMatricula()))
					{
						Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nueva nota parcial"));
						dat[x].setNota_examen(nuevo_e);
					}
					else
					{
						if(x==4)
						System.out.print("El alumno no cuenta en el registro");
					}
				}
			}
			else if(n==4)
			{
				float aux[]=new float [5];
				for(int k = 0; k <5; k++)
		        {
		            for(int l = 0; l < 5; l++)
		            {
		            	if ((dat[k].getNota_parciales()+dat[k].getNota_examen())<(dat[l].getNota_parciales()+dat[l].getNota_examen())) 
		            	{    
		                    //aux[k]=dat[k];
		                    //dat[k]=dat[l];
		                    //dat[l]=aux[k];
		            	}
		            }
		            
		        }
			}
		}while(n!=4);

	}
	}

}
