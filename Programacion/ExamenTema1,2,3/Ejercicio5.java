import java.util.Scanner;

/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (Antonio Jesús De La Torre García) 
 * @version (Ejercicio5)
 */
public class Ejercicio5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int objetivo;
        
        do {
            System.out.println("Introduce la temperatura objetivo entre (5) y (40)");
            objetivo = sc.nextInt();
            
            if (objetivo < 5 || objetivo > 40) {
                System.out.println("Error");
            }
            
        } while (objetivo < 5 || objetivo > 40);
        
        int centinela = 0;
        int temperatura = 0;
        int validas = 0;
        int maxima = 0;
        int encimaObjetivo = 0;
        int sumaTemp = 0;
        
        do {
            System.out.println("Introduce la temperatura (-100) para finalizar");
            centinela = sc.nextInt();
            
            if (centinela != -100) {
                temperatura = centinela;
                
                if (temperatura >= 5 && temperatura <= 40) {
                    validas++;
                    
                    if (temperatura > maxima) {
                        maxima = temperatura;
                    }
                    
                    if (temperatura > objetivo) {
                        encimaObjetivo++;
                    }
                    
                    sumaTemp += temperatura;
                }
            } else System.out.println("Temperatura no válida");
                
        } while (centinela != -100);
        
        double media = (double) sumaTemp / validas;
        
        if (validas == 0) {
            System.out.println("No se han introducido datos");
        } else {
            System.out.println("Cantidad de temperaturas validas: " + validas);
            System.out.println("Temperatura máxima: " + maxima);
            System.out.println("Cantidad de temperaturas por encima de objetivo: " + encimaObjetivo);
            System.out.println("Media temperaturas: " + media);
        }
        
    }
}