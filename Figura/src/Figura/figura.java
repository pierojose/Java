package Figura;

public class figura {
    int height;
    int width;
    
    public figura(){
  	  
    }
    
    public int get_height(){
  	  return this.height;
    }
    
    public void set_height(int height){
  	  this.height = height;
    }
    
    public int get_width(){
  	  return this.width;
    }
    public void set_width(int width){
  	  this.width = width;
    }
    
    public void dibujar(int height,int width){
        int contador = 1;
        int contador2 = 1;
        while (contador2 < height+1){
              contador = 1;
              while (contador < width+1){
                    if (contador2 == 1)
                    	System.out.print("* ");
                    if (contador2 != 1)
                       if (contador2 != height){
                          if (contador == 1)
                        	  System.out.print("* ");
                          else
                              if (contador <width)
                            	  System.out.print("  ");
                              else
                            	  System.out.print("* ");
                                  }
                       else 
                    	   System.out.print("* ");   
                    contador++;
              }
              System.out.print(" \n");
              contador2++;
        }
        System.out.print(" \n");
    }
}
