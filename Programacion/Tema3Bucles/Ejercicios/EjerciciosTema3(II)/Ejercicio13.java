import java.util.Scanner;

/**
 * Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado la hora, minutos y segundos,
 * asi como cuantos segundos se desea incrementar la hora ntrodu cida. La aplicación mostrara la nueva hora.
 * Por ejemplo, si las se incrementan en 10 segundos, resultan las 14:00:01
 * 
 * @author (Tony) 
 * @version (3.13)
 */
public class Ejercicio13 {
    public static void main(String[]args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);
        
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
        
        System.out.println("Dime cuantos segundos quieres añadir");
        
        int segsmas = sc.nextInt();
        
        
        System.out.println("Hora introducida: " + hora + "/" + mins + "/" + seg);
        
        for (int i = 0; i < segsmas; i++) {
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
            Thread.sleep(200);
            System.out.println(hora + ":" + mins + ":" + seg);
        }
        
        
        System.out.println("Hora + " + segsmas + " segundos: " + hora + ":" + mins + ":" + seg);
    }
}