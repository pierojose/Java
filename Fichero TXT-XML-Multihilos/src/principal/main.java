package principal;

import java.util.List;
import java.util.ArrayList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class main {

	public static void main(String[] args)throws Exception  {
		
		XStream xstream = new XStream(new DomDriver());
		List lst_estudiantes = new ArrayList();
		xstream.alias("Estudiante", Estudiantes.class);
		
		Estudiantes alumno_a = new Estudiantes("4565","Maria Simisterra","Direccion","Esmeraldas",20);
		Estudiantes alumno_b = new Estudiantes("5698","Carlos Mideros","Barrio Alto","Quininde",17);
		Estudiantes alumno_c = new Estudiantes("9834","Fork Cevallos","Los Hermanos","Esmeraldas",17);
		Estudiantes alumno_d = new Estudiantes("8789","Tera Estupinan","Prado","Quininde",23);
		Estudiantes alumno_e = new Estudiantes("7412","Karla Quinonez","20 de Noviembre","Esmeraldas",45);
		Estudiantes alumno_f = new Estudiantes("4852","Marcos Lirios","Duran","Atacames",60);
		Estudiantes alumno_g = new Estudiantes("0002","Jenniffer Bautista","Codesa","Esmeraldas",22);
		Estudiantes alumno_h = new Estudiantes("4836","Joaquin Zambrano","Esmeraldas Libre","Esmeraldas",58);
		Estudiantes alumno_i = new Estudiantes("0005","Emperatriz Rivero","Barrio Lindo","Atacames",75);
		Estudiantes alumno_j = new Estudiantes("0001","Andres Robles","Las Palmas","Esmeraldas",19);
		
		lst_estudiantes.add(alumno_a);
		lst_estudiantes.add(alumno_b);
		lst_estudiantes.add(alumno_c);
		lst_estudiantes.add(alumno_d);
		lst_estudiantes.add(alumno_e);
		lst_estudiantes.add(alumno_f);
		lst_estudiantes.add(alumno_g);
		lst_estudiantes.add(alumno_h);
		lst_estudiantes.add(alumno_i);
		lst_estudiantes.add(alumno_j);
		
		String xml = xstream.toXML(lst_estudiantes);
		
		XMLFichero file_xml = new XMLFichero("datos_xml.xml");
		file_xml.escribir("estudiantes.txt");
	}
}