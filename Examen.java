package Examen;
import java.util.Scanner;

public class Examen {
		public static void main(String[] args) {
			while(true) {
			System.out.println("Que opcion desea hacer:");
			System.out.println("Primera Mayuscula precione 1");
			System.out.println("Invertir Cadena precione 2");
			System.out.println("Vocales Mayusculas precione 3");
			System.out.println("FizzBuzz precione 4");
			System.out.println("Palindromo precione 5");
			System.out.println("Salir del programa precione 6");
			System.out.println("Escriba su respuesta:");
			Scanner respuesta = new Scanner(System.in);
			int resp = respuesta.nextInt();
			System.out.println("escriba su frase:  ");
			System.out.println("en caso de FizzBuzz y salir del programa escriba continuar");
			Scanner stringScreen = new Scanner(System.in);
			String  str = stringScreen.next();
			miexamen metexamen = new miexamen(str);
			switch(resp) {
			case 1:
				System.out.println(metexamen.primeraMayuscula());
				break;
			case 2:
				System.out.println(metexamen.invertirCadena());
				break;
			case 3:
				System.out.println(metexamen.vocalesMayusculas());
				break;
			case 4:
				metexamen.fizzBuzz();
				break;
			case 5:
				if(metexamen.palindromo() == true) {
					System.out.println("la palabra " + str + " es palindromo");
				}
				else {
					System.out.println("la palabra " + str + " no es palindromo");
				}
				break;
			case 6:
				System.out.println("Saliendo del programa......");
				System.exit(0);
			default: 
				System.out.println("escriba una opcion valida");
				break;
			}
		}
		}
	}

