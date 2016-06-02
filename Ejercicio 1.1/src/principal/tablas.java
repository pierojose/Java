package principal;

public class tablas {
	int num;
	public tablas(){
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void table(){
		//CONSTRUCCION DE MARGEN HORIZONTAL DE LA TABLA
		for(int x=1;x<=num+1;x++)
		{
			if(x==1)
			System.out.print("*|");
			else
			System.out.print(x-1);
			System.out.print("_");
			
			
			if(x==num+1)
			System.out.println(" ");
		}
		
		//CONSTRUCCION DEL INTERIOR DE LA TABLA
		for(int j=1;j<=num;j++)
		{
			System.out.print(j+"|");
			for(int k=1;k<=num;k++)
			{
				System.out.print(" "+j*k);
				if(k==num)
				System.out.println(" ");
			}
		}
	}
}
