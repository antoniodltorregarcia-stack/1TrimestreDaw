import java.util.Scanner;

/**
 *  Programa un algoritmo que solicite un número iNumLados entre 1 y 10 
 *  y pinte en la pantalla con caracteres * un cuadrado de lado iNumLados.
 *  Por ejmplo, para iNumLados = 4
 *  
 *      ****
 *      ****
 *      ****
 *      ****
 * 
 * @author (Tony) 
 * @version (Adicional27)
 */
public class Ejercicio27 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un número entre 1 y 10");
        
        int n = sc.nextInt();
        
        if (n >= 1 && n <= 10) {
            
            for (int i = 0; i < n; i++) {
                for (int e = 0; e < n; e++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else System.out.println("Número no válido");
    }
}