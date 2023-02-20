package matrices;
import java.util.Scanner;


public class metmatrices
{
	private int[][] sumas;

	public int[][] multiplicar (int [][] A, int[][] B) {
		  int f1 = A.length;
		  int c1 = A[0].length;
		  int f2 = B.length;
		  int c2 = B[0].length;
		         
		  if (c1 != f2) {
		       //no se puede multiplicar
		  }
		     int[][]resultado = new int [f1][c2];
		     for (int i =0; i < f1; i++) {
		         for (int j =0; j < c2; j++) {
		             for (int k = 0; k < c1; k++) {
		                resultado[i][j] +=  A[i][k] * B[k][j];
		             }
		             System.out.print(resultado[i][j] + " ");
		         }
		         System.out.println("");
		     }
		  return resultado;
		}
	
	public int[][] transponer(int[][] C) {                             
        int[][] t = new int[C[0].length][C.length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                t[j][i] = C[i][j];
            }
        }
        return t;
    }
	public int[][] mostrarMatriz(int[][] D) {
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D[i].length; j++) {
                System.out.printf("%5d", D[i][j]);
            }
            System.out.println();
        }
		return D;
    }
	
	public int sumarDiagonal(int[][] E, String diagonal) {
		int filas= E.length;
		int columnas= E[0].length;
		int suma = 0;
		for (int y = 0; y < E.length; y++) {
            for (int x = 0; x < E[y].length; x++) {
                int numeroActual = E[y][x];
                System.out.print(numeroActual);
            }
            System.out.println();
        }
		if(filas==columnas) {
        suma = 0;
        if (diagonal.equals("p")) {
            int x = 0, y = 0;
            while (x < E.length && y < E[0].length) {
                suma += E[y][x];
                x++;
                y++;
            }
        }
        
        System.out.printf("La suma de la diagonal principal es %d",suma);
	}
		return suma;
}
	public int elementoMayor(int [][] F) {
		int filas = F.length;
		int columnas = F[0].length;
		int em = F[0][0];
		for(int i= 0; i<columnas; i++){
			for(int j= 0; j<columnas; j++) {
				em= F[i][j]	;	
			}
			System.out.println("\nEl elemento mayor es: " + em);
		}
		return em;
	}
	
	public int[][] sumaMatrices(int[][] G,int [][] H) {
		int[][] matrizSuma = new int[G.length][G[0].length];
		for (int y = 0; y < G.length; y++) {
		    for (int x = 0; x < G[y].length; x++) {
		        int numeroMatriz1 = G[y][x];
		        int numeroMatriz2 = H[y][x];
		        int suma = numeroMatriz1 + numeroMatriz2;
		        matrizSuma[y][x] = suma;
		    }
		}
		for (int y = 0; y < G.length; y++) {
		    for (int x = 0; x < G[y].length; x++) {
		        System.out.printf("%5d ", G[y][x]);
		    }
		    System.out.print(" | ");

		    for (int x = 0; x < H[y].length; x++) {
		        System.out.printf("%5d ", H[y][x]);
		    }
		    System.out.print(" = ");

		    for (int x = 0; x < matrizSuma[y].length; x++) {
		        System.out.printf("%5d ", matrizSuma[y][x]);
		    }
		    System.out.print(" | ");
		    System.out.println();
		}
		return matrizSuma;
	}
	public int multiplicarEscalar(int[][] pMatriz, int escalar){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] *= escalar;
            }
        }
		return escalar;
    }
	public int imprimirescalar(int[][] pMatriz){
		System.out.print("Multipliación matriz y escalar: ");
		System.out.println("");
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
		return 0;
    }
}

