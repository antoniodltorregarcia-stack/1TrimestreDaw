import java.util.Scanner;

/**
 * Pedir dos números enteros y decir si son iguales o no
 * 
 * @author (Tony) 
 * @version (2.2)
 */
public class Ejercicio2
{
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número");
        
        int n1 = sc.nextInt();
        
        System.out.println("Dime otro número");
        
        int n2 = sc.nextInt();
        
        String resultado;
        
        if (n1 == n2) {
            resultado = "Son iguales";
        } else resultado = "No son iguales";
        
        System.out.println("El número " + n1 + " y " + n2 + " " + resultado);
    }
}