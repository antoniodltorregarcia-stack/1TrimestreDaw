import java.util.Scanner;

/**
 * Escriba una aplicación que solicite el usuario un número comprendido entre 0 y 9.999.
 * La aplicación tendrá que indicar si el número introducido es capicúa.
 * 
 * @author (Tony) 
 * @version (2.11)
 */
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un numero entre 0 y 9999 y te dire si es capicúa");
        
        int n = sc.nextInt();
        
        if (n < 0 || n > 9999) {
            System.out.println("Número fuera de rango");
            return;
        }
        
        if (n < 10) {
            System.out.println("Todos los números con una cifra son capicúa");
        } else if (n >= 10 && n <= 99) {
            
            int unid = n / 10;
            int dece = n % 10;
            
            if (unid == dece) {
                System.out.println("El numero " + n + " es capicúa");
            } else System.out.println("El numero " + n + " no es capicúa");
            
        } else if (n >= 100 && n < 999) {
            
            int unid = n / 100;
            int cent = n % 10;
            
            if (unid == cent) {
                System.out.println("El numero " + n + " es capicúa");
            } else System.out.println("El numero " + n + " no es capicúa");
            
            
        } else {  
            
            int unid = n / 1000;
            int dec = (n/100) % 10;
            int cent = (n/10) % 10;
            int mill = n % 10;
            
            
            if (unid == mill && dec == cent) {
                System.out.println("El numero " + n + " es capicúa");
            } else System.out.println("El numero " + n + " no es capicúa");
            
        }
        
        //Revisar Ejercicio y tomar anotaciones calculo de unidades
    }
}