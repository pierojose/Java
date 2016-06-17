package principal;

public class main {

	public static void main(String[] args) {
		students o1 = new students("0801234567","4509");
		students o2 = new students("0807654321","Pedro","Picapiedras","4875");
		students o3 = new students("Pablo","Marmol","Sistemas");
		students o4 = new students("0789456214","Barry","Allen","Esmeraldas","4598","Ambiental");
		
		//OBJETO 1
		o1.setName("Clark");
		o1.setLast_name("Ken");
		o1.setCity("Esmeraldas");
		o1.setCareer("Administracion");
		//OBJETO 2
		o2.setCity("Quito");
		o2.setCareer("Comercio Exterior");
		//OBJETO 3
		o3.setId("0705421345");
		o3.setCity("Esmeraldas");
		o3.setMatricula("4785");
		
		o1.verif();
		o2.verif();
		o3.verif();
		o4.verif();
	}

}
