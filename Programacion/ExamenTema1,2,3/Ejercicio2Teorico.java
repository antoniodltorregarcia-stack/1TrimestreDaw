import java.util.Scanner;

/**
 * Write a description of class Ejercicio2Teorico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2Teorico {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduce los segundos y te lo dire en horas/minutos/segundos");
        int seg = sc.nextInt();
        int mins = 0;
        int hora = 0;
        do {
            if (seg < 0) {
                System.out.println("Introduce los segundos y te lo dire en horas/minutos/segundos");
                seg = sc.nextInt();
            }   
        } while (seg < 0);
        
        double segdecimales = (double) seg;
        
        do {
            if (seg > 3599) {
                seg -= 3600;
                hora++;
            } else if (seg > 59) {
                seg -= 60;
                mins++;
            }
        } while (seg > 60);
        
        
        System.out.println(hora + " / " + mins + " / " + seg);
        System.out.println(segdecimales / 60 + "mins");
    }
}