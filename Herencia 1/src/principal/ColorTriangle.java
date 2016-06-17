package principal;

public class ColorTriangle extends Triangle {
	
	private String color;
	
	ColorTriangle(){
		
	}
	
	ColorTriangle(String color,String style,double width,double height){
		super();
		//super(style,width,height);
		this.color=color;
	}

}