package package1;
import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		System.out.println("¿Que figura deseas calcular?");
		System.out.println("Cuadrado presione 1 O Circulo presione 2");
		System.out.print("Escriba su respuesta:");
		Scanner cal = new Scanner(System.in);
		double respuesta = cal.nextDouble();
		
		if(respuesta!=1||respuesta!=2) {
			System.out.println("escriba una opcion correcta");
	}
		 
		if (respuesta==1) {//cuadrado
			System.out.print("Ingrese la longitud del lado: ");
			Scanner lad= new Scanner(System.in);
			double lado = lad.nextDouble();
			cuadrado micuadrado= new cuadrado(lado);
			System.out.println("¿Que desea calcular?");
			System.out.println("Area presione 1");
			System.out.println("Perimetro presione 2");
			System.out.println("Diagonal presione 3");
			System.out.print("Escriba su respuesta:");
			Scanner respuesta1= new Scanner(System.in);
			Double metodo = respuesta1.nextDouble();
			if (metodo==1) {
				System.out.println(micuadrado.metodoArea());
			}
			if (metodo==2) {
				System.out.println(micuadrado.metodoPerimetro());
			}
			if(metodo==3) {
				System.out.println(micuadrado.metodoDiagonal());
			}
		}
			
			if (respuesta==2) {//circulo
				System.out.print("Ingrese el radio del circulo: ");
				Scanner rad= new Scanner(System.in);
				int radio = rad.nextInt();
				circulo micirculo = new circulo();
				System.out.println("que desea calcular?");
				System.out.println("Area precione 1");
				System.out.println("Circunferencia precione 2");
				Scanner respuesta2= new Scanner(System.in);
				double metodo = respuesta2.nextDouble();
				if (metodo==1) {
				System.out.println(micirculo.metodoArea());	
				}
				if (metodo==2) {
					System.out.println(micirculo.metodoCircunferencia());
				}
			}
		}	
	}
