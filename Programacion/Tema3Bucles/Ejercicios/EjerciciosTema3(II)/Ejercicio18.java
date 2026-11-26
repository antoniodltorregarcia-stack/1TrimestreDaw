import java.util.Scanner;


/**
 * De forma similar a la Actividad de aplicación 3.17. implementa 1x1 algoritmo que calcule el mínimo común múltiplo de dos números dados.
 * 
 * @author (Tony) 
 * @version (3.18)
 */
public class Ejercicio18 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el número a");
        
        int a = sc.nextInt();
        
        System.out.println("Introduce el número b");
        
        int b = sc.nextInt();
        
        int mayor = a;
        
        if (b > a) {
            mayor = b;
        }
        
        int mcm = 0; 
        int cont = 1; 
        
        
        do {
            
            mcm = mayor * cont; 
            
            cont++; 
        } while (mcm % a != 0 || mcm % b != 0); 
        
        
        
        System.out.println("El mínimo común múltiplo es " + mcm);
    }
}