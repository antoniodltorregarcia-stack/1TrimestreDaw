import java.util.Scanner;

/**
 * Solicita al usuario un número n y dibuja un triángulo de base y altura n.
 * de la forma (para n igual a 4):  
 * 
 * @author (Tony) 
 * @version (3.16)
 */
public class Ejercicio16{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime la base y altura de nuestro triangulo");
        
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
        
        /*
         * Primer bucle for para controlar las filas
         * 
         *  For que printea espacios el numero total de filas (n) menos la linea en la que nos encontramos
         *  es decir, linea 1, tenemos un total de 4 lineas, menos la linea 1 = For imprime 3 espacios.
         *  
         *  Una vez impresos los espacios necesarios imprimimos la cantidad de estrellas de la fila
         *  fila = 1 == estrella = 1, añadimos despues de ella un espacio para dejarlo mas bonito.
         *  
         *  Saltamos a la siguiente linea y repetimos todo el proceso
         *  
         *  Imagen final con n = 4
         *  
         *       * 
         *      * *
         *     * * *
         *    * * * * 
         */
    }
}