import java.util.Scanner;

/**
 * Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
 * El programa deberá mostrar qué hora será un segundo más tarde. 
 * Por ejemplo: hora actual [10:41:59] → [10:42:00]
 * 
 * @author (Tony) 
 * @version (2.13)
 */
public class Ejercicio13 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime hora, minutos y segundos y le añadire un segundo más");
        System.out.println("Hora:");
        
        int hora = sc.nextInt();
        
        System.out.println("Minutos:");
        
        int mins = sc.nextInt();
        
        System.out.println("Segundos:");
        
        int seg = sc.nextInt();
        
        if (hora < 0 || hora > 24 || mins < 0 || mins > 59 || seg < 0 || seg > 59) {
            System.out.println("Formato no válido");
            return;
        }
        
        System.out.println("Hora introducida: " + hora + "/" + mins + "/" + seg);
        
        seg++;
        
        if (seg == 60) {
            seg = 0;
            mins++;
        }
        
        if (mins == 60) {
            mins = 0;
            hora++;
        }
        
        if (hora == 24) {
            hora = 0;
        }
        
        
        System.out.println("Hora + 1 segundo: " + hora + "/" + mins + "/" + seg);
    }
}