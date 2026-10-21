import java.util.Scanner;

/**
 * Realiza una mejora del programa anterior, solicitando el lado n del rombo,
 * un número filas y un número columnas para realizar una tabla de rombos.
 *
 * @author Tony
 * @version Adicional31
 */
public class Ejercicio31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el lado");
        int n = sc.nextInt();

        System.out.println("Introduce las filas");
        int filas = sc.nextInt();

        System.out.println("Introduce las columnas");
        int columnas = sc.nextInt();

        // Bucle principal para las filas de la tabla
        for (int f = 1; f <= filas; f++) {

            for (int i = 1; i <= n; i++) {

                for (int c = 1; c <= columnas; c++) {
                    
                    // 1. Espacios a la izquierda del rombo actual
                    for (int r = 1; r <= n - i; r++) {
                        System.out.print(" ");
                    }

                    // 2. Dibujo del rombo (asteriscos y hueco interno)
                    for (int e = 1; e <= (2 * i) - 1; e++) {
                        if (e == 1 || e == (2 * i) - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                    // 3. Espacios a la derecha para compensar y separar las columnas
                    // n - i (para terminar el bloque del rombo actual) + 
                    // n - i (margen izquierdo del siguiente rombo si lo hubiera)
                    for (int r = 1; r <= n - i; r++) {
                        System.out.print(" ");
                    }
                    
                    // Espacio fijo de separación entre columnas (ej. 2 espacios)
                    System.out.print("  "); 
                }
                // Salto de línea al terminar la sección horizontal de todos los rombos
                System.out.println();
            }

            for (int i = n - 1; i >= 1; i--) {

                for (int c = 1; c <= columnas; c++) {

                    // 1. Espacios a la izquierda del rombo actual
                    for (int r = 1; r <= n - i; r++) {
                        System.out.print(" ");
                    }

                    // 2. Dibujo del rombo (asteriscos y hueco interno)
                    for (int e = 1; e <= (2 * i) - 1; e++) {
                        if (e == 1 || e == (2 * i) - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                    // 3. Espacios a la derecha para compensar y separar las columnas
                    for (int r = 1; r <= n - i; r++) {
                        System.out.print(" ");
                    }
                    
                    // Espacio fijo de separación entre columnas
                    System.out.print("  ");
                }
                System.out.println();
            }
        }

    }
}
