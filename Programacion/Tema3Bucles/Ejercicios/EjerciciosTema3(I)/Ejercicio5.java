import java.util.Scanner;

/**
 *  Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
 *  El jugador tendrá que introducir la solución de la suma de dos números aleatorios
 *  comprendidos entre 1 y 100. Mientras la solución introducida sea correcta, el juego continuará.
 *  En caso contrario, el programa terminará y mostrará el número de operaciones realizadas correctamente.
 * 
 * @author (Tony) 
 * @version (3.5)
 */
public class Ejercicio5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Bienvenido al juego de la suma");
        
        int solucion;
        int n;
        int aciertos = 0;
        
        do {
            int n1 = (int)(Math.random() * 101);
            int n2 = (int)(Math.random() * 101);
            
            System.out.println(n1 + " + " + n2);
            solucion = n1 + n2;
            
            n = sc.nextInt();
            
            if (n == solucion) {
                aciertos++;
            }
            
        } while (n == solucion);
        
        System.out.println("Fallaste!!! la solución era: " + solucion);
        System.out.println("Nº de aciertos: " + aciertos);
    }
}