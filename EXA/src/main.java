import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		analizar_txt proceso = new analizar_txt();
		proceso.leer();
		proceso.mostrar();
		proceso.mostrar_guayaquil();
		proceso.mostrar_mayores();
		
		analizar_xml proceso_xml = new analizar_xml();
		proceso_xml.leer();
		proceso_xml.mostrar();
		proceso_xml.mostrar_esmeraldas();
		proceso_xml.mostrar_mayores();

	}

}
