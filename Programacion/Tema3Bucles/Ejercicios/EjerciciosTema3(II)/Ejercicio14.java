import java.util.Scanner;

/**
 * Realiza un programa que nos pida un minero n. y nos diga cuántos números hay entre I y n que sean primos.
 * Un número primo es aquel que solo es divisible por 1 y por él mis—mo. Veamos un ejemplo para n = 8:
 * 
 * @author (Tony) 
 * @version (3.14)
 */
public class Ejercicio14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número y te dire los primos que existen hasta el");
        
        int n = sc.nextInt();
        
        int primos = 0;
        
        for (int i = 1; i <= n; i++) {
            
            int cont = 0;
            
            for (int r = 1; r <= i; r++) {
                
                if (i % r == 0) {
                    cont++;
                }
                
            }
            
            if (cont == 2) {
                    System.out.println(i + " --> primo");
                    primos++;
            } else System.out.println(i + " --> no primo");
        }
        
        System.out.println("Resultan en un total de " + primos + " números primos");
    }
}