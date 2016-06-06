package principal;

public class main {
	public static void main(String[] args) {
		int mtr[][] = {{3,1,8,2,5,7,9,10},{13,0,12,15,19,1,5,25}};
		matriz m = new matriz(mtr);
		m.sorting(mtr);
		m.get_promedio(mtr);
		m.get_min(mtr);
		m.get_max(mtr);
		mtr=null;
		System.gc();
	}
}