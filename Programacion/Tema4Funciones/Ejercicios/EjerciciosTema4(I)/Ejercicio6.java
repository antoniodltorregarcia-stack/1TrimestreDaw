import java.util.Scanner;

/**
 *  Programa la función primo, que recibiendo un número entero, 
 *  devuelva un booleano que sea true cuando el parámetro de entrada sea primo.
 * 
 * @author (Tony) 
 * @version (Ejercicio6)
 */
public class Ejercicio6 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número y te dire si es primo");
        
        int n = sc.nextInt();
        
        System.out.println("¿El número " + n + " es primo? --> " + primo(n));
    }
    
    public static boolean primo (int n) {
        boolean esPrimo = false;
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        
        if (cont == 2) {
            esPrimo = true;
        }
        
        return esPrimo;
    }
}