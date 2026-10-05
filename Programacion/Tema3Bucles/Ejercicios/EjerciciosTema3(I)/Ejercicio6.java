import java.util.Scanner;

/**
 * Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 a n.
 * 
 * @author (Tony) 
 * @version (3.6)
 */
public class Ejercicio6 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime un número y te escribire los que me hagan falta pa llegar a el");
        
        int n = sc.nextInt();
        
        for (int contador = 0; contador <= n; contador++) {
            System.out.println(contador);
        }
        
        System.out.println("Listo!");
    }
}