import java.util.Scanner;

/**
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que tener en cuenta que existen
 * meses con 28, 30 y 31 días (no se consideraran los años bisiestos)
 * 
 * @author (Tony) 
 * @version (2.12)
 */
public class Ejercicio12 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame en número dia, mes y año y te dire si existe ese dia");
        
        System.out.println("Dia:");
        
        int dia = sc.nextInt();
        
        
        
        System.out.println("Mes:"); 
        
        int mes = sc.nextInt();
        
        System.out.println("Año:");
        
        int anio = sc.nextInt();
        
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && anio >= 1) {
            
            if (dia > 28 && mes == 2) {
                System.out.println("Febrero no tiene mas de 28 dias");
            } else if (dia > 30 && mes == 4 || dia > 30 && mes == 6 || dia > 30 && mes == 9 || dia > 30 && mes == 10) {
                System.out.println("Este mes no contiene 31 dias");
            } else {
                System.out.println("Tu fecha: " + dia + "/" + mes + "/" + anio + " es correcta");
            }
            
        } else {
            System.out.println("Fecha no valida");
        }
        
    }
}