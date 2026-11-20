import java.util.Scanner;

/**
 * Imagina que tienes un array que representa las puntuaciones de un juego, pero se han colado algunos valores negativos (errores) y están desordenados.
 * 
 * 1. Filtrar (Eliminar): Crea un nuevo array que contenga solo los números positivos (mayores o iguales a 0).
 * El tamaño del nuevo array debe ser exacto (sin ceros sobrantes al final).
 * 
 * 2. Ordenar: Ordena ese nuevo array de menor a mayor.
 * 
 * 3. Mostrar: Imprime el resultado final por consola.
 * 
 * @author (Tony) 
 * @version (Ejer1Gemini)
 */
public class Ejercicio1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        //Array con el que trabajamos
        int[] puntuaciones = {45, -1, 12, 89, -5, 30, 12};
        
        puntuaciones = filtrarPositivos(puntuaciones);
        puntuaciones = ordenarMenorAMayor(puntuaciones);
        
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print(puntuaciones[i] + " ");
        }
    }
    
    public static int [] filtrarPositivos (int [] puntuaciones) {
        int longitud = 0;
        
        //1. Sacamos la longitud del Array que vamos a crear
        for (int i = 0; i < puntuaciones.length; i++) {
            if (puntuaciones[i] >= 0) {
                longitud++;
            }
        }
        
        //2. Creamos el nuevo Array con la longitud ya calculada
        int [] positivos = new int [longitud]; 
        
        //3. Creamos la posición en la que se encontrara el nuevo Array, empezara en 0
        int posicion = 0; 
        
        //4. Recorremos el Array anterior ahora sacando el nuevo
        for (int i = 0; i < puntuaciones.length; i++) {
            if (puntuaciones[i] >= 0) { //4.1 Si la puntuación es positiva...
                positivos[posicion] = puntuaciones[i]; //4.2 El nuevo Array adquirira el valor del anterior
                posicion++; //4.3 Ademas avanzara uno más
            }
        }
        
        return positivos;
        /*
         * 45 es positivo...
         * positivos[posicion(0)] = puntuaciones[i(0)]
         * posicion++;
         * 
         * -1 es negativo
         * puntuaciones[1] no se añade a ningun lugar...
         * 
         * 12 es positivo
         * positivos[posicion(1)] = puntuaciones[i(2)]
         * posicion++;
         * 
         */
    }
    
    public static int [] ordenarMenorAMayor (int [] puntuaciones) {
        
        for(int j = 0; j < puntuaciones.length - 1; j++) { //1. Bucle que repite el proceso para pillar todos los numeros
            for (int i = 0; i < puntuaciones.length - 1; i++) { //2. Bucle que recorre el Array al completo
                if (puntuaciones[i] > puntuaciones[i+1]) { //3. Condicion posicion[0] > posicion[1]
                    int aux = puntuaciones[i]; //4. Se crea el auxiliar para guardar el dato del número anterior
                    puntuaciones[i] = puntuaciones[i+1]; //5. posicion[0] que vale 45 pasa a ser la posicion[1] y la posicion[1] que valia 12 va a la posicion[0]
                    puntuaciones[i+1] = aux; //6. Para no perder el dato de la antigua posicion[0] llamamos al auxiliar
                }
            }
        }
        
        
        return puntuaciones;
    }
}