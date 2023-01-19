package package1;

public class cuadrado
{
	public double lado;
	public long diagonal;
	public double perimetro;
	public double area;

	public cuadrado(int lado) 
		{
		this.lado=lado;
		this.diagonal= (long)Math.sqrt(2*(lado*lado));
		this.perimetro= lado*4;
		this.area= lado*lado;
		}
}

