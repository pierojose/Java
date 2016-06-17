package principal;

import javax.swing.JOptionPane;

public class fact {
	
	private float costo[],sub=0;int tam,cantidad[],isi=12,ino=14; String productos[];
	
	public fact(float costo[],String productos[],int cantidad[],int tam){
		this.costo=costo;
		this.productos=productos;
		this.cantidad=cantidad;
		this.tam=tam;
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
	
	public void llenar_facturero()
	{
		for(int i=0;i<this.tam;i++)
		{
			this.productos[i]=JOptionPane.showInputDialog("Producto N°: "+(i+1));
			this.cantidad[i]=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de producto N°: "+(i+1)));
			this.costo[i]=Float.parseFloat(JOptionPane.showInputDialog("Costo de producto N°: "+(i+1)));
		}
	}

	public void show_products(){
		System.out.println("Los productos a facturar son-> ");
		System.out.println(" ");
		for(int i=0;i<this.tam;i++)
		{	
			System.out.println("Producto N° "+(i+1)+"-> "+this.productos[i]);
			System.out.println("Cantidad de Producto N° "+(i+1)+"-> "+this.cantidad[i]);
			System.out.println("Costo de Producto N° "+(i+1)+"-> "+this.costo[i]);
			System.out.println(" ");
		}
	}
	
	public float subtotal()
	{
		for(int x=0;x<this.tam;x++)
		{
			this.sub=this.sub+(this.cantidad[x]*this.costo[x]);
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
}
