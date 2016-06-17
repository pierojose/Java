package principal;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {

		int tam;
		
		tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de productos a facturar "));
		
		float cost[]=new float [tam];int cant[]=new int [tam];
		String product[]=new String [tam];
		
		fact pro = new fact(cost,product,cant,tam);
		
		int n;
		do{
		n=Integer.parseInt(JOptionPane.showInputDialog(null, "  Seleccion una opcion\n "+" 1. Llenar facturero\n "+" 2. Mostrar datos del facturero\n "+" 3. Calcular total de la factura\n "+" 4. Limpiar facturero\n "
		+" 5. Salir\n "));
			if(n==1)
			{
				pro.llenar_facturero();
			}
			else if(n==2)
			{
				pro.show_products();
			}
			else if(n==3)
			{
				int op;
					op=Integer.parseInt(JOptionPane.showInputDialog("  ¿Esta en una provincia afectada?\n "+" 1. Si\n "+" 2. No\n "));
					if(op==1)
					{
						JOptionPane.showMessageDialog(null,"SUBTOTAL: " + pro.subtotal());
						JOptionPane.showMessageDialog(null,"IVA 12%: " + pro.iva_isi());
						JOptionPane.showMessageDialog(null,"TOTAL: " + (pro.total_isi()));
					}
					else if(op==2)
					{
						JOptionPane.showMessageDialog(null,"SUBTOTAL: " + pro.subtotal());
						JOptionPane.showMessageDialog(null,"IVA 14%: " + pro.iva_ino());
						JOptionPane.showMessageDialog(null,"TOTAL: " + (pro.total_ino()));
					}
			}
			else if(n==4)
			{
				JOptionPane.showMessageDialog(null, "Facturero Vacio");
				pro=null;
			}
			else if(n==5)
			{
					pro=null;
					System.gc();
			}
		}while(n!=5);
	}
}