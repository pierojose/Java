package principal;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
		
		int a_matr[]={0,0};
		String a_sub[]={"",""},a_nom[]={"",""};
		float a_parcial[]={0,0},a_final[]={0,0};
		notas proceso = new notas();
		int seleccion;
		do{
			seleccion = JOptionPane.showOptionDialog(
				   null, "Seleccione opcion", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null, new Object[] { "Llenar Lista", "Mostrar Datos", "Salir" },
				   "opcion 1");
				if (seleccion == 0)
				{   
				   for(int i=0;i<=1;i++)
				   {
					   proceso.setMateria(JOptionPane.showInputDialog("Ingrese la materia "+i));
					   a_sub[i]=proceso.getMateria();
					   proceso.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su N° de matricula"+i)));
					   a_matr[i]=proceso.getMatricula();
					   proceso.setNombres((JOptionPane.showInputDialog("Ingrese su nombre completo "+i)));
					   a_nom[i]=proceso.getNombres();
				   //CONTROL DEL VALOR DE LA NOTA DE EXAMEN FINAL
					   do{
						   proceso.setNota_examen(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del examen final "+i)));
						   a_final[i]=proceso.getNota_examen();
					   }while(proceso.getNota_examen()>20);
				   //CONTROL DEL VALOR DE NOTA DEL PARCIAL
					   do{
						   proceso.setNota_parciales(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del parcial "+i)));
						   a_parcial[i]=proceso.getNota_parciales();
					   }while(proceso.getNota_parciales()>30);
				   }
				}
				else if(seleccion == 1)
				{
					int seleccion1;
					do{
						seleccion1 = JOptionPane.showOptionDialog(
							   null, "Seleccione opcion", 
							   "Opcion Mostrar",
							   JOptionPane.YES_NO_CANCEL_OPTION,
							   JOptionPane.QUESTION_MESSAGE,
							   null, new Object[] { "Estudiantes Aprobados", "Estudiantes por N° Matricula", "Salir" },
							   "opcion 1");
						if(seleccion1 == 0)
						{
							proceso.Show_Apr(a_nom,a_final, a_parcial);
						}
						else if(seleccion1 == 1)
						{
							int n;
							n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de matricula del estudiante"));
							proceso.Search_Est(a_nom,a_matr,n);
						}
						else if(seleccion1 == 2)
						{
							proceso=null;
							System.gc();
						}
						
					}while(seleccion1!=2);
				}
				else if(seleccion==2)
				{
					proceso=null;
					System.gc();
				}
		}while(seleccion!=2);
	}

}
