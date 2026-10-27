import java.util.Scanner;

/**
 * Escriba una aplicación que solicite el usuario un número comprendido entre 0 y 9.999.  
 * La aplicación tendrá que indicar si el número introducido es capicúa.
 * 
 * @author (Tony) 
 * @version (Ejercicio.2.11)
 */
public class Capicua {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un numero entre 0 - 9999");
        
        int n = sc.nextInt();
        
        int unid, dec, cent, mill;
        
        if (n < 0 || n > 9999) {
            System.out.println("Número no válido");
        } else {
            if (n > -1 && n < 10) {
                System.out.println("Los números de una cifra siempre son capicuas");
            } else if (n > 9 && n < 100) {
                unid = n / 10;
                dec = n % 10;
                
                if (unid == dec) {
                    System.out.println(n + " Es un número capicua");
                } else System.out.println(n + " No es un número capicua");
            } else if (n > 99 && n < 1000) {
                unid = n / 100;
                cent = n % 10;
                
                if (unid == cent) {
                    System.out.println(n + " Es un número capicua");
                }else System.out.println(n + " No es un número capicua");
            } else {
                unid = n / 1000;
                dec = (n / 100) % 10;
                cent = (n / 10) % 10;
                mill = n % 10;
                
                if (unid == mill && dec == cent) {
                   System.out.println(n + " Es un número capicua"); 
                }else System.out.println(n + " No es un número capicua");
            }
        }
    }
}