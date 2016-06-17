package principal;

public class pract {
	
	public pract(){
		
	}
	
	public void view_args(int ... a){
		
		int acum=0,acum2=0;
		System.out.println("Numero de argumentos-> "+a.length);
		
		for(int i=0;i<a.length;i++)
		{
			acum += a[i];
		}
		
		System.out.println("La suma es-> "+acum);
	}

}
