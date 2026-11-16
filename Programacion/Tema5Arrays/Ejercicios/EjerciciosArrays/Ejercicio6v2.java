import java.util.Scanner;

public class Ejercicio6v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean[][] mapa = {
            {false, true,  false, false, false}, // 0 -> 1
            {false, false, true,  false, false}, // 1 -> 2
            {true,  false, false, true,  false}, // 2 -> 0 y 3
            {false, false, false, false, false}, // 3 -> sin salida
            {false, false, false, true,  false}  // 4 -> 3
        };
        
        System.out.println("Introduce el lugar de origen (0 a 4):");
        int x = sc.nextInt();
        System.out.println("Introduce el lugar de destino (0 a 4):");
        int y = sc.nextInt();
        
        System.out.println("¿Es posible viajar?: " + esPosibleViajar(mapa, x, y));
        sc.close();
    }

    public static boolean esPosibleViajar(boolean[][] mapa, int origen, int destino) {
        int totalLugares = mapa.length;
        
        // 1. Validar que los lugares existan
        if (origen < 0 || origen >= totalLugares || destino < 0 || destino >= totalLugares) {
            return false;
        }
        
        // 2. Herramientas para explorar
        boolean[] visitados = new boolean[totalLugares]; // Lugares ya pisados
        int[] pendientes = new int[totalLugares];        // Lista de lugares por revisar
        
        int inicioLista = 0; // Posición del siguiente lugar que vamos a revisar
        int finLista = 0;    // Posición donde guardaremos nuevos lugares descubiertos
        
        // Apuntamos el origen como el primer lugar pendiente y lo marcamos como visitado
        pendientes[finLista] = origen;
        finLista++;
        visitados[origen] = true;
        
        // 3. Mientras queden lugares en la lista de pendientes...
        while (inicioLista < finLista) {
            // Sacamos el siguiente lugar a revisar
            int actual = pendientes[inicioLista];
            inicioLista++;
            
            // Si hemos llegado al destino, terminamos con éxito
            if (actual == destino) {
                return true;
            }
            
            // Miramos a qué lugares podemos saltar desde 'actual'
            for (int siguiente = 0; siguiente < totalLugares; siguiente++) {
                if (mapa[actual][siguiente] && !visitados[siguiente]) {
                    visitados[siguiente] = true;      // Lo marcamos para no repetirlo
                    pendientes[finLista] = siguiente; // Lo añadimos a la lista de pendientes
                    finLista++;
                }
            }
        }
        
        // Si vaciamos la lista de pendientes y nunca encontramos el destino
        return false;
    }
}
