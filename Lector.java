package Examen3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lector {
  
	public static void ejecutar(int Id) {
    String csvFile ="C:\\Users\\maest\\eclipse-workspace\\main\\src\\Examen3\\emails.csv" ; 
    File resultado = new File("C:\\Users\\maest\\eclipse-workspace\\main\\src\\Examen3", Id + ".txt");
    int filaInicial = Id % 1000;
    int filaFinal = filaInicial + 50;
    System.out.println(filaInicial);
    System.out.println(filaFinal);
    String line = "";
    String csvSplitBy = ",";
    int numRows = 5172;
    int numCols = 3000;
    int[][] datos = new int[numRows][numCols];
    String[] rowValues = null;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
    	line = br.readLine();
    	rowValues = line.split(csvSplitBy);
        int row = 0;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(csvSplitBy);
            for (int col = 1; col < numCols; col++) {
                datos[row][col - 1] = Integer.parseInt(values[col]);
            }
            
            row++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    int[] sumas = new int[numCols];
    for (int col = 0; col < numCols; col++) {
        for (int row = filaInicial; row < filaFinal; row++) {
            sumas[col] += datos[row][col];
        }
    }

    try (FileWriter writer = new FileWriter(resultado)) {
            for (int col = 0; col < numCols; col++) {	
            String palabra = rowValues[col+1]; // Obtiene la palabra correspondiente a la columna
            int suma = sumas[col];
            writer.write(palabra + ", " + suma + "\n");
        }
        writer.close();
        System.out.println("Resultados guardados en " + resultado);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}