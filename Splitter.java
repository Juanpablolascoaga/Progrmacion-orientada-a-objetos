package Actividad_9;

import java.util.ArrayList;
import java.util.List;

public class Splitter {
    public static List<Integer> separarPares(List<Integer> serieFib) {
        List<Integer> pares = new ArrayList<>();
        int cantidadPares=0;
        for (int valores : serieFib) {
            if (valores % 2 == 0) {
                pares.add(valores);
                cantidadPares ++;
            }
        }
        System.out.println("\n");
        System.out.println("Valores par en la serie: " + "\n" + pares);
        System.out.println("Cantidad de valores Par en la serie: " + cantidadPares);
        return pares;
    }
    
    public static List<Integer> separarImpares(List<Integer> serieFib) {
        List<Integer> impares = new ArrayList<>();
        int cantidadImpares=0;
        for (int valores : serieFib) {
            if (valores % 2 != 0) {
                impares.add(valores);
                cantidadImpares ++;
            }
        }
        System.out.println("\n");
        System.out.println("Valores Impar en la serie: " + "\n" + impares);
        System.out.println("Cantidad de valores Impar en la serie: " + cantidadImpares);
        return impares;
    }
}

