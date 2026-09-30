import java.util.Scanner;
import java.util.Random;

/**
 * Modifica la Actividad de aplicación 2.17 para que, además de los dos números aleatorios,
 * también aparezca la operación que debe realizar el jugador: suma. resta o multiplicación. 
 * 
 * @author (Tony) 
 * @version (2.18)
 */
public class Ejercicio18 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();
        
        int n1 = random.nextInt(99) + 1;
        
        int n2 = random.nextInt(99) + 1;
        
        System.out.println("Elige: 1 = suma , 2 = resta , 3 = multiplación");
        
        int opcion = sc.nextInt();
        
        if (opcion == 1) {
            int solucion = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = ");
            int respuesta = sc.nextInt();
            if (respuesta == solucion) {
                System.out.println("Acertaste");
            } else System.out.println("Error! la solución era: " + solucion);
        } else if (opcion == 2) {
            int solucion = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = ");
            int respuesta = sc.nextInt();
            if (respuesta == solucion) {
                System.out.println("Acertaste");
            } else System.out.println("Error! la solución era: " + solucion);
        } else if (opcion == 3) {
            int solucion = n1 * n2;
            System.out.println(n1 + " * " + n2 + " = ");
            int respuesta = sc.nextInt();
            if (respuesta == solucion) {
                System.out.println("Acertaste");
            } else System.out.println("Error! la solución era: " + solucion);
        } else System.out.println("Número no admitido");
    }
}