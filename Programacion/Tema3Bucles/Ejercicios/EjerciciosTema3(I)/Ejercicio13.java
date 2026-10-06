import java.util.Scanner;

/**
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual a cuatro) y suspensos.
 * 
 * @author (Tony) 
 * @version (3.12)
 */
public class Ejercicio13 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int suspenso = 0;
        int condicionado = 0;
        int aprobado = 0;
        
        System.out.println("Introduce las nota de los alumnos");
        
        for (int i = 0; i < 6; i++) {
            
            int n = sc.nextInt();
            
            if (n > 10 || n < 0) {
                System.out.println("Datos no validos");
                return;
            }
            
            if (n < 4) {
                System.out.println("Suspenso");
                suspenso++;
            } else if (n == 4) {
                System.out.println("Condicionado");
                condicionado++;
            } else {
                System.out.println("Aprobado");
                aprobado++;
            }
            
            
        }
        
        System.out.println("Cantidad de suspensos = " + suspenso);
        System.out.println("Cantidad de condicionados = " + condicionado);
        System.out.println("Cantidad de aprobados = " + aprobado);
    }
}
