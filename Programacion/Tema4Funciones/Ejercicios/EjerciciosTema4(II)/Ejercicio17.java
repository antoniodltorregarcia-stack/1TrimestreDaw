import java.util.Scanner;

/**
 * Escribe una función que decida si dos números enteros positivos son amigos. 
 * Dos números a y b son amigos si la suma de los divisores propios (distintos de él mismo)
 * de a es igual a b. Y viceversa. Para probar se pueden usar los números 220 y 284. que son amigos. 
 * 
 * @author (Tony) 
 * @version (4.17)
 */
public class Ejercicio17 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el número a");
        
        int a = sc.nextInt();
        
        System.out.println("Introduce el número b");
        
        int b = sc.nextInt();
        
        System.out.println(a + " y " + b + " ¿son amigos? = " + amigos(a,b) );
    }
    
    public static boolean amigos (int a, int b) {
        int divisoresA = 0;
        int divisoresB = 0;
        boolean resultado = false;
        
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                divisoresA += i;
            }
        }
        
        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                divisoresB += i;
            }
        }
        
        if (divisoresA == b && divisoresB == a) {
            resultado = true;
        }
        
        return resultado;
    }
}