import java.util.Scanner;

/**
 * Diseña una aplicación que dibuje el triángulo de pascal, para n filas. Numerando las filas V elementos desde O.
 * la próxia para obtener el m•ésimo elemento de la n•ésima fila es:
 * 
 * @author (Tony) 
 * @version (3.15)
 */
public class Ejercicio15 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de filas");
        
        int filas = sc.nextInt();
        
        for(int n = 0; n < filas; n++) {
            
            for(int m = 0; m <= n; m++) {
                
                int factorialN = 1;
                
                for(int i = 1; i <= n; i++){
                    factorialN *= i;
                }
                
                int factorialM = 1;
                
                for (int i = 1; i <= m; i++) {
                    factorialM *= i;
                }
                
                int factorialNM = 1;
                
                for (int i = 1; i <= (n - m); i++) {
                    factorialNM *= i;
                }
                
                int elemento = factorialN / (factorialM * factorialNM);
                System.out.print(elemento + " ");
            }
            
            System.out.println();
        }
        
        /*
         *  Primer for (n)  -> recorre las filas

            Segundo for (m) -> recorre los elementos de cada fila
            
            factorialN      -> calcula n!
            
            factorialM      -> calcula m!
            
            factorialNM     -> calcula (n-m)!
            
            elemento        -> aplica la fórmula del Triángulo de Pascal
            
            println()       -> pasa a la siguiente fila
         */
    }
}