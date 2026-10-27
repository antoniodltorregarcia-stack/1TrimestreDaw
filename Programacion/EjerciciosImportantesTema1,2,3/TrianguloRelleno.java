import java.util.Scanner;

/**
 * Solicita al usuario un número n y dibuja un triángulo de base y altura n. de la forma (para n igual a 4):
 * 
 * @author (Tony) 
 * @version (3.16)
 */
public class TrianguloRelleno {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de la base y altura");
        
        int n = sc.nextInt();
        
        for (int fila = 0; fila <= n; fila++) { //filas
            
            for (int espacio = 0; espacio < n - fila; espacio++) {
                System.out.print(" ");
            }
            
            for (int asterisco = 0; asterisco < fila; asterisco++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}