package principal;

public class controladores {
	
	//EL OBJETO ES UNA MANZANA
	private String codigo;
	private int tama;
	public String color;
	
	public controladores(){
		
	}
	
	public controladores(String codigo){
		this.codigo = codigo;
	}
	
	public controladores(int tama){
		this.tama = tama;
	}

	public controladores(String codigo, int tama){
		this.codigo = codigo;
		this.tama = tama;
	}
	
	public controladores(String codigo, int tama, String color){
		this.codigo = codigo;
		this.tama = tama;
		this.color = color;
	}
	
	//GETTERS AND SETTERS
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getTama() {
		return tama;
	}
	public void setTama(int tama) {
		this.tama = tama;
	}
	
	//METHODS
	public void show_inf(){
		System.out.println("Codigo-> "+this.codigo+" | Color-> "+this.color+" | Tamaño-> "+con(this.tama));
	}
	
	private String con(int tamanio){
		switch(tamanio)
		{
		case 1:
			return "Pequeño";
		case 2:
			return "Mediano";
		case 3:
			return "Grande";
		default:
			return "Tamaño desconocido";
		}
	}
}
