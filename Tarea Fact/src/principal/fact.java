package principal;

import javax.swing.JOptionPane;

public class fact {
	
	 float costo[]=new float [50],sub=0;
	 int aux=0, pos=0, cantidad[]= new int [50],isi=12,ino=14;
	String productos[]= new String [50];
	
	public fact(){

	}
	
	public float[] getCosto() {
		return costo;
	}

	public void setCosto(float[] costo) {
		this.costo = costo;
	}

	public String[] getProductos() {
		return productos;
	}

	public void setProductos(String[] productos) {
		this.productos = productos;
	}
	
	public void fill_productos()
	{
		aux++;
		for(int i=pos;i<aux;i++)
		{
	 		this.productos[i]=JOptionPane.showInputDialog("Producto N°: "+aux);
			this.cantidad[i]=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de producto N°: "));
			this.costo[i]=Float.parseFloat(JOptionPane.showInputDialog("Costo de producto N°: "));
		}
		pos++;
	}

	public void show_products(){
		System.out.println("Los productos a facturar son-> ");
		System.out.println(" ");
		for(int i=0;i<aux;i++)
		{	
			System.out.println("Producto N° "+(i+1)+"-> "+this.productos[i]);
			System.out.println("Cantidad de Producto N° "+(i+1)+"-> "+this.cantidad[i]);
			System.out.println("Costo de Producto N° "+(i+1)+"-> "+this.costo[i]);
			System.out.println(" ");
		}
	}
	
	public float subtotal()
	{
		for(int i=0;i<aux;i++)
		{
			this.sub=this.sub+(this.cantidad[i]*this.costo[i]);
		}
		return this.sub;
	}
	
	public float iva_isi(){
		return (this.sub*isi)/100;
	}
	
	public float iva_ino(){
		return (this.sub*ino)/100;
	}
	
	public float total_isi(){
		return this.sub+iva_isi();
	}
	
	public float total_ino(){
		return this.sub+iva_ino();
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
	
	public void menu()
	{	
		int n;
		do{
		n=Integer.parseInt(JOptionPane.showInputDialog(null, "  Seleccion una opcion\n "+" 1. Llenar facturero\n "+" 2. Mostrar datos del facturero\n "+" 3. Calcular total de la factura\n "+" 4. Limpiar facturero\n "
		+" 5. Salir\n "));
			if(n==1)
			{
				fill_productos();
			}
			else if(n==2)
			{
				show_products();
			}
			else if(n==3)
			{
				int op;
					op=Integer.parseInt(JOptionPane.showInputDialog("  ¿Esta en una provincia afectada?\n "+" 1. Si\n "+" 2. No\n "));
					if(op==1)
					{
						JOptionPane.showMessageDialog(null,"SUBTOTAL: " + subtotal());
						JOptionPane.showMessageDialog(null,"IVA 12%: " + iva_isi());
						JOptionPane.showMessageDialog(null,"TOTAL: " + total_isi());
					}
					else if(op==2)
					{
						JOptionPane.showMessageDialog(null,"SUBTOTAL: " + subtotal());
						JOptionPane.showMessageDialog(null,"IVA 14%: " + iva_ino());
						JOptionPane.showMessageDialog(null,"TOTAL: " + total_ino());
					}
			}
			else if(n==4)
			{
				JOptionPane.showMessageDialog(null, "Facturero Vacio");
				for(int x=0;x<aux;x++)
				{
				costo[x]=0;
				cantidad[x]=0;
				productos[x]=null;
				}
			}
			else if(n==5)
			{
					System.gc();
			}
		}while(n!=5);
	}
}