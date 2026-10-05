import java.util.Scanner;

/**
 * Escribir todos los múltiplos de 7 menores que 100.
 * 
 * @author (Tony) 
 * @version (3.7)
 */
public class Ejercicio7 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
    
        for (int n = 1; n <= 100; n++) {
            if (n % 7 == 0) {
                System.out.println(n);
            }
        }
    }
}