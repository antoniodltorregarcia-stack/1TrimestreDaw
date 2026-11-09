import java.util.Scanner;

/**
 * 1. Modifica el método crearTemperaturas (o crea uno nuevo llamado rellenarPorTeclado).
 * 
 * 2. El método debe recibir por parámetro el array vacio double t[] y el objeto Scanner sc.
 * 
 * 3. Utiliza un bucle for que vaya desde 0 hasta t.length.
 * 
 * 4. Dentro del bucle, pide al usuario cada temperatura usando un mensaje en pantalla
 * (por ejemplo: "Introduce la temperatura " + (i + 1) + ": ") y guarda lo que escriba en
 * t[i] usando sc.nextDouble().
 *  
 * @author (Tony) 
 * @version (Ejercicio4Gemini)
 */
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        double t [] = new double [4];
        
        rellenarPorTeclado(t,sc);
        
        System.out.println(); 
        System.out.print("Datos introducidos: ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Media de temperaturas: " + calcularMedia(t));
        
        System.out.println();
        System.out.println("Temperatura máxima: " + obtenerMaximo(t));
    }
    
    public static double [] rellenarPorTeclado (double t [], Scanner sc) {
        
        for (int i = 0; i < t.length; i++) {
            System.out.println("Introduce la temperatura");
            t[i] = sc.nextDouble();
        }
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
    
    public static double obtenerMaximo (double t[]) {
        double maximo = t[0];
        
        for (int i = 0; i < t.length; i++) {
            if (t [i] > maximo) {
                maximo = t [i];
            }
        }
        
        return maximo;
    }
}
