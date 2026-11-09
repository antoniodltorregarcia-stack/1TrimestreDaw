import java.util.Scanner;

/**
 * 1. Crea un método llamado ordenarDosPrimerosDecreciente que reciba tu array double[] t.
 * 
 * 2. Con un condicional if, comprueba si el número del primer cajón t[0] es menor que
 * el del segundo cajón t[1].
 * 
 * 3. Si es menor, significa que están mal ordenados (porque queremos que el mayor vaya primero).
 * Entra al if e intercambia sus valores usando una variable double aux como te acabo de mostrar arriba.
 * 
 * 4. Devuelve el array modificado con return t
 *  
 * @author (Tony) 
 * @version (Ejercicio4Gemini)
 */
public class Ejercicio6 {
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
        
        System.out.println();
        System.out.println("La temperatura máxima se encuentra en la posicion: " + obtenerPosicionMaximo(t));
        
        System.out.println();
        System.out.print("Tabla con los dos primeros ordenados: ");
        ordenarDosPrimerosDecreciente(t);
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        
        
    }
    
    public static double [] ordenarDosPrimerosDecreciente (double t[]) {
        
        if (t[0] > t[1]) {
            double auxiliar = t[0];
            t[0] = t[1];
            t[1] = auxiliar;
        }
        
        return t;
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
    
    public static int obtenerPosicionMaximo (double t[]) {
        double maximo = t [0];
        int posicionMaximo = 0;
        
        for (int i = 1; i < t.length; i++) {
            if (t [i] > maximo) {
                maximo = t [i];
                posicionMaximo = i;
            }
        }
        
        
        return posicionMaximo + 1;
    }
}
