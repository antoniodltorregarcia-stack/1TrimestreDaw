import java.util.Scanner;
import java.util.Arrays;

/**
 * Escribe la función void desordenar (int t[]), que cambia de forma aleatoria los elementos contenidos en la tabla t.
 * Si la tabla estuviera ordenada, dejaría de estarlo.
 * 
 * @author (Tony) 
 * @version (5.12)
 */
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int t [] = new int [10];
        
        rellenarTabla(t);
        
        System.out.println("Array generado");
        for (int i = 0; i < t.length; i++) {
            System.out.print (t[i] + " ");
        }
        
        System.out.println();
        System.out.println("Array desordenado");
        
        for (int i = 0; i < t.length; i++) {
            System.out.print (t[i] + " ");
        } 
        
    }
    
    public static int [] rellenarTabla (int t[]) {
        
        for (int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random() * 101);
        }
        
        return t;
    }
    
    public static void desordenar(int t[]) {
        
        for (int i = t.length - 1; i > 0; i--) { // (i == 10 - 1; i > 0; i--)
            
            int nuevaPosicion = (int) (Math.random() * (i + 1)); //Por cada vuelta i == a un número menor, generando menos posibilidades (explicado abajo)
             
            int posicionAuxiliar = t[i]; //Se genera para guardar el dato en el proceso
            t[i] = t[nuevaPosicion];
            t[nuevaPosicion] = posicionAuxiliar;
        }
        
        /* 
        * Algoritmo de Fisher-Yates: recorre el array desde el último elemento
        * hasta el primero. En cada paso, selecciona un índice aleatorio 
        * (nuevaPosicion) entre el elemento actual y el principio del array,
        * e intercambia sus valores usando una variable temporal.
        */
       
        /*
         * METODO int nuevaPosicion = (int) (Math.random() * (i + 1));
         * 
         * Como el bucle empieza en el final del array y va hacia atrás (i--),
         * el valor de i se reduce en cada vuelta. Esto altera el rango de la siguiente manera:
         * 
         * • Primera vuelta (i = 9): El rango es Math.random() * 10. Tras el (int),
         * genera un índice aleatorio entre 0 y 9. Puede elegir cualquier posición del array.
         * 
         * • Segunda vuelta (i = 8): El rango se reduce a Math.random() * 9. Genera un
         * índice entre 0 y 8. La última posición (9) ya ha quedado fija y "asegurada" 
         * para que no se vuelva a tocar.
         * 
         * • Tercera vuelta (i = 7): Genera un índice entre 0 y 7.
         * Las posiciones 8 y 9 ya están protegidas.
         */
    }
}