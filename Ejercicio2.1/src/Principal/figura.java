package Principal;

public class figura {
	
	String cad;
	
	public figura(){
		
	}

	public String getCad() {
		return cad;
	}

	public void setCad(String cad) {
		this.cad = cad;
	}
	
	public void shape_v(){
		int pos,size;
		size=cad.length();
		pos=0;
		for(int i=1;i<=size;i++)
		{
			System.out.println(cad.substring(pos));
			System.out.print(" ");
			pos=pos+1;
		}
	}
}
