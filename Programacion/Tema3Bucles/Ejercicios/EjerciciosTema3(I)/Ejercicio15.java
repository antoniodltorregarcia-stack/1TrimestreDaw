import java.util.Scanner;

/**
 * Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado utilizando para ello asteriscos (*).
 * Por ejemplo, para n = 4
 * ****
 * ***
 * **
 * *
 * 
 * @author (Tony) 
 * @version (3.15)
 */
public class Ejercicio15 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño de tu triangulo");
        
        int n = sc.nextInt();
        
        for (int i = n; i > 0; i--) {
            for (int r = 0; r < i; r++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}