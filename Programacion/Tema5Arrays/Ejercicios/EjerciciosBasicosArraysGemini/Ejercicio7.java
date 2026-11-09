import java.util.Scanner;

/**
 * 1. Crea un método llamado ordenarArrayDecreciente que reciba tu array double[] t.
 * 
 * 2. Escribe el primer bucle for con la variable i (va desde 0 hasta t.length - 1).
 * 
 * 3. Dentro, escribe el segundo bucle for con la variable j (empieza en i + 1 y va hasta t.length).
 * 
 * 4. Dentro del segundo bucle, añade el if. Recuerda: como queremos orden decreciente,
 * intercambiamos si el número en t[i] es menor que el de t[j] (if (t[i] < t[j])).
 * 
 * 5. Haz el intercambio usando la variable auxiliar con t[i] y t[j].
 * 
 * 6. Devuelve el array con return t;.
 *  
 * @author (Tony) 
 * @version (Ejercicio4Gemini)
 */
public class Ejercicio7 {
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
        
        System.out.println();
        System.out.print("Tabla ordenada decreciente: ");
        ordenarArrayDecreciente(t);
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }
    
    public static double [] ordenarArrayDecreciente (double t[]) {
        
        for (int i = 0; i < t.length -1; i++) {
            for (int j = i + 1; j < t.length; j++) {
               if (t[i] < t[j]) {
                   double auxiliar = t[i];
                   t[i] = t[j];
                   t[j] = auxiliar;
               }
            }
        }
        
        return t;
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
