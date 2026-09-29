import java.util.Scanner;

/**
 * Crea un programa llamado MostrarTiempo.java que tomando una cantidad por teclado de segundos
 * (entero positivo) muestre la cantidad de minutos y segundos contenidos
 * 
 * @author (Tony) 
 * @version (EjercicioAdicional26)
 */
public class Ejercicio26 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Segundos:");
        
        int seg = sc.nextInt();
        
        
        
        if (seg >= 60) {
            int mins = seg / 60;
            
            if (seg % 60 == 0) {
                System.out.println("Hay " + mins + " minutos exactos");
            } else {
                System.out.println("Hay " + mins + " minutos y " + seg % 60 + " segundos");
            }
        } else if (seg >= 0 && seg <= 59) {
            System.out.println("Hay " + seg + " segundos");
        } else System.out.println("No puede haber segundos negativos");
    }
}