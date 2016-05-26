package principal;

import javax.swing.JOptionPane;

public class st_control {
	String e;
	public st_control(){
		
	}
	
    public String get_st(){
  	  return this.e;
    }
    
    public void set_st(String e){
  	  this.e = e;
    }
    
	public boolean control(){
		if(this.e.length()<2)
			return false;
		String new_e = this.e.substring(0,2);
		if(new_e.equals("ca"))
			return true;
		return false;
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}
