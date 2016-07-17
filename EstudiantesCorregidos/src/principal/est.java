package principal;

import javax.swing.JOptionPane;

public class est {	
	private float notas_parciales,nota_examen;
	private String nombres, materia, matricula;
	
	public est(String matricula,float notas_parciales, float nota_examen,String nombres, String materia)
	{
		this.matricula = matricula;
		this.notas_parciales = notas_parciales;
		this.nota_examen = nota_examen;
		this.nombres = nombres;
		this.materia = materia;
	}

	public float getNotas_parciales() {
		return notas_parciales;
	}

	public void setNotas_parciales(float notas_parciales) {
		this.notas_parciales = notas_parciales;
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void show_inf(){
		System.out.println("Matricula-> "+ this.matricula + " | Nombre-> "+this.nombres + " | Nota del Examen Final-> "+ this.nota_examen
		+ " | Nota del semestre-> " + this.notas_parciales + "| Materia cursada-> "+ this.materia);
	}
	
	public void Show_Apr(){
			if((this.notas_parciales+this.nota_examen)>=29.5)
				System.out.println("Matricula-> "+ this.matricula + " | Nombre-> "+this.nombres + " | Nota del Examen Final-> "+ this.nota_examen
						+ " | Nota del semestre-> " + this.notas_parciales + "| Materia cursada-> "+ this.materia);
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}