package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) throws IOException {
		try {
			String ruta=principal.main.class.getResource("archi.log").toString();
			ruta=ruta.substring(5,ruta.length());
			
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String lineaFichero;
			while((lineaFichero = br.readLine()) != null){
				System.out.println(lineaFichero);
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Fichero no encontrado");
			//e.printStackTrace();
		} 
	}
}
