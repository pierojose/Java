package upper;

import javax.swing.JOptionPane;

public class mayus {
	
	private String cad;
	
	public mayus(){
		
	}

	public String getCad() {
		return cad;
	}

	public void setCad(String cad) {
		this.cad = cad;
	}
	
	public void mayuscula(){
		 String str1,str2;
		 int aux;
		 aux=cad.length();
		 if(aux<3)
			{JOptionPane.showMessageDialog(null,cad.toUpperCase());}
		 else
		 {str1 = cad.substring(0,cad.length()-3);
		 str2 = cad.toUpperCase().substring(cad.length()-3);
		 JOptionPane.showMessageDialog(null,(str1+str2));}
	}
	
	public void finalize(){
		JOptionPane.showMessageDialog(null,"El programa se va a cerrar");
	}

}