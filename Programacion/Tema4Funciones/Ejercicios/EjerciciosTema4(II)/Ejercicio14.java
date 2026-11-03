import java.util.Scanner;

/**
 * Escribe una función a la que se pase como parámetros de entrada una cantidad de días, horas y minutos.
 * La función calculará y devolverá el número de segundos que existen en los datos de entrada 
 * 
 * @author (Tony) 
 * @version (4.14)
 */
public class Ejercicio14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime cuantos dias");
        
        int dia = sc.nextInt();
        
        System.out.println("Dime cuantas horas");
        
        int hora = sc.nextInt();
        
        System.out.println("Dime cuantos minutos");
        
        int minuto = sc.nextInt();
        
        System.out.println("Hay un total de " + segundos(dia,hora,minuto) + " segundos");
        
    }
    
    public static int segundos(int dia,int hora, int minuto) {
        int total = 0;
        
        hora += (dia * 24);
        
        minuto += (hora * 60);
        
        total = minuto * 60;
        
        return total;
        
    }
}