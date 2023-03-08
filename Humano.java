package EjerciciosAbstraccion;

public abstract class Humano {
	protected String nombre;
	protected boolean trabaja;
	protected boolean estudia;
	protected boolean ejercita;
	protected boolean viaja;
	
	public Humano(String nombre, boolean trabaja, boolean estudia, boolean ejercita, boolean viaja) {
		this.nombre=nombre;
		this.trabaja=trabaja;
		this.estudia=estudia;
		this.ejercita=ejercita;
		this.viaja=viaja;
		}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public boolean getTrabaja(){
		return trabaja;
	}
	public void setTrabaja(boolean trabaja) {
		this.trabaja=trabaja;
	}
	public boolean getEjercita() {
	    return ejercita;
	}
	public void setEjercita(boolean ejercita) {
		this.ejercita=ejercita;
	}
	public boolean getEstudia() {
		return estudia;
	}
	public void setEstudia(boolean estudia) {
		this.estudia=estudia; 
	}
	public boolean getViaja() {
		return viaja;
	}
	public void setViaja(boolean viaja) {
		this.viaja=viaja;
	}
	
}