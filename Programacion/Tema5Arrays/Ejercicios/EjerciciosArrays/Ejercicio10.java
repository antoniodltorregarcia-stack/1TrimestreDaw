import java.util.Arrays;
/**
 * La fusión de dos tablas ordenadas consiste en copiar todos sus elementos (de ambas tablas) en una tercera que deberá seguir ordenada.
 * Podemos realizar una fusión «ineficiente» copiando los elementos de ambas tablas (sin tener en cuenta el orden) en la tabla final y ordenar esta.
 * Existe una manera óptima de realizar la fusión en la que se elige en cada momento el primer elemento no copiado de alguna de las tablas
 * y se añade a la tabla final, que seguirá ordenada sin necesidad de ordenación alguna. Busca información sobre el algoritmo de fusión e
 * impleméntalo en Java.
 * 
 * @author (Tony) 
 * @version (5.20)
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        // Dos tablas previamente ordenadas
        int[] tabla1 = {1, 4, 7, 12, 20};
        int[] tabla2 = {2, 3, 7, 15, 25, 30};

        // Llamamos al método de fusión
        int[] tablaFusionada = fusionarTablas(tabla1, tabla2);

        // Mostramos el resultado por consola
        System.out.println("Tabla 1: " + Arrays.toString(tabla1));
        System.out.println("Tabla 2: " + Arrays.toString(tabla2));
        System.out.println("Tabla Fusionada: " + Arrays.toString(tablaFusionada));
    }

    public static int[] fusionarTablas(int[] t1, int[] t2) {
        // 1. Creamos la tercera tabla con la suma de tamaños
        int[] resultado = new int[t1.length + t2.length];

        // 2. Inicializamos los índices para cada array
        int i = 0; // Índice para t1
        int j = 0; // Índice para t2
        int k = 0; // Índice para resultado

        // 3. Comparamos elementos mientras queden datos en AMBAS tablas
        while (i < t1.length && j < t2.length) {
            if (t1[i] < t2[j]) {
                resultado[k] = t1[i];
                i++;
            } else {
                resultado[k] = t2[j];
                j++;
            }
            k++;
        }

        // 4. Si aún quedan elementos en t1, los copiamos todos
        while (i < t1.length) {
            resultado[k] = t1[i];
            i++;
            k++;
        }

        // 5. Si aún quedan elementos en t2, los copiamos todos
        while (j < t2.length) {
            resultado[k] = t2[j];
            j++;
            k++;
        }

        return resultado;
    }
}
