package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class numv {
	
	String ruta,ip;
	String aux[]=new String[5000];
	int pos;
	
	public numv(){
		
	}
	
	public void leer_fichero() throws IOException{
		try{
			int i=1; 
			String ruta = principal.main.class.getResource("directorio.log").toString();
			ruta=ruta.substring(5, ruta.length());
			BufferedReader read = new BufferedReader(new FileReader(ruta));
			String line;
			while ((line=read.readLine())!= null){
			for(int x=0;x<line.length();x++){
			  if(line.substring(i-1,i).equals("[")){
				  pos++;
				  if(pos==1)
				  ip=line.substring(0,i-5);
				  aux[x]=ip;
				  //System.out.println(aux[x]);
			  }
			  i++;
			} 
			obtenerLista_ip(aux);
		    //System.out.println("El ip es: "+ip);
			i=1;
			pos=0;
			}
			}catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "Fichero no encontrado");
			}
	}
	
	public void obtenerLista_ip(String element[]){
		int c=0;
		String aux[]=new String[1546];
		for(int i=0;i<1546;i++){
			if(element[i]!=element[i+1])
			{c++;
				//aux[i]=element[i];}
			}
		}
			System.out.println("EL numero es: "+c);
	}
}
