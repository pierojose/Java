package Figura;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		figura rectangle = new figura();
		
		rectangle.set_height(Integer.parseInt(JOptionPane.showInputDialog("Put your height")));
		System.out.print("Your height is: ");
		System.out.println(rectangle.get_height());
		
		rectangle.set_width(Integer.parseInt(JOptionPane.showInputDialog("Put your width")));
		System.out.print("Your width is: ");
		System.out.println(rectangle.get_width());
		
		rectangle.dibujar(rectangle.get_height(),rectangle.get_width());
	}

}
