import java.util.Scanner;

/**
 * Realizar de nuevo la tarea resuelta 2.3 considerando el
 * caso de que los números introducidos sean iguales.
 * 
 * @author (Tony) 
 * @version (2.6)
 */
public class Ejercicio6 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número");
        
        int n1 = sc.nextInt();
        
        System.out.println("Dime otro número distinto");
        
        int n2 = sc.nextInt();
        
        
        
        if (n1 > n2) {
            System.out.println(n1 + " Es mayor que " + n2);
        }else if (n1 == n2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println(n2 + " Es mayor que " + n1);
        }
    }
}