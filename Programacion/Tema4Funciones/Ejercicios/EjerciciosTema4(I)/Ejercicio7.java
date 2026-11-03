import java.util.Scanner;

/**
 * Realiza un programa que utilizando la función anterior,
 * use una función divisores para determinar el número de divisores
 * primos que tiene el parámetro de entrada.
 * 
 * @author (Tony) 
 * @version (Ejercicio7)
 */
public class Ejercicio7 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número y te dire si es primo");
        
        int n = sc.nextInt();
        
        System.out.println("¿El número " + n + " es primo? --> " + primo(n) + " || con un total de " + divisores(n) + " divisores");
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
    
    public static int divisores (int n) {
        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }
        
        return divisores;
        
    }
    

}