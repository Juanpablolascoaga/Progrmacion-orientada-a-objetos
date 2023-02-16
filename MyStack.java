package EjerciciosTareaQueuesStacks;

public class MyStack {
	char[] stack;
	int top;
	int max;
	int push;
	
	public  MyStack (int size) {
		this.top = 0;
		this.max = size;
		this.stack = new char [size];
		}
		
	public char pop(){ 
		if(top == 0) {
			System.out.println("Stack is empty"); 
			return ('#'); 
		}	
		else{ 
			top-- ;  
			char temp = stack[top];
			stack[top] = ' ';
			return temp;
			} 
		}
	public void push(char data) {
		if(top == max) {
			System.out.println("Stack is full"); 
		}	
		else{ 
			stack[top] = data;
			top++;
			} 
	}
	public String invertir(String cadena) {
		String inverso = "";
		for(int i=0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
			push(cadena.charAt(i));
			}
		int rep = top;
		for(int i=0;i < rep; i++) {
			inverso= inverso + pop();
		}
		return inverso;
		}
	public boolean palindromo(String cadena) {
		cadena = cadena.replace(" ", "");
		cadena = cadena.toLowerCase();
		System.out.println(cadena);
		String palabraInversa= invertir(cadena);
		return cadena.equals(palabraInversa);
	}
	
}