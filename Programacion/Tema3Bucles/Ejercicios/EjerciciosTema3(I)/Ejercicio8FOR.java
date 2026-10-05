import java.util.Scanner;

/**
 * Pedir diez números enteros por teclado y mostrar la media.
 * 
 * @author (Tony) 
 * @version (3.8)
 */
public class Ejercicio8FOR {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame 10 numeros y te dare la media");
        
        int total = 0;
        
        for (int i = 0; i < 10; i++) {
            total += sc.nextInt();
        }
        
        //Es una forma más efectiva para un ejercicio de conteo
        //Se puede añadir el nextInt dentro del for
        
        System.out.println("Media: " + total / 10);
    }
}
