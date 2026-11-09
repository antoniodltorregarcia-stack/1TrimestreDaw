import java.util.Scanner;

/**
 * Crea un método llamado crearTemperaturas que haga lo siguiente:
 * 
 *  1. Declare un array de números decimales (double[]) con espacio para 4 elementos.
 * 
 *  2. Guarde de forma manual (cajón por cajón) las siguientes temperaturas en
 *  el array: 15.5, 22.0, 18.2 y 25.4.
 * 
 *  3. Devuelva el array utilizando return.
 *  
 * @author (Tony) 
 * @version (Ejercicio1Gemini)
 */
public class Ejercicio1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        double t [] = new double [4];
        
        crearTemperaturas(t);
        
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }
    
    public static double [] crearTemperaturas (double t []) {
        
        t[0] = 15.5;
        t[1] = 22.0;
        t[2] = 18.2;
        t[3] = 25.4;
        
        return t;
    }
}