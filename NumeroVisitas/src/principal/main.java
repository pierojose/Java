package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) throws IOException {
		numv proceso = new numv();
		proceso.leer_fichero();
	}
}
