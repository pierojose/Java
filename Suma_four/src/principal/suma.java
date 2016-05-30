package principal;

import javax.swing.JOptionPane;

public class suma {
	String a,b,c,d;
	int total;
	
	public suma(){
		
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public void comparar(String a, String b){
		if(!a.equals(b))
			this.total += Integer.parseInt(a) + Integer.parseInt(b);
	}
	
	public void finalize(){
		JOptionPane.showMessageDialog(null,"El programa se va a cerrar");
	}
	
}
