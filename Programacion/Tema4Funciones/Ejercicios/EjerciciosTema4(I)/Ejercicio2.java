import java.util.Scanner;

/**
 * Crea un programa que imprima los numeros comprendidos entre a y b.
 * Los parámetros a y b son introducidos por usuario previamente.
 * 
 * @author (Tony) 
 * @version (Ejercicio2)
 */
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un número mínimo");
        
        int a = sc.nextInt();
        
        System.out.println("Introduce un número máximo");
        
        int b = sc.nextInt();
        
        parametros(a,b);
    }
    
    public static void parametros (int a, int b) {
        if (a > b) {
            System.out.println("El número máximo no puede ser menor que el mínimo");
        } else if (a == b) {
            System.out.println("El número máximo no puede ser igual que el mínimo");
        } else {
            System.out.println("Resultado:");
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}