package package1;

public class circulo
	{
	public double radio;
	
	public circulo (int radio)//constructor1
		{
		this.radio=radio;
		}
	public circulo(){//constructor 2
		this(177048);
	}
	public double metodoArea() {
		return (Math.PI*(radio*radio));
	}
	public double metodoCircunferencia() {
		return ((2*Math.PI)*radio	);
	}
	}