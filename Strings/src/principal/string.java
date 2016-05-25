package principal;

public class string {
	
	public string(){
		
	}
	
    public String deleteChar(String cad, int pos){
        String str1 = cad.substring(0, pos);//se corta la cadena antes de la posicion insertada
        String str2 = cad.substring(pos + 1);//se corta la cadena +1 de la posicion insertada
        String str = str1 + str2;//se concatenan las cadenas
        return str;
    }

}
