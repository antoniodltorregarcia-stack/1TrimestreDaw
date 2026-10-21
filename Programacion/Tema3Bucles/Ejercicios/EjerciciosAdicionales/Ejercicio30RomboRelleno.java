import java.util.Scanner;

/**
 * Programa un algoritmo en Java que realice un rombo mediante el símbolo *
 * cuyo lado haya sido proporcionado previamente por el usuario.
 * El resultado sería aproximadamente:
 * 
 * @author (Tony) 
 * @version (Adicional30)
 */
public class Ejercicio30RomboRelleno {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño del lado");
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            for (int r = 1; r <= n - i; r++) {
                System.out.print(" "); 
            }
            
            for (int r = 1; r <= i; r++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int r = 1; r <= n - i; r++) {
                System.out.print(" "); 
            }
            
            for (int r = 1; r <= i; r++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
