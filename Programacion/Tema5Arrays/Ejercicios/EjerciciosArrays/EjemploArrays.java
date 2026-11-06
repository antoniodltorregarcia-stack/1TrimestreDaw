import java.util.Scanner;

/**
 * Ejemplo de uso de arrays con funcion de pintar un Rectangulo.
 * 
 * @author (Tony) 
 * @version (EjemploArraysconFunciones)
 */
public class EjemploArrays {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int dimensiones[] = new int [2]; // en el 0 la anchura, en el 1 la altura
        
        System.out.println("Introduce la altura");
        int altura = sc.nextInt();
        
        System.out.println("Introduce la anchura");
        int anchura = sc.nextInt();
        
        dimensiones[0] = anchura;
        dimensiones[1] = altura;
        
        pintarRectangulo(dimensiones);
        
    }
    
    public static void pintarRectangulo (int dimensiones[]) {
        for (int i = 0; i < dimensiones[1]; i++) {
            
            for (int j = 0; j < dimensiones[0]; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}