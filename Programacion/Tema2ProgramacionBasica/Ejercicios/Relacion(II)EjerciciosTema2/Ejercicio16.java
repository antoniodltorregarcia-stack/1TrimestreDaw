import java.util.Scanner;

/**
 * Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita
 * al usuario por teclado.
 * 
 * @author (Tony) 
 * @version (2.16)
 */
public class Ejercicio16 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        
        int n = sc.nextInt();
        
        int absoluto = (n < 0) ? -n : n;
        
        System.out.println("El valor absoluto es: " + absoluto);
    }
}