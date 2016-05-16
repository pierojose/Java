import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		diamond rhomb = new diamond();
		rhomb.set_size(Integer.parseInt(JOptionPane.showInputDialog("Put your size")));
		System.out.print("Your size is: ");
		System.out.println(rhomb.get_size());
		rhomb.draw_diamond(rhomb.get_size());
	}

}
