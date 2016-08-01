package toXML;

public class Estudiante {
	private String matricula,nombre;
	private double parcial,n_final;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getParcial() {
		return parcial;
	}

	public void setParcial(double parcial) {
		this.parcial = parcial;
	}

	public double getN_final() {
		return n_final;
	}

	public void setN_final(double n_final) {
		this.n_final = n_final;
	}

	public Estudiante(){
		
	}
	
	public Estudiante(String matricula,String nombre,double parcial,double n_final){
		this.matricula = matricula;
		this.nombre = nombre;
		this.parcial = parcial;
		this.n_final = n_final;
	}
}