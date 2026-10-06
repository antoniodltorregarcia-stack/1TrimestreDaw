import java.util.Scanner;

/**
 * Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10.
 * Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que el número
 * introducido se encuentra en el rango establecido. 
 * 
 * @author (Tony) 
 * @version (3.9)
 */
public class Ejercicio9 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero (1-10) y te dire su tabla");
        
        int n = sc.nextInt();
        
        if (n < 1 || n > 10) {
            System.out.println("Número no válido");
            return;
        }
        
        for (int i = 1; i < 11; i++) {
            if (i == 10) {
                System.out.println( n + " * " + i + " = " + n * i );
            } else System.out.println( n + " * " + i + "  = " + n * i );
        }
        
        
    }
}