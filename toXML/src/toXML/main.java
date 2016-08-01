package toXML;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class main {
	public static void main(String[] args) {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("Estudiante",Estudiante.class);
		Estudiante alumno_a=new Estudiante("0002","Johanna Choez",22,15);
		String xml = xstream.toXML(alumno_a);
		
		fichero file_xml = new fichero("datos_xml.xml");
		file_xml.escribir(xml);
	}
}