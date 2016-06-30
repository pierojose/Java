package principal;

import javax.swing.JOptionPane;

public class datos {

		private float nota_parciales,nota_examen, nueva_nota_p,nueva_nota_e;
		private String nombres, matricula;
		private char genero;
		public datos(String matricula,float notas_parciales, float nota_examen,String nombres,char genero)
		{
			this.matricula = matricula;
			this.nota_parciales=nota_parciales;
			this.nota_examen = nota_examen;
			this.nombres = nombres;
			this.genero = genero;
		}
		
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public float getNota_parciales() {
			return nota_parciales;
		}
		public void setNota_parciales(float nota_parciales) {
			this.nota_parciales = nota_parciales;
		}
		public float getNota_examen() {
			return nota_examen;
		}
		public void setNota_examen(float nota_examen) {
			this.nota_examen = nota_examen;
		}
		public String getNombres() {
			return nombres;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		
		public void show_inf(){
			System.out.println("Matricula-> "+ this.matricula + " | Nombre-> "+this.nombres + " | Nota del Examen Final-> "+ this.nota_examen
			+ " | Nota del semestre-> " + this.nota_parciales + "| Genero-> "+ this.genero);
		}
		
		public void Show_Apr(){
			if((this.nota_parciales+this.nota_examen)>=29.5)
				System.out.println("Matricula-> "+ this.matricula + " | Nombre-> "+this.nombres + " | Nota del Examen Final-> "+ this.nota_examen
						+ " | Nota del semestre-> " + this.nota_parciales + "| Genero-> "+ this.genero);
		}
	
		protected void finalize(){
			JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
		}
}
