package Actividad_9;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> fibSerie(int valorMaximo) {
        List<Integer> serieFib = new ArrayList<>();
        int a = 0, b = 1, c, cantidadValores=0;
        while (a <= valorMaximo) {
            serieFib.add(a);
            c = a + b;
            a = b;
            b = c;
            cantidadValores ++;
        }
        System.out.println("Serie Fibonacci: " + "\n" + serieFib);
        System.out.println("cantidad de valores en la serie: " + cantidadValores);
        return serieFib;
    }
}