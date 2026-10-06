import java.util.Scanner;

/**
 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! 
 * Y es igual a 5 x 4 x 3 x 2 x 1 = 120.
 * 
 * @author (Tony) 
 * @version (3.11)
 */
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número y te calculo el factorial");
        
        int n = sc.nextInt();
        
        int total = 1;
        
        for (int i = n; i > 0; i--) {
            total *= i;
            
            if (i == 1) {
                System.out.print( i + " = ");
            } else System.out.print( i + " x ");
        }
        
        System.out.print(total);
    }
}