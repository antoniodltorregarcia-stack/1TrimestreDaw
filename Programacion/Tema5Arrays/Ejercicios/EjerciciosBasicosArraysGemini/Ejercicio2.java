import java.util.Scanner;

/**
 * Aprovechando el array de temperaturas que ya sabes crear, introduce un nuevo método
 * que calcule el promedio.
 * 
 * 1. Crea un método llamado calcularMedia que reciba como parámetro un array de decimales (double[] t).
 * 
 * 2. Dentro del método, utiliza un bucle for para sumar todas las temperaturas que contiene el array.
 * 
 * 3. Calcula la media aritmética (la suma total dividida entre el número de elementos,
 * que puedes obtener con t.length).4. Devuelve el resultado (un único número double) usando return.
 *  
 * @author (Tony) 
 * @version (Ejercicio2Gemini)
 */
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        double t [] = new double [4];
        
        crearTemperaturas(t);
        
        System.out.println("Datos introducidos");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        
        System.out.println();
        System.out.println("Media de temperaturas: " + calcularMedia(t));
    }
    
    public static double [] crearTemperaturas (double t []) {
        
        t[0] = 15.5;
        t[1] = 22.0;
        t[2] = 18.2;
        t[3] = 25.4;
        
        return t;
    }
    
    public static double calcularMedia (double t[]) {
        double suma = 0;
        
        for (int i = 0; i < t.length; i++) {
            suma += t [i];
        }
        
        double media = suma / t.length;
        return media;
    }
}
