import java.util.Scanner;

/**
 * Pedir dos números y mostrarlos ordenados de forma decreciente.
 * 
 * @author (Tony) 
 * @version (2.5)
 */
public class Ejercicio5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame un número");
        
        int n1 = sc.nextInt();
        
        System.out.println("Dame otro número");
        
        int n2 = sc.nextInt();
        
        if (n1 > n2 ) {
            System.out.println(n1 + " > " + n2);
        } else if (n1 == n2) {
            System.out.println(n1 + " = " + n2);
        } else {
            System.out.println(n2 + " > " + n1);
        }
        
    }
}