package principal;

import javax.swing.JOptionPane;

public class nombres {
	private String names[];
	public nombres(String ... a){
		names=a;
	}
	
	
	public String[] getNames() {
		return names;
	}


	public void setNames(String[] names) {
		this.names = names;
	}
	
	public void sorting_decrement(){
		for(int i = 0; i < this.names.length; i++)
        {
            for(int j = 0; j < this.names.length; j++)
            {
            	if (names[i].compareTo(names[j])>=0) 
            	{    
                    String aux=names[i];
                    names[i]=names[j];
                    names[j]=aux;
            	}
            }
            
        }
	}
	
	public void sorting_increment(){
		for(int k = 0; k < this.names.length; k++)
        {
            for(int l = 0; l < this.names.length; l++)
            {
            	if (names[k].compareTo(names[l])<=0) 
            	{    
                    String aux=names[k];
                    names[k]=names[l];
                    names[l]=aux;
            	}
            }
            
        }
	}
	
	public void show_inf()
	{
	    for(int x=0;x<this.names.length;x++) {
            System.out.println(names[x]);
        }
	}
	
	public void menu(){
		int o;
		o=Integer.parseInt(JOptionPane.showInputDialog("Seleccion una opcion\n"+ " 1. Ordenar A-Z\n"+" 2. Ordenar Z-A"));
		if(o==1)
		{
			System.out.println("La lista ordenada de A-Z es: ");
			sorting_increment();
			show_inf();
		}
		else if(o==2)
		{
			System.out.println("La lista ordenada de Z-A es: ");
			sorting_decrement();
			show_inf();
		}
	}

}