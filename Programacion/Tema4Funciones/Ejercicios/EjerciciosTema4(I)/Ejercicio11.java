import java.util.Scanner;

/**
 * La serie de Fibonacci es una seria de números que cumple la regla de que cualquier número
 * de la serie es el resultado de la suma de los dos números anteriores de la serie,
 * excepto los dos primeros que son números 1. Porlo tanto tiene este aspecto:
 * 
 * Fibonacci: 1,  1,  2,  3,  5,  8,  13,  21,  34,  …
 * 
 * Realiza una función que devuelva el número de la serie de fibonacci de la 
 * posición n (n sería el parámetro de entrada)
 * 
 * @author (Tony) 
 * @version (Ejercicio11)
 */
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un número y te dire en cual es en el legadp de fibonacci");
        
        int n = sc.nextInt();
        
        System.out.println("La posición de tu número es " + fibonacci(n));
    }
    
    public static int fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        
        int posicion = 0;
        for (int i = 1; num1 <= n; i++) {
            System.out.print(num1 + " ");
            
            int siguiente = num1 + num2;
            
            num1 = num2;
            
            num2 = siguiente;
            
            posicion++;
            
            /*
             *  Guardamos la suma de ambos números en una variable temporal
             *  (siguiente), y luego desplazamos los valores (num1 toma el 
             *  valor de num2, y num2 toma el valor de siguiente) para estar
             *  listos para la próxima vuelta del bucle.
             */
        }
        

        System.out.println("");
        return posicion;
    }
}