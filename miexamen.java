package Examen;

public class miexamen
{
	public String str;
	int i;
	
	public miexamen (String cadena2)
	{
		this.str=cadena2;
	} 
	public String primeraMayuscula() {
		String myString=str;
		myString=myString.substring(0,1).toUpperCase() + myString.substring(1);
		return myString;
}
	public String invertirCadena() {
		String myString ="";
		for (int i= str.length()-1; i>=0; i--) {
			myString += str.charAt(i);
		}
		return myString;
	}
	public String vocalesMayusculas() {
		String myString=str;
		myString = myString.replace('a', 'A');
		myString = myString.replace('e','E');
		myString = myString.replace('i','I');
		myString = myString.replace('o','O');
		myString = myString.replace('u','U');
		
		return myString;
	}
	public void fizzBuzz() {
		for (i=1;i <=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzBuzz");
			}
				else if(i % 3 == 0) {
					System.out.println("fizz");
				}
				else if(i % 5 == 0) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
			}
		}
	public boolean palindromo() {
		String myString=str;
		for(int i=0, j=myString.length()-1; i<=j; i++, j--) {
			if (myString.charAt(i)!= myString.charAt(j)) {
				return false;
			}
		}
	    return true;
	}
}