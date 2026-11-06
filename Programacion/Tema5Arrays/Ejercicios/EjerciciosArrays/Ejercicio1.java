import java.util.Scanner;
import java.util.Arrays;

/**
 * Realiza la función: int [] buscarTodos (int t[], int clave), que crea y devuelve una tabla con todos
 * los índices de los elementos donde se encuentra la clave de búsqueda. En el caso de que clave no se
 * encuentre en la tabla t, la función devolverá una tabla vacía. 
 * 
 * @author (Tony) 
 * @version (5.11)
 */
public class Ejercicio1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int t[] = new int [100];
        
        rellenarTabla(t);
        
        System.out.println("Introduce el número que deseas encontrar, si no se encuentra en el array no se pintara nada (0 - 100)");
        
        int clave = sc.nextInt();
        
        System.out.println("Array generado : ");
        
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
        
        int[] resultadoIndices = buscarTodos(t, clave);
        
        System.out.println("Índices donde se encuentra la clave: " + Arrays.toString(resultadoIndices));
    
    }
    
    public static int [] rellenarTabla (int t[]) {
        
        for (int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random() * 101);
        }
        
        return t;
    }
    
    public static int [] buscarTodos (int t[], int clave) {
        
        int contador = 0;
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contador++;
            }
        }
        
        int[] tablaIndices = new int[contador];
        
        
        int contador2 = 0; 
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                tablaIndices[contador2] = i; 
                contador2++; 
            }
        }
        
        return tablaIndices;
    }
}