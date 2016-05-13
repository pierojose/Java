import javax.swing.*;

public class main {

	public static void main(String[] args) {
		
		robot r2d2 = new robot();
		r2d2.set_name(JOptionPane.showInputDialog("Put your name"));
		System.out.print("Tu nombre es: ");
		System.out.println(r2d2.get_name());
		
		r2d2.set_age(Integer.parseInt(JOptionPane.showInputDialog("Put your age")));
		System.out.print("Tu edad es: ");
		System.out.println(r2d2.get_age());
	}

}
