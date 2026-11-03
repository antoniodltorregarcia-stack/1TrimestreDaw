import java.util.Scanner;

/**
 *  Implementa la función static double distancla(double x1, double y1, double x2, double y2)
 *  que calcula y devuelve la distancia euclidea que separa los puntos (x1, y1) y (x2, y2).
 *  La fórmula para calcular esta distancia es:  distancia = √(𝑥1 − 𝑥2)2 + (𝑦1 − 𝑦2)2
 * 
 * @author (Tony) 
 * @version (4.12)
 */
public class Ejercicio12 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce x1");
        
        double x1 = sc.nextInt();
        
        System.out.println("Introduce y1");
        
        double y1 = sc.nextInt();
        
        System.out.println("Introduce x2");
        
        double x2 = sc.nextInt();
        
        System.out.println("Introduce y2");
        
        double y2 = sc.nextInt();
        
        System.out.println("Distacia euclidea = " + distacia(x1,x2,y1,y2));
        
    }
    
    public static double distacia (double x1, double y1, double x2, double y2) {
        double euclidea = Math.sqrt(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));

        
        return euclidea;
    }
}