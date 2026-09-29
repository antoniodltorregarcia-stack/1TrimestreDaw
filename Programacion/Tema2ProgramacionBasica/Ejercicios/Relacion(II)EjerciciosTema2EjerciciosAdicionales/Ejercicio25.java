import java.util.Scanner;

/**
 * Escribe un programa que lea millas como valor double de la consola y lo convierta en km mostrando el resultado.
 * La fórmula para la conversión es: 1 milla = 1.6 km
 * 
 * @author (Tony) 
 * @version (EjercicioAdicional25)
 */
public class Ejercicio25 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("millas:");
        
        double millas = sc.nextDouble();
        
        if (millas < 0) {
            System.out.println("El programa no acepta numeros negativos");
        }
        
        System.out.println(millas + " millas son = " + millas * 1.6 + "km");
    }
}