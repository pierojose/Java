package principal;

import javax.swing.JOptionPane;

public class notas {
	
	private int matricula;
	private float nota_parciales,nota_examen;
	private String nombres, materia;
	public notas(){
		
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
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
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void Show_Apr(String nom[],float fin[],float par[]){
		System.out.println("Los estudiantes aprobados son: ");
		for(int i=0;i<=1;i++)
		{
			if((fin[i]+par[i])>=29.5)
				System.out.println(nom[i]);
		}
	}
	
	public void Search_Est(String n[],int mt[],int mat){
		System.out.println("El estudiante solicitado es: ");
		for(int i=0;i<=1;i++)
		{
			if((mt[i])==mat)
				System.out.println(n[i]);
		}
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}
