package package1;

public class mian_cuadrado{
	public static void main(String[] args) {
		cuadrado resultado= new cuadrado (25000);
		System.out.println("         Cuadrado:");
		System.out.print("lado: ");System.out.println(resultado.lado);
		System.out.print("diagonal: ");System.out.println(resultado.diagonal);
		System.out.print("perimetro: ");System.out.println(resultado.perimetro);
		System.out.print("area: ");System.out.println(resultado.area);
		
		circulo resultado2= new circulo(25000);
		System.out.println("         Circulo:");
		System.out.print("radio: ");System.out.println(resultado2.radio);
		System.out.print("circunferencia: ");System.out.println(resultado2.circunferencia);
		System.out.print("area: ");System.out.println(resultado2.area);
	}
}
