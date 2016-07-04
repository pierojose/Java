package direccion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


public class ip implements inte{
	
	String line,aux,ruta,ip,fecha,list[]=new String [2000];
	String q;
	String arr[]=new String[2000]; 
	int pos,cont=0;
	
	public void lectura() throws IOException{
	try{
		String z="";
		int h=0,i=1,k=0,w=0,d=0;
		ruta = ip.class.getResource("log.log").toString();
		ruta=ruta.substring(5, ruta.length());
		BufferedReader read = new BufferedReader(new FileReader(ruta));
		while ((line=read.readLine())!= null){
		for(int x=0;x<line.length();x++){
		  if(line.substring(i-1,i).equals("[")){
			  pos++;
			  if(pos==1)
			  ip=line.substring(0,i-5);
		  }
		  if(line.substring(i-1,i).equals("]") ){
			  if(pos==1)
			  fecha=line.substring(ip.length()+5,i-7); 
		  }
		  i++;
		  list[k]=ip+" "+fecha;
		  	
		} 
		k++;
		
	    
		i=1;
		pos=0;
		cont=0; 
		h++;
		}
		for(int f=0;f<k;f++){ 
			aux=list[f].substring(0,list[f].length()-9);
			d=0;
			for(int t=0;t<k;t++){ 
	    	if(aux.equals(list[t].substring(0,list[t].length()-9))){
	    		d++;
	    	    q=aux;
	    		
	    	}
	    	
	   	    	
		}
	    arr[f]=q+" "+d;
	    }
		int y,r,t=0,p=0;
		
		    for ( y=0;y<k;y++){
            	if(arr[y]==arr[y+1]){
            		arr[y+1]="-1";
            	}
            	if(arr[y+1]!="-1"){
                    System.out.println(y+" "+arr[y]);
            	}
            }
		
		//for (int x=0;x<p;x++)
          //  System.out.println(v_final[x]);
	    	
	    
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "NO EXISTE","ATENCION",JOptionPane.WARNING_MESSAGE);
		}
	}
}

