import java.util.Scanner;

/**
 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. Si no existen,
 * habra que indicarlo. Hay que tener en cuenta que las soluciones de una ecuación de 
 * segundo grado ax2+bx+c=0 son: 
 * 
 * @author (Tony) 
 * @version (2.8)
 */
public class Ejercicio8 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el valor (a)");
        
        int a = sc.nextInt();
        
        System.out.println("Dame el valor (b)");
        
        int b = sc.nextInt();
        
        System.out.println("Dame el valor (c)");
        
        int c = sc.nextInt();
        
        int discriminante = (b * b - 4 * a * c);
        
        /*
         * Si discriminante < 0, no hay soluciones reales.
         * Si discriminante = 0, hay una única solución real.
         * Si discriminante > 0, hay dos soluciones reales.
         */
        
        if (discriminante < 0) {
            System.out.println("No existe una solución real");
        } else {
            double raiz = Math.sqrt(discriminante);
            
            double solucion1 = (-b + raiz) / (2 * a);
        
            double solucion2 = (-b - raiz) / (2 * a);
            
            if (discriminante == 0) {
                System.out.println("La unica solución es " + solucion1);
            } else {
                System.out.println("La solución usando (+) es: " + solucion1);
                System.out.println("La solución usando (-) es: " + solucion2);
            }
            
        }
        
        
    }
}