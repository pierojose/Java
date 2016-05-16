package Triangle;

public class triangle {

    int size;
    
    public triangle(){
  	  
    }
    
    public int get_size(){
    	  return this.size;
    }
      
    public void set_size(int size){
    	  this.size = size;
    }
    
    public void draw_shape(int size){
        for(int i=1;i<=size;i=i+2)
        {
            for(int k=size+1;k>=i;k=k-2)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
