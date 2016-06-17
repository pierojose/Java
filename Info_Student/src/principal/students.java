package principal;

public class students extends personas {
	private String matricula,career;

	public students(){
		
	}
	
	public students(String id,String matricula){
		this.setId(id);
		this.setMatricula(matricula);
	}
	
	public students(String id, String names, String lastname,String matricula){
		this.setId(id);
		this.setName(names);
		this.setMatricula(matricula);
		this.setLast_name(lastname);
	}
	
	public students(String names, String lastname,String career){
		this.setName(names);
		this.setLast_name(lastname);
		this.setCareer(career);
	}
	
	public students(String id,String names, String lastname,String city,String matricula,String career){
		this.setId(id);
		this.setName(names);
		this.setLast_name(lastname);
		this.setCity(city);
		this.setMatricula(matricula);
		this.setCareer(career);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
	public void show_inf(){
		System.out.println("Cedula-> "+getId()+" |Nombre-> "+getName()+" |Apellido-> "+getLast_name()+" |Ciudad-> "+getCity()
		+" |Matricula-> "+getMatricula()+" |Carrera-> "+getCareer());
	}
	
	public void verif(){
			if(getCity()=="Esmeraldas")
				show_inf();
	}
	
}