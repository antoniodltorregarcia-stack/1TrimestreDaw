import java.util.Scanner;
import java.util.Random;
/**
 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99)
 * que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto
 * o incorrecto.
 * 
 * @author (Tony) 
 * @version (2.17)
 */
public class Ejercicio17 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();
        
        int n1 = random.nextInt(99) + 1;
        
        int n2 = random.nextInt(99) + 1;
        
        int solucion = n1 + n2;
        
        System.out.println(n1 + " + " + n2 + " = ");
        
        int respuesta = sc.nextInt();
        
        if (solucion != respuesta) {
            System.out.println("Te equivocaste bobo, la solución es = " + solucion);
        } else System.out.println("¡¡¡Acertaste!!!!");
    }
}