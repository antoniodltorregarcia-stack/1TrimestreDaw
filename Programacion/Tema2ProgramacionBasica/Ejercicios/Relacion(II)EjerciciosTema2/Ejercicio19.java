import java.util.Scanner;

/**
 * Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre
 * el equivalente en radianes. Si el ángulo introducido por el usuario no se encuentra en el rango de 00 a 3600. 
 * hay que transformarlo a dicho rango.  
 * 
 * Nota: El operador módulo puede ayudarnos a convertir un ángulo a su equivalente en el rango
 * comprendido de 00 a 3600.
 * 
 * @author (Tony) 
 * @version (2.19)
 */
public class Ejercicio19 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nº de grados = ");
        int n = sc.nextInt();
        
        double solucion = n * Math.PI / 180;
        
        System.out.println("Ángulo normalizado: " + n + " grados");
        System.out.println("Equivalente en radianes: " + solucion);
    }
}