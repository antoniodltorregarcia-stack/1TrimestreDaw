import java.util.Scanner;

/**
 * Diseñar una aplicación que solicite al usuario un número
 * e indique si es par o impar (50) 
 * 
 * @author (Tony) 
 * @version (2.1)
 */
public class Ejercicio1 {
    public static void main (String[]args) {
        /*
         * Entrada: Solicitamos un número
         * Salida: ponemos en pantalla "Tu número es" y añadimos si es par o impar
         * Proceso: Tendremos que determinar si el número introducido es divisible por 2
         * Persistencia: Hay que recordar el número que nos dan.
         */
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un número");
        
        int n = sc.nextInt(); //Se crea un numero (int) "n" el cual entra por el teclado
        
        String resultado; //Creamos una varible de texto
        
        
        if (n == 67) {
            System.out.println("SIIIX SEVEEEEN");
        }
        
        if (n % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }
        
        System.out.println("Tu número --> " + n + " es " + resultado);
        
    
    }
}