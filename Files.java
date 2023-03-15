package EjerciciosAbstraccion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {
	private String nombres;
	private String nombreArchivo;
	private File usuarios;
	
	public Files(String nombres) {
		this.nombres = nombres;
		nombreArchivo = nombres + ".txt";
		usuarios = new File("C:\\Users\\maest\\eclipse-workspace\\main\\src\\EjerciciosAbstraccion\\usuarios", nombreArchivo);
		
		if(usuarios.exists()) {
			System.out.println("Se abrió correctamente el ususario:" + usuarios.getName());
			try {
				FileInputStream inStreamFile = new FileInputStream(usuarios);
				DataInputStream inStreamData = new DataInputStream(inStreamFile);
				int jugadas = inStreamData.readInt();
				int jugadasGanadas = inStreamData.readInt();
				System.out.println("Has jugado: " + jugadas + " veces");
				System.out.println("Has ganado: " + jugadasGanadas + " veces");
				
				inStreamData.close();
				inStreamData.close();
			}
			catch (IOException e) {
				e.getStackTrace();
			}
		}
		else {
			try {
				usuarios.createNewFile();
				System.out.println("Se ha creado y abierto un nuevo ususario con el nombre: " + usuarios.getName());
				FileOutputStream outStreamFile = new FileOutputStream(usuarios);
				DataOutputStream outStreamData = new DataOutputStream(outStreamFile);
				int jugadas=0;
				int jugadasGanadas=0;
				
				outStreamData.writeInt(jugadas);
				outStreamData.writeInt(jugadasGanadas);
				
				outStreamData.close();
				outStreamFile.close();
			}
			catch (IOException e) {
				e.getStackTrace();
			}
		}
	}
	public void mostrar(boolean victoria){
		try
		{
			FileInputStream inStreamFile = new FileInputStream(usuarios);
			DataInputStream inStreamData = new DataInputStream(inStreamFile);
			
			int vecesJugadas = inStreamData.readInt();
			int vecesGanadas = inStreamData.readInt();
			
			vecesJugadas = vecesJugadas+1;
			if (victoria)
			{
				vecesGanadas = vecesGanadas+1;
			}
			
			inStreamData.close();
			inStreamFile.close();
			
			FileOutputStream outStreamFile = new FileOutputStream(usuarios);
			DataOutputStream outStreamData = new DataOutputStream(outStreamFile);
			
			outStreamData.writeInt(vecesJugadas);
			outStreamData.writeInt(vecesGanadas);
			
			outStreamData.close();
			outStreamFile.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
