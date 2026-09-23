import java.util.Scanner;

/**
 * Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por teclado, que estará
 * comprendido entre 0 y 99.999.
 * 
 * @author (Tony) 
 * @version (2.9)
 */
public class Ejercicio9 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número comprendido entre 0 y 99.999");
        
        int n = sc.nextInt();
        
        int cifras = 0;
        
        if (n < 0 || n > 99999) {
            System.out.println("El número no esta comprendido entre 0 y 99.999");
            return;
        } //Usamos return para no mandar el mensaje de abajo, ya que esta es la excepción
        
        if (n >= 0 && n <= 9) {
            cifras = 1;
        } else if (n >= 10 && n <= 99) {
            cifras = 2;
        } else if (n >= 100 && n <= 999) {
            cifras = 3;
        } else if (n >= 1000 && n <= 9999) {
            cifras = 4;
        } else if (n >= 10000 && n <= 99999) {
            cifras = 5;
        }
        
        System.out.println("El número tiene " + cifras + " cifras");
        
        
        
    }
}