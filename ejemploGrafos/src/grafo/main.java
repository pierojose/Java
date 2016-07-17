package grafo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrafoA grafo = new GrafoA();
		String[] vertices_test = {"a","b","c","d","e"};
		int[][] arcos_test = {  
							{0,5,0,0,8},
							{5,0,0,10,4},
							{0,0,0,3,11},
							{0,10,3,0,6},
							{8,4,11,6,0}
						};
		
		grafo.InsertarVertice(vertices_test);
		grafo.InsertarArco(arcos_test);
		
		System.out.println("Num vertices->"+grafo.NumeroDeVertices());
		System.out.println("Num arcos   ->"+grafo.NumeroDeArcos());
		System.out.println("Es completa ->"+grafo.Completo());
		System.out.println("Grado de a  ->"+grafo.GradoDe("a"));
		System.out.println("Grado de a  ->"+grafo.GradoDe("b"));
		System.out.println("Grado de e  ->"+grafo.GradoDe("e"));
	}

}
