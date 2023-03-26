package Actividad_9;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
	 public void ejecutar() {
		 String ruta = ("C:\\Users\\maest\\eclipse-workspace\\main\\src\\Actividad_9\\Resultado_Fibonacci\\");
	        List<Integer> fibonacci = Fibonacci.fibSerie(2000000);

	        List<Integer> pares = Splitter.separarPares(fibonacci);
	        List<Integer> impares = Splitter.separarImpares(fibonacci);

	        escribirArchivo(ruta + "pares.txt", pares);
	        escribirArchivo(ruta + "impares.txt", impares);
	    }

	    private void escribirArchivo(String resultadosFigonacci, List<Integer> valores) {
	    	
	        try {
	        	File archivo = new File(resultadosFigonacci);
	            FileWriter writer = new FileWriter(archivo);
	          for (int num : valores) {
	                writer.write(num + "\n");
	            }
	            writer.close();
	            System.out.println("\n");
	            System.out.println("Archivo " + archivo.getAbsolutePath() + " creado exitosamente.");
	        } catch (IOException e) {
	            System.out.println("Error al escribir el archivo " + resultadosFigonacci);
	            e.printStackTrace();
	        }
	    }
	}
