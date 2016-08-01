package multihiloFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xml_hilo implements Runnable {
	
	private Thread xml; 
	
	public void leer_xml(String nombre_xml) throws Exception{
		
		 String contenido_xml = "";
			BufferedReader br = new BufferedReader(new FileReader(nombre_xml));
			try {
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();

			    while (line != null) {
			        sb.append(line);
			        sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
			
			    contenido_xml = sb.toString();
			}
			catch(Exception e){
				 System.out.println("Error al leer el fichero");
			 }finally {
			    br.close();
			}
			
			XStream xstream = new XStream(new DomDriver());
			xstream.alias("Estudiante", Estudiante.class);
			List lst_estudiante = new ArrayList();
			lst_estudiante = (List) xstream.fromXML(contenido_xml);
			Estudiante a = new Estudiante();
			System.out.println("-----------------------------------------Esmeraldas-------------------------------------------");
			for(int i=0;i<6;i++){
			a = (Estudiante) lst_estudiante.get(i);
			if(a.getCiudad().equals("Esmeraldas"))
			System.out.println("Matricula: "+a.getMatricula()+" Nombre: "+a.getNombres()+" Direccion: "+a.getDireccion()+" Ciudad: "+a.getCiudad()+" Edad: "+a.getEdad());
		}
			System.out.println("-----------------------------------------ADULTOS------------------------------------------------");

			for(int i=0;i<6;i++){
				a = (Estudiante) lst_estudiante.get(i);
				if(a.getEdad()>=18)
				System.out.println("Matricula: "+a.getMatricula()+" Nombre: "+a.getNombres()+" Direccion: "+a.getDireccion()+" Ciudad: "+a.getCiudad()+" Edad: "+a.getEdad());
			}
}

	
	public void run() {
		try {
	    	leer_xml("test.xml"); 
		} catch (IOException e) {	
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
	 public void start () {
		    System.out.println("Iniciando");
		    if (xml == null) {
		      xml = new Thread (this);
		      xml.start();
		    }
		   
		  }	

}
