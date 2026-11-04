import java.util.Scanner;
import java.util.Random;

/**
 * Sobrecarga la función realizada en la Actividad de aplicación 4.18 para que el único parámetro
 * sea la cantidad de números aleatorios que se muestra por consola. Los números aleatorios
 * serán reales y estarán comprendidos entre 0 y 1.
 * 
 * @author (Tony) 
 * @version (4.18)
 */
public class Ejercicio19 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce la cantidad de números aleatorios que quieres que muestre");
        
        int cantidad = sc.nextInt();
    
        System.out.println("Numeros aleatorios : ");
        generarAleatorios(cantidad);
    }
    
    public static void generarAleatorios (int cantidad) {
        Random random = new Random();
        
        double nRandom = 0;
        
        for (int i = 0; i <= cantidad; i++) {
            nRandom = random.nextDouble();
            
            System.out.println(nRandom);
        }
    }
}
