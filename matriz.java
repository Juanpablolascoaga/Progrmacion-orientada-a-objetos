package matrices;

public class matriz {
		
		public static void main(String[] args) {
			metmatrices mismatrices = new metmatrices();
		int [][] A = {{3,5,4},{6,8,1}};
		int [][] B = {{6,7},{8,2},{9,1}};
		System.out.println("Multipliacion de matrices: ");
		int[][] matrizResultante = mismatrices.multiplicar(A,B);
		
		int[][] C = {{8,7,5,6},{8,4,2,1}};
		
		int [][] D = mismatrices.transponer(C);
	    System.out.println("Matriz transpuesta: ");
	    int[][] E = mismatrices.mostrarMatriz(D);
		
	    int[][] F = {{4,7,9},{7,9,3,},{6,7,4}};
	    System.out.println("suma de diagonal principal: ");
	    int sumaPrincipal = mismatrices.sumarDiagonal(F, "p");

	    int[][] G = {{3,7},{8,9}};
	    int valorMayor = mismatrices.elementoMayor(G);
	    
	    int[][] H = {{9,6},{4,7}};
	    int[][] I = {{3,2},{6,8}};
	    
	    int[][] sumaMatrices = mismatrices.sumaMatrices(H,I);
	    
	    int[][] J = {{3,7,6,},{8,1,9}};
	    int escalar= 2;
	    int matrizEscalar = mismatrices.multiplicarEscalar(J,escalar);
	    int mostrarEscalar = mismatrices.imprimirescalar(J);
	 }
}
