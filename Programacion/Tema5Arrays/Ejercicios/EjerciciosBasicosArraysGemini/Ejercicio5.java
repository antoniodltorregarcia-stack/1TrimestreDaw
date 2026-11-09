import java.util.Scanner;

/**
 * 1. Crea un método llamado obtenerPosicionMaximo que reciba el array double[] t.
 * 
 * 2. Crea una variable para recordar la posición del mayor (por ejemplo, int posMaximo = 0;),
 * asumiendo al principio que está en el primer cajón (el 0).
 * 
 * 3. Recorre el array con un bucle for (aquí sí te recomiendo empezar en i = 1).
 * 
 * 4. En el if, compara el elemento actual t[i] contra el elemento que esté en la posición
 * que consideras la mayor hasta ahora: t[posMaximo].
 * 
 * 5. Si encuentras uno mayor, actualizas tu variable con el índice actual:
 * posMaximo = i;.
 * 
 * 6. Al terminar el bucle, devuelve posMaximo (que será un número entero int)
 *  
 * @author (Tony) 
 * @version (Ejercicio4Gemini)
 */
public class Ejercicio5 {
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
