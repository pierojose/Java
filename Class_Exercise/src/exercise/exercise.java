package exercise;

public class exercise {

	int num;
	public exercise(){
		this.num=num;
	}
	
	public int get_num(){
		return this.num;
	}
	
	public void set_num(int num){
		this.num=num;
	}
	
	public void rest(int num){
		int rest;
		rest=num-21;
		if(rest>21)
		{System.out.println(rest*2);}
		else if(rest<1)
		{System.out.println(rest*-1);}
		else
			System.out.println(rest);
	}
}
