package principal;

public class main {

	public static void main(String[] args) {
		controladores item = new controladores();
		controladores item2 = new controladores();
		controladores item3[]=new controladores[5];
		
		item3[0]=new controladores("004",2,"Azul");
		item3[0].show_inf();
		
		item.color="Verde";
		item2.color="Rojo";
		
		item.setCodigo("001");
		item2.setCodigo("002");
		
		item.setTama(2);
		item2.setTama(3);
		
		item.show_inf();
		item2.show_inf();
	}
}
