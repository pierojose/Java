package principal;

public class meses {
	
	String mes[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
			"Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	int ta;

	public meses(){
		
	}
	
	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}

	public void dev_mes(int v){
		System.out.print("El mes es: "+mes[v]);
	}

}
