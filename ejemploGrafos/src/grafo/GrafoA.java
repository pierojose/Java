package grafo;

import java.util.List;




import java.util.*;



public class GrafoA<Type> extends GrafoNoPonderadoMA<Object>{

	
	private List<String> vertices = new ArrayList<String>();
	private int [][] matriz_adyacente = new int[99][99];
	
	@Override
	public boolean EsVacio() {
		if(this.NumeroDeVertices()==0){
			return true;
		}
		return false;
	}

	@Override
	public int NumeroDeVertices() {
		// TODO Auto-generated method stub
		return vertices.size();
	}

	@Override
	public int NumeroDeArcos() {
		// TODO Auto-generated method stub
		int cont=0;
		for(int x=0; x<this.NumeroDeVertices();x++)
		{
			for(int y=0; y<this.NumeroDeVertices();y++)
			{
				if(this.matriz_adyacente[x][y]!=0)
				{
					if(this.matriz_adyacente[x][y]==this.matriz_adyacente[y][x]){
						cont++;
					}
				}
			}
		}
		return cont/2;
	}

	@Override
	public boolean EstaElVertice(Object V) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean EstaElArco(int[] A) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void InsertarVertice(String[] V) {
		// TODO Auto-generated method stub
		for(int i=0;i<V.length;i++){
			this.vertices.add(V[i]);
		}
		
		
	}

	@Override
	public void InsertarArco(int[][] Arco) {
		// TODO Auto-generated method stub
		if(Arco[0].length==this.NumeroDeVertices()&&Arco[1].length==this.NumeroDeVertices())
		{
			for(int x=0; x<Arco[0].length;x++)
			{
				for(int y=0; y<Arco[0].length;y++)
				{
					this.matriz_adyacente[x][y]=Arco[x][y];
					
				}
				
			}
		}else
		{
			System.out.println("Error el tama�o de la matriz de arco no coincide con el numero de vertices");
		}
		
		
	}

	@Override
	public void Eliminar(Object V) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarArco(Object Arco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> AdyacentesA(Object V) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Reemplazar(Object VViejo, Object VNuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> RecorrerALoAncho() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> RecorrerEnProfundidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean EsConexo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Object> MenorCamino(Object V1, Object V2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Completo()
	{
		int n=this.NumeroDeVertices();
		if(n>0 && this.NumeroDeArcos()==((n*(n-1))/2))
		{
			return true;
		}
		return false;
	}
	
	public int GradoDe(String Vertice){
		
		int cont=0;
		if(this.NumeroDeVertices()<=0 && this.NumeroDeArcos()<=0)
			return 0;
		
		int fila=vertices.indexOf(Vertice);
		
		
			for(int c=0; c<this.NumeroDeVertices();c++)
			{
				if(this.matriz_adyacente[fila][c]!=0)
				{
						cont++;
				}
			}
		
	 	return cont;
	}
	
	public void AislarGrafo(String v){
		int pos=vertices.indexOf(v);
		if(pos>=0)
		{
			for(int i=0;i<vertices.size();i++)
			{
				matriz_adyacente[i][pos]=0;
				matriz_adyacente[pos][i]=0;
			}
		}
	}
}
