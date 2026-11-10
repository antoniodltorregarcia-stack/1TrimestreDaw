import java.util.Scanner;

/**
 * El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar
 * encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio.
 * Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori,
 * no conoces el número de encuestados. Para finalizar la entrada de datos,
 * introduce un sueldo con valor -1.  Una vez terminada la entrada de datos,
 * muestra la siguiente información:
 * 
 * • Todos los sueldos introducidos ordenados de forma decreciente.
 * • El sueldo máximo y mínimo.  
 * • La media de los sueldos. 
 * 
 * @author (Tony) 
 * @version (5.14)
 */
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        double sueldo = 0;
        int posicion = 0;
        
        
        double t [] = new double [1000];
        
        do {
            System.out.println("Introduce tu sueldo");
            
            sueldo = sc.nextDouble();
            
            if (sueldo != -1) {
                t[posicion] = sueldo; 
                posicion++;
            }
        } while (sueldo != -1);
        
        System.out.println("Sueldo ordenados decrecientemente: ");
        ordenarDecreciente(t, posicion);
        for (int i = 0; i < posicion; i++) {
            System.out.print(t[i] + " ");
        }
        
        System.out.println();
        System.out.println("Sueldo máximo: " + t[0]);
        System.out.println("Sueldo mínimo: " + t[posicion - 1]);
        
        System.out.println("Media de los sueldos: " + mediaSueldos(t,posicion));
    }
    
    public static double[] ordenarDecreciente(double t [], int posicion ) {
        
        double minimo = t [0];
        
        for (int i = 0; i < posicion; i++) {
            for (int j = i + 1; j < posicion; j++) {
                // Si el elemento actual es menor que el siguiente, los intercambiamos
                if (t[i] < t[j]) {
                    double aux = t[i];
                    t[i] = t[j];
                    t[j] = aux;
                }
            }
        }
    
        return t;
    }
    
    public static double mediaSueldos (double t[], int posicion) {
        double suma = 0;
        
        for (int i = 0; i < posicion; i++) {
            suma += t[i];
        }
        
        return suma / posicion;
    }
    
    
}