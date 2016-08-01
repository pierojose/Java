import org.xml.sax.*;
import javax.swing.JOptionPane;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.sax.*;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Vector;

public class analizar_txt {
	
	String[] matricula = new String[10];
	String[] nombres = new String[10];
	String[] direccion = new String[10];
	String[] ciudad = new String[10];
	String [] edad = new String[10];
	
	String [] dato = new String[10];
    public void leer() throws IOException {
    	try {
			String ruta=main.class.getResource("file.txt").toString();
			ruta=ruta.substring(5,ruta.length());
			
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String lineaFichero;
			int i=0;
			while((lineaFichero = br.readLine()) != null){
				dato[i] = lineaFichero;
				i++;
			}
			almacenar(dato);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Fichero no encontrado");
		} 
    }
    
    private void almacenar(String linea[]){
    	for(int i=0;i<10;i++)
    	{
    		matricula[i] =linea[i].split(";")[0];
    		nombres[i] = linea[i].split(";")[1];
    		direccion[i] = linea[i].split(";")[2];
    		ciudad[i] = linea[i].split(";")[3];
    		edad[i] = linea[i].split(";")[4];
    	}
    }
    
    public void mostrar(){
    	for(int i=0;i<10;i++)
    	{
    		System.out.println(matricula[i]);
    		System.out.println(nombres[i]);
    		System.out.println(direccion[i]);
    		System.out.println(ciudad[i]);
    		System.out.println(edad[i]);
    		System.out.println(" ");
    	}
    }
    
    public void mostrar_guayaquil()
    {
    	System.out.println("Las personas que viven en Guayaquil son: ");
    	for(int i=0;i<10;i++)
    	{
    			if(ciudad[i].equals("Guayaquil"))
    			{
    			System.out.println("Nombres-> " + nombres[i]);
    			}
    	}
    }
    
    public void mostrar_mayores()
    {
    	System.out.println("\nLas personas mayores a 40 años son: ");
    	for(int i=0;i<10;i++)
    	{
    			if(Integer.parseInt(edad[i])>40)
    			{
    			System.out.println("Nombres-> " + nombres[i]);
    			}
    	}
    }
}