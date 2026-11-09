import java.util.Scanner;

/**
 * Tu misión ahora es encontrar cuál es el número más grande dentro del array.
 * 
 * 1. Añade un método llamado obtenerMaximo que reciba como parámetro el array de decimales (double[] t).
 * 
 * 2. Crea una variable para almacenar provisionalmente el valor máximo 
 * (por ejemplo, double maximo = t[0];). Asumimos que el primero es el mayor antes de empezar a comparar.
 * 
 * 3. Utiliza un bucle for para recorrer el array (puedes empezar desde el índice 1
 * si quieres ahorrar una comparación) y, con un condicional if, comprueba si el elemento actual t[i]
 * es mayor que tu variable maximo. Si es así, actualizas la variable maximo.
 * 
 * 4. Devuelve ese valor máximo con return.
 *  
 * @author (Tony) 
 * @version (Ejercicio3Gemini)
 */
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        double t [] = new double [4];
        
        crearTemperaturas(t);
        
        System.out.println();
        System.out.println("Datos introducidos");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        
        System.out.println();
        System.out.println("Media de temperaturas: " + calcularMedia(t));
        
        System.out.println();
        System.out.println("Temperatura máxima: " + obtenerMaximo(t));
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
