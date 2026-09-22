import java.util.Scanner;

/**
 * Solicitar dos números distintos y mostrar cuál es el mayor
 * 
 * @author (Tony) 
 * @version (2.3)
 */
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número");
        
        int n1 = sc.nextInt();
        
        System.out.println("Dime otro número distinto");
        
        int n2 = sc.nextInt();
        
        if (n1 > n2) {
            System.out.println(n1 + " Es mayor que " + n2);
        } else {
            System.out.println(n2 + " Es mayor que " + n1);
        }
    }
}