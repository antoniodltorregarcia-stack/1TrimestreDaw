import java.util.Scanner;

/**
 *  Realiza un programa que solicite al usuario un número N mayor que 1 y 
 *  posteriormente calcule los números primos entre 1 a N.
 * 
 * @author (Tony) 
 * @version (Adicional26)
 */
public class Ejercicio26 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta un número");
        
        int n = sc.nextInt();
  
        System.out.println("Listado de números primos hasta " + n);
        
        for (int i = 1; i <= n; i++) {
            int cont = 0;
            
            for (int e = 1; e <= i; e++) {
                if (i % e == 0) {
                    cont++;
                }   
            }
            
            if (cont == 2) {
                    System.out.println(i);
                }
        }
    }
}