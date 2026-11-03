import java.util.Scanner;

/**
 * Implementa la función divisoresPrImos () que muestra, por consola. todos los divisores primos
 * del número que se le pasa como parámetro. 
 * 
 * @author (Tony) 
 * @version (4.16)
 */
public class Ejercicio16 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        
        int n = sc.nextInt();
        
        divisoresPrimos(n);
    }
    
    public static void divisoresPrimos (int n) {
        
        for (int i = 2; i <= n; i++) {
            
            int cont = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            
            if (cont == 2) {
                System.out.print(i + " ");
            }
        }
    }
}