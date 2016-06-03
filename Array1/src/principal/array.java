package principal;

public class array {
	
	public array(int arr[]){
		
	}
	
	public void sorting(int arr[])
	{
	        for(int i = 0; i < arr.length - 1; i++)
	        {
	            for(int j = 0; j < arr.length - 1; j++)
	            {
	                if (arr[j] > arr[j + 1])
	                {
	                    int tmp = arr[j+1];
	                    arr[j+1] = arr[j];
	                    arr[j] = tmp;
	                }
	            }
	        }
	        for(int i = 0;i < arr.length; i++)
	        {
	            System.out.print(arr[i]+"\n");
	        }
	}
	
	public void getMax(int a[]){
		int aux=a.length;
		System.out.println("El maximo es: "+a[aux-1]);
	}
	
	public void getMin(int a[]){
		System.out.println("El minimo es: "+a[0]);
	}
	
	public void getPromedio(int a[]){
		float aux=0;
		for(int i=0;i<a.length;i++)
		{
			aux=aux+a[i];
		}
		System.out.println("El promedio es: "+aux/a.length);
	}
}