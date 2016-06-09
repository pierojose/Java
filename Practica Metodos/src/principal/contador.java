package principal;

public class contador {
	private String cad;
	private int n_vocales;
	public contador(){
		
	}
	public String getCad() {
		return cad;
	}
	public void setCad(String cad) {
		this.cad = cad;
	}
	
	private int resul(String c){
		int aux = c.length(),cont=0;
		char aux2;
		for(int i=0;i<aux;i++)
		{
			aux2=c.charAt(i);
			if(aux2=='a'||aux2=='e'||aux2=='i'||aux2=='o'||aux2=='u')
				cont++;
		}
		return cont;
	}
	
	public void show_inf(){
		this.n_vocales=resul(cad);
		System.out.println("La cadena "+this.cad+" tiene "+n_vocales+" vocales");
	}

}
