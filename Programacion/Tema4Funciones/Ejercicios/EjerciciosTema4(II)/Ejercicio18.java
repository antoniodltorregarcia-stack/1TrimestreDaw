import java.util.Scanner;
import java.util.Random;

/**
 * Crea una función que muestre por consola una serie de números aleatorios enteros.
 * Los parámetros de la función serán: la cantidad de números aleatorios que se 
 * mostrarán y los valores mínimos y máximos que estos  pueden tomar.
 * 
 * @author (Tony) 
 * @version (4.18)
 */
public class Ejercicio18 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce la cantidad de números aleatorios que quieres que muestre");
        
        int cantidad = sc.nextInt();
        
        System.out.println("Introduce el valor mínimo");
        
        int min = sc.nextInt();
        
        System.out.println("Introduce el valor máximo");
        
        int max = sc.nextInt();
        System.out.println("Numeros aleatorios : ");
        generarAleatorios(cantidad,min,max);
    }
    
    public static void generarAleatorios (int cantidad, int min, int max) {
        Random random = new Random();
        
        int nRandom = 0;
        
        for (int i = 0; i <= cantidad; i++) {
            
            do {
                nRandom = random.nextInt(max) + 1;
            } while (nRandom < min);
            
            System.out.print(nRandom + " ");
        }
    }
}