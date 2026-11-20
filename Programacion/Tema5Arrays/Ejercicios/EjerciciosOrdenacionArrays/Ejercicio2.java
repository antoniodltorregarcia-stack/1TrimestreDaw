import java.util.Scanner;

/**
 * Tu objetivo (crea una función para cada tarea):
 * 
 * 1. eliminarProducto(int[] array, int idABorrar): Busca el idABorrar (por ejemplo, el 110).
 * Si existe, desplaza todos los elementos posteriores una posición a la izquierda para tapar su hueco,
 * y pon un -1 en la última posición ocupada.
 * 
 * • Resultado esperado tras borrar 110: {101, 105, 115, 120, -1, -1, -1}
 * 
 * 2. insertarOrdenado(int[] array, int nuevoId): Inserta un nuevo ID (por ejemplo, el 108) manteniendo el orden
 * de menor a mayor sin usar tu método de ordenación después. Tendrás que buscar su sitio, desplazar
 * los mayores hacia la derecha (si hay algún -1 libre al final) y colocarlo en su hueco.
 * 
 * • Resultado esperado tras insertar 108: {101, 105, 108, 115, 120, -1, -1}
 * 
 * @author (Tony) 
 * @version (Ejercicio2Ordenacion)
 */
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int[] estanteria = {101, 105, 110, 115, 120, -1, -1};
        
        System.out.println("Ids de la estanteria (-1 representa un espacio vacio) ");
        pintarArray(estanteria);
        System.out.println("Introduce el Id que desees eliminar");
        int idABorrar = sc.nextInt();
        estanteria = eliminarProducto(estanteria,idABorrar);
        pintarArray(estanteria);
        System.out.println("Introduce el Id que desees agregar");
        int nuevoId = sc.nextInt();
        estanteria = insertarOrdenado(estanteria,nuevoId);
        pintarArray(estanteria);
    }
    
    public static void pintarArray(int estanteria[]) {
        for(int i = 0; i < estanteria.length; i++) {
            System.out.print(estanteria[i] + " ");
        }
        
        System.out.println();
    }
    
    public static int [] eliminarProducto (int [] estanteria, int idABorrar) {
        //1. Creamos posicion para encontrar donde esta el idABorrar
        int posicion = -1; 
        
        //2. Bucle para encontrar la posicion
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] == idABorrar) {
                posicion = i;
            }
        }
        
        //3. Condicion para verificar que lo hemos encontrado
        if (posicion != -1) {
            //4. Bucle donde vamos mandando el idABorrar al final del todo
            for(int i = posicion; i < estanteria.length - 1; i++) {
                estanteria[i] = estanteria[i + 1];
            }
        }
        
        //5. Convertimos la ultima posición en -1
        estanteria[estanteria.length - 1] = -1;
        
        /*
         * • .length te dice cuántos cajones hay en total (7).
         * • .length - 1 te dice cuál es la etiqueta del último cajón (6).
         * 
         * Siempre que quieras tocar el último elemento de cualquier array en Java,
         * la fórmula mágica es array[array.length - 1].
         */
        
        return estanteria;
    }
    
    public static int [] insertarOrdenado(int[] estanteria, int nuevoId) {
        int posicion = -1;
        
        for(int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] == -1) {
                posicion = i;
                break;
            }
        }
        
        if (posicion != -1) {
            estanteria[posicion] = nuevoId;
        
            for(int i = posicion; i > 0; i--) {
                if (estanteria[i] < estanteria[i - 1]) {
                    int aux = estanteria[i];
                    estanteria[i] = estanteria[i - 1];
                    estanteria[i - 1] = aux;
                } else break;
            }
        } else System.out.println("La estaneria esta llena");
        
        return estanteria;
    }
}