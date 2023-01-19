package package1;

public class circulo
	{
	public double radio;
	public double circunferencia;
	public double area;
	
	public circulo (int radio)
		{
		this.radio=radio;
		this.circunferencia=((2*Math.PI)*radio);
		this.area=(Math.PI*(radio*radio));
		}
	}
