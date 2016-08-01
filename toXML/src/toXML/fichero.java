package toXML;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class fichero {
	private String nombre_fichero;
	
	public fichero(String nombre_fichero){
		this.nombre_fichero = nombre_fichero;
	}
	
	public void escribir(){
		
	}
	
	public void leer_xml(String nombre_xml){
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("Estudiante",Estudiante.class);
		Estudiante ob1 = (Estudiante) xstream.fromXML(contenido_xml);
		System.out.print(ob1.getNombre());
	}

}