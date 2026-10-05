import java.util.Scanner;

/**
 * Pedir diez números enteros por teclado y mostrar la media.
 * 
 * @author (Tony) 
 * @version (3.8)
 */
public class Ejercicio8 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame 10 numeros y te dare la media");
        
        int contador = 0;
        int n;
        int total = 0;
        
        do {
            
            n = sc.nextInt();
            
            total += n;
            
            contador++;
            
        }while (contador != 10);
        
        System.out.println("Media: " + total / contador);
    }
}