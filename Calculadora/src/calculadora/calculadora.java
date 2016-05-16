package calculadora;
import javax.swing.JOptionPane;
public class calculadora {
	
	float num1,num2;
	
	public calculadora(float num1,float num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
    public float get_num1(){
    	  return this.num1;
      }
      
      public void set_num1(float num1){
    	  this.num1 = num1;
      }

    public float get_num2(){
    	  return this.num2;
      }
      
      public void set_num2(float num2){
    	  this.num2 = num2;
      }  
    
      
	public void suma(float num1, float num2){
		float resultado=this.num1+this.num2;
		JOptionPane.showMessageDialog(null,"El resultado de la suma es: "
		+ Float.toString(resultado));
	}
	
	public void resta(float num1, float num2){
		float resultado=this.num1-this.num2;
		JOptionPane.showMessageDialog(null,"El resultado de la resta es: "
	    + Float.toString(resultado));
	}
	
	public void multiplicacion(float num1, float num2){
		float resultado=this.num1*this.num2;
		JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "
		+ Float.toString(resultado));
	}
	
	public void division(float num1, float num2){
		float resultado=this.num1/this.num2;
		JOptionPane.showMessageDialog(null,"El resultado de la division es: "
		+ Float.toString(resultado));
	}
	
	public void rc(float num){
		float resultado=(float)Math.sqrt(num);
		JOptionPane.showMessageDialog(null,"La raiz cuadrada de: "
		+Float.toString(num)+" es ="+Float.toString(resultado));
	}
	
	public void sen(float num){
		float resultado=(float)Math.sin(num);
		JOptionPane.showMessageDialog(null,"El seno de: "
		+Float.toString(num)+" es ="+Float.toString(resultado));
	}
	
	public void cos(float num){
		float resultado=(float)Math.cos(num);
		JOptionPane.showMessageDialog(null,"El coseno de: "
		+Float.toString(num)+" es ="+Float.toString(resultado));
	}
	
	public void tan(float num){
		float resultado=(float)Math.tan(num);
		JOptionPane.showMessageDialog(null,"La tangente de: "
		+Float.toString(num)+" es ="+Float.toString(resultado));
	}

}