
public class diamond {
	
    int size;
    
    public diamond(){
  	  
    }
    
    public int get_size(){
    	  return this.size;
    }
      
    public void set_size(int size){
    	  this.size = size;
    }
    
    public void draw_diamond(int size){
    	int anc = 0;
        anc = size * 2;
        int x = 1;
        
        while (x <= size) {
            int y = 1;
            while (y <= anc) {
                if (((size + 1) - x) == y)
                    System.out.print("*");
                else 
                    if ((size + x) == y+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
                y++;
            }
            x++;
            System.out.print("\n");
        }
        x = size;
        while (x > 1) {
            int y = 1;
            while (y < anc) {
                if (((size + 1) - x) == y-1)
                	System.out.print("*");
                else if ((size + x) == y+2)
                	System.out.print("*");
                else
                	System.out.print(" ");
                y++;
            }
            x--;
            System.out.print("\n");
        }
    }

}