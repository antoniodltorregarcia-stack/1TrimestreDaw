import java.util.Scanner;

/**
 * Diseñar un programa que muestre, para cada número introducido por teclado, si es par,
 * si es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0.
 * 
 * @author (Tony) 
 * @version (3.1)
 */
public class Ejercicio1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        do {
            System.out.println("Dame un número");
            
            n = sc.nextInt();
            
            if (n == 0) {
                break;
            }
            
            if (n >= 0) {
                System.out.println(n + " Es positivo");
            } else System.out.println(n + " Es negativo");
            
            System.out.println("Su cuadrado es: " + n * n );
        } while (n != 0);
        
        System.out.println("Programa finalizado...");
    }
}