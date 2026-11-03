import java.util.Scanner;

/**
 * Realiza una función que calcule el máximo común divisor de dos números.
 * 
 * @author (Tony) 
 * @version (Ejercicio 10)
 */
public class Ejercicio10 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el número a");
        
        int a = sc.nextInt();
        
        System.out.println("Introduce el número b");
        
        int b = sc.nextInt();
        
        System.out.println("El máximo común divisor es --> " + maximo(a,b));
    }
    
    public static int maximo (int a, int b) {
        int mayor = b;
        
        int cont = 1;
        
        int divisor = 0;
        
        if (a > b) {
            mayor = a;
        }
        
        do {
            if (a % cont == 0 && b % cont == 0) {
                divisor = cont;
            }
            cont++;
        } while (cont != mayor);
        
        return divisor;
    }
}