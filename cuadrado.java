package package1;

public class cuadrado
{
	public double lado;
	
	public cuadrado(double lado)//constructor 2 
		{
			this.lado=lado;
		}
	public cuadrado(){// constructor 2
		this(177048);
	}
	public double metodoArea() {
		return lado*lado;
	}
	public double metodoPerimetro() {
		return lado*4;
	}
	public double metodoDiagonal() {
		double acambiar=lado;
		long cambiado=(long)acambiar;
		return Math.sqrt(2*(cambiado*cambiado));
	}
	}
	