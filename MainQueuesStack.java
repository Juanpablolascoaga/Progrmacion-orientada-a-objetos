package EjerciciosTareaQueuesStacks;

public class MainQueuesStack {
	
	public static void main(String[] args) {
		String cadena = "OIASFSN";

		MyQueues miqueues = new MyQueues(8);
		MyStack mistack = new MyStack(cadena.length());
		
		mistack.invertir(cadena);			
		
		if(mistack.palindromo(cadena)== true ) {
			System.out.println("la palabra: " + cadena + " es palindromo");
		}
		else {
			System.out.println("la palabra: " + cadena + " no es palindromo");
		}
		}
	}

