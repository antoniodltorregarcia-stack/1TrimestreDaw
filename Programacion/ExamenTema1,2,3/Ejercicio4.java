import java.util.Scanner;

/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (Antonio Jesús De La Torre García) 
 * @version (Ejercicio4)
 */
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Cantidad de bloques");
        int n = sc.nextInt();
        System.out.println("Longitud de bloques");
        int m = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print("#");
            } 
            System.out.println();
        }
    }
}