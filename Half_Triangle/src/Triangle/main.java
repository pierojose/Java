package Triangle;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		triangle shape = new triangle();
		shape.set_size(Integer.parseInt(JOptionPane.showInputDialog("Put your size")));
		System.out.print("Your size is: ");
		System.out.println(shape.get_size());
		shape.draw_shape(shape.get_size());

	}

}
