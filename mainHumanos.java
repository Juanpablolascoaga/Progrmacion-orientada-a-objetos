package EjerciciosAbstraccion;
import java.util.Random;
import java.util.Scanner;

public class mainHumanos{
	public static void main(String[] args) {
		System.out.println("Porfavor ingrese el nombre del ususario: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		Files miFiles = new Files(name);
		
		String[] nombres = {"SANTIAGO", "DIEGO","JUANPABLO", "ENRIQUE", "JOSE", "MARIA", "INGRITH", "BRENDA", "FATIMA", "SOFIA", "CAMILA", "SUSANA", "JOSHUA", "IVAN", "CARLO"};
		
		Humano[] participantes = new Persona[15];
		
		Random random = new Random(); 
		
		for(int i=0; i<10; i++) {
			String nombre= nombres[i];
			boolean trabaja= random.nextBoolean();
			boolean estudia= random.nextBoolean();
			boolean ejercita= random.nextBoolean();
			boolean viaja= random.nextBoolean();
			
		participantes[i] = new Persona(nombres[i],trabaja, estudia, ejercita ,viaja );
		
			for(int j=0; j<i; j++) {
			if (participantes[i].trabaja == participantes[j].trabaja && participantes[i].estudia == participantes[j].estudia && participantes[i].ejercita == participantes[j].ejercita && participantes[i].viaja == participantes[j].viaja) {
			trabaja = random.nextBoolean();
			estudia = random.nextBoolean();
			ejercita = random.nextBoolean();
			viaja = random.nextBoolean();
			participantes[i] = new Persona(nombres[i], trabaja, estudia, ejercita, viaja);
			j= -1;
			}
		}
		System.out.print(i + ". " +  participantes[i].getNombre() + ": ");
		if (trabaja==true) {
			System.out.print("trabaja" + ", ");
		}
		else {
			System.out.print("no trabaja" + ", ");
		}
		if (estudia==true) {
			System.out.print("estudia" + ", ");
		}
		else {
			System.out.print("no estudia" + ", ");
		}
		if (ejercita==true) {
			System.out.print("ejercita" + ", ");
		}
		else {
			System.out.print("no ejercita" + ", ");
		}
		if (viaja==true) {
			System.out.print("viaja");
		}
		else {
			System.out.print("no viaja");
		}
		System.out.println("");
		System.out.println("");
		}
		
		int contTrabajo = 0;
		int contEstudio = 0;
		int contEjercita = 0;
		int contViaja = 0;
		
		for(int h=0; h<10; h++) {
			if(participantes[h].getTrabaja()) {
				contTrabajo++;
			}
			if(participantes[h].getEstudia()) {
				contEstudio++;
			}
			if(participantes[h].getEjercita()) {
				contEjercita++;
			}
			if(participantes[h].getViaja()) {
				contViaja++;
			}
		}
		System.out.println("Usos de atributo trabaja: " + contTrabajo);
		System.out.println("Usos de atributo estudia: " + contEstudio);
		System.out.println("Usos de atributo ejercita: " + contEjercita);
		System.out.println("Usos de atributo viaja: " + contViaja);
		
		System.out.println("");
		
		int jugadorElegido = random.nextInt(10);
		System.out.println("Priemra pregunta: verdadero o falque que.... ");
		System.out.println("1: Trabaja?");
		System.out.println("2: Estudia?");
		System.out.println("3: Ejercita?");
		int resp = scan.nextInt();
		
		if(resp==1) {
			System.out.println(participantes[jugadorElegido].getTrabaja());
			System.out.println("");
			boolean respuesta1=participantes[jugadorElegido].getTrabaja();
			for(int i=0; i<10; i++) {
				if(participantes[i].getTrabaja()== respuesta1) {
					System.out.println(i + ". " + participantes[i].getNombre());
				}
			}
			System.out.println("");
			System.out.println("Segunda pregunta: verdadero o falque que....");
			System.out.println("2: Estudia?");
			System.out.println("3: Ejercita?");
			int resp2 = scan.nextInt();
			if(resp2==2) {
				System.out.println(participantes[jugadorElegido].getEstudia());
				System.out.println("");
				boolean respuesta2=participantes[jugadorElegido].getEstudia();
				for(int i=0; i<10; i++) {
					if(participantes[i].getEstudia()== respuesta2 && participantes[i].getTrabaja()==respuesta1) {
						System.out.println(i + ". " + participantes[i].getNombre());
					}
				}
				System.out.println("");
				System.out.println("tercera pregunta: verdadero o falque que....");
				System.out.println("3: Ejercita?");
				int resp3 = scan.nextInt();
				if(resp3==3) {
					System.out.println(participantes[jugadorElegido].getEjercita());
					System.out.println("");
					boolean respuesta3=participantes[jugadorElegido].getEjercita();
					for(int i=0; i<10; i++) {
						if(participantes[i].getEstudia()== respuesta2 && participantes[i].getTrabaja()==respuesta1 && participantes[i].getEjercita()==respuesta3) {
							System.out.println(i + ". " + participantes[i].getNombre());
						}
					}
					}
				}
			if(resp2==3) {
				System.out.println(participantes[jugadorElegido].getEjercita());
				System.out.println("");
				boolean respuesta3=participantes[jugadorElegido].getEjercita();
				for(int i=0; i<10; i++) {
					if(participantes[i].getEstudia()== respuesta3 && participantes[i].getTrabaja()==respuesta1) {
						System.out.println(i + ". " + participantes[i].getNombre());
					}
				}
				System.out.println("tercera pregunta: verdadero oflaso que....");
				System.out.println("2: Estudia?");
				int resp4 = scan.nextInt();
				if(resp4==2) {
					System.out.println(participantes[jugadorElegido].getEstudia());
					System.out.println("");
					boolean respuesta2=participantes[jugadorElegido].getEstudia();
					for(int i=0; i<10; i++) {
						if(participantes[i].getEstudia()== respuesta2 && participantes[i].getTrabaja()==respuesta1 && participantes[i].getEjercita()==respuesta3) {
							System.out.println(i + ". " + participantes[i].getNombre());
						}
					
					}
				}
			}
		}
		
		if(resp==2) {
			System.out.println(participantes[jugadorElegido].getEstudia());
			System.out.println("");
			boolean respuesta2=participantes[jugadorElegido].getEstudia();
			for(int i=0; i<10; i++) {
				if(participantes[i].getEstudia()== respuesta2) {
					System.out.println(i + ". " + participantes[i].getNombre());
				}
			}
			System.out.println("Segunda pregunta: verdadero o falque que....");
			System.out.println("1: Trabaja?");
			System.out.println("3: Ejercita?");
			int resp2 = scan.nextInt();
			if(resp2==1) {
				System.out.println(participantes[jugadorElegido].getTrabaja());
				System.out.println("");
				boolean respuesta1=participantes[jugadorElegido].getTrabaja();
				for(int i=0; i<10; i++) {
					if(participantes[i].getEstudia()== respuesta2 && participantes[i].getTrabaja()==respuesta1) {
						System.out.println(i + ". " + participantes[i].getNombre());
					}
				}
				System.out.println("tercera pregunta: verdadero o falque que....");
				System.out.println("3: Ejercita?");
				int resp3 = scan.nextInt();
				if(resp3==3) {
					System.out.println(participantes[jugadorElegido].getEjercita());
					System.out.println("");
					boolean respuesta3=participantes[jugadorElegido].getEjercita();
					for(int i=0; i<10; i++) {
						if(participantes[i].getEstudia()== respuesta2 && participantes[i].getTrabaja()==respuesta1 && participantes[i].getEjercita()==respuesta3) {
							System.out.println(i + ". " + participantes[i].getNombre());
						}
					}
				}
			}
			if(resp2==3) {
				System.out.println(participantes[jugadorElegido].getEjercita());
				System.out.println("");
				boolean respuesta3=participantes[jugadorElegido].getEjercita();
				for(int i=0; i<10; i++) {
					if(participantes[i].getEstudia()== respuesta2 && participantes[i].getEjercita()==respuesta3) {
						System.out.println(i + ". " + participantes[i].getNombre());
					}
				}
				System.out.println("tercera pregunta: ");
				System.out.println("1: Trabaja?");
				int resp4 = scan.nextInt();
				if(resp4==1) {
					System.out.println(participantes[jugadorElegido].getTrabaja());
					System.out.println("");
					boolean respuesta1=participantes[jugadorElegido].getTrabaja();
					for(int i=0; i<10; i++) {
						if(participantes[i].getEstudia()== respuesta2 && participantes[i].getEjercita()==respuesta3 && participantes[i].getTrabaja()==respuesta1) {
							System.out.println(i + ". " + participantes[i].getNombre());
						}
					}
			}
			}
		}
		
		if(resp==3) {
			System.out.println(participantes[jugadorElegido].getEjercita());
			System.out.println("");
			boolean respuesta3=participantes[jugadorElegido].getEjercita();
			for(int i=0; i<10; i++) {
				if(participantes[i].getEjercita()== respuesta3) {
					System.out.println(i + ". " + participantes[i].getNombre());
				}
			}
			System.out.println("Segunda pregunta: verdadero o falque que....");
			System.out.println("1: Trabaja?");
			System.out.println("2: Estudia?");
			int resp2 = scan.nextInt();
			if(resp2==1) {
				System.out.println(participantes[jugadorElegido].getTrabaja());
				System.out.println("");
				boolean respuesta1=participantes[jugadorElegido].getTrabaja();
				for(int i=0; i<10; i++) {
					if(participantes[i].getEjercita()== respuesta3 && participantes[i].getTrabaja()==respuesta1) {
						System.out.println(i + ". " + participantes[i].getNombre());
					}
				}
				System.out.println("tercera pregunta: verdadero o falque que....");
				System.out.println("2: Estudia?");
				int resp3 = scan.nextInt();
				if(resp3==2) {
					System.out.println(participantes[jugadorElegido].getEstudia());
					System.out.println("");
					boolean respuesta2=participantes[jugadorElegido].getEstudia();
					for(int i=0; i<10; i++) {
						if(participantes[i].getEjercita()== respuesta3 && participantes[i].getTrabaja()==respuesta1 && participantes[i].getEstudia()==respuesta2) {
							System.out.println(i + ". " + participantes[i].getNombre());
						}
					}
				}
			}
			if(resp2==2) {
				System.out.println(participantes[jugadorElegido].getEstudia());
				System.out.println("");
				boolean respuesta2=participantes[jugadorElegido].getEstudia();
				for(int i=0; i<10; i++) {
					if(participantes[i].getEstudia()== respuesta2 && participantes[i].getEjercita()==respuesta3) {
						System.out.println(i + ". " + participantes[i].getNombre());
					}
				}
				System.out.println("tercera pregunta: ");
				System.out.println("1: Trabaja?");
				int resp4 = scan.nextInt();
				if(resp4==1) {
					System.out.println(participantes[jugadorElegido].getTrabaja());
					System.out.println("");
					boolean respuesta1=participantes[jugadorElegido].getTrabaja();
					for(int i=0; i<10; i++) {
						if(participantes[i].getEstudia()== respuesta2 && participantes[i].getEjercita()==respuesta3 && participantes[i].getTrabaja()==respuesta1) {
							System.out.println(i + ". " + participantes[i].getNombre());
						}
					}
						}
					}
				}
		int resp1=0;
		boolean victoria = true;
		while(resp1 != jugadorElegido) {
		System.out.println("Escriba el numero del participante que crea que sea correcto: ");
		resp1 = scan.nextInt();

		if(resp1==jugadorElegido) {
			System.out.println("!!! ES CORRECTO, HAS GANADO¡¡¡");
			break;
		}
		else {
			System.out.println("!!! ES INCORRECTO, INTENTE NUEVAMENTE¡¡¡");
			victoria=false;
			}
		}
		miFiles.mostrar(victoria);
	}
}