import java.util.Scanner;

/**
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 * 
 * @author (Tony) 
 * @version (3.12)
 */
public class Ejercicio12 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int suspenso = 0;
        System.out.println("Introduce las nota de los alumnos");
        
        for (int i = 0; i < 5; i++) {
            
            int n = sc.nextInt();
            
            if (n > 10 || n < 0) {
                System.out.println("Datos no validos");
                return;
            }
            
            if (n < 5) {
                System.out.println("Suspenso");
                suspenso++;
            } else System.out.println("Aprobado");
            
            
        }
        
        System.out.println("Cantidad de suspensos = " + suspenso);
    }
}