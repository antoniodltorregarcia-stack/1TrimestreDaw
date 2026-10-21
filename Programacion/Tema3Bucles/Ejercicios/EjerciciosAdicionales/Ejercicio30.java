import java.util.Scanner;

/**
 * Programa un algoritmo en Java que realice un rombo mediante el símbolo *
 * cuyo lado haya sido proporcionado previamente por el usuario.
 * El resultado sería aproximadamente:
 * 
 * @author (Tony) 
 * @version (Adicional30)
 */
public class Ejercicio30 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño del lado");
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            for (int r = 1; r <= n - i; r++) { //Espacios externos
                System.out.print(" "); 
            }
            
            for (int e = 1; e <= (2 * i) - 1; e++) {
                if (e == 1 || e == (2 * i) - 1) { //limite (e) = doble (final) - 1 (antes que el final) 
                    System.out.print("*");
                } else System.out.print(" ");
            }
            
            System.out.println();
        }
        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int r = 1; r <= n - i; r++) {
                System.out.print(" "); 
            }
            
            for (int e = 1; e <= (2 * i) - 1; e++) {
                if (e == 1 || e == (2 * i) - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
