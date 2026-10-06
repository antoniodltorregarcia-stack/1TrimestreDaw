
/**
 * Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
 * 
 * @author (Tony) 
 * @version (3.14)
 */
public class Ejercicio14 {
    public static void main (String[]args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Tabla del " + i);
            System.out.println("");
            for (int r = 1; r < 11; r++) {
                if (r == 10) {
                    System.out.println( i + " * " + r + " = " + r * i );
                } else System.out.println( i + " * " + r + "  = " + r * i );
            }
            System.out.println("");
        }
    }
}